
/* * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.GroupLayout;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
/**
 *
 * @author Tristan
 */
public class Controleur implements Serializable {
    private Utilisateur utilisateur;
    private VuePrincipale vue;
    private ArrayList<Produit> listeProduits;
    private HashMap<Produit,Integer> factureEnCours;
    
    public Controleur() {
        System.out.println("OK");
        vue = new IHMconnection(this);
        
        initialisationDonnees();
    }

    int getPrix(String produit) {
        int prix = 0;
        for(Produit p : listeProduits){
            if(p.getNom().equals(produit)){
                prix = (int) p.getPrix();
            }
        }
        return prix;
    }
    
    public ArrayList<String> getListeProduit() {
        ArrayList<String> liste;
        liste = new ArrayList<>();
        for (Produit p : listeProduits) {
            liste.add(p.getNom());
        }
        return liste;
    }

    /**
     * Author : TdF
     * Permet de diminuer la quantité de produit en fonction de la quantité vendu.
    */
    void decroitStock(String produit, Integer quantite) {
        for(Produit p : listeProduits){
            if(p.getNom().equals(produit)){
                p.setStockVitrine(p.getStockVitrine() - quantite);
            }
        } 
    }
    
    /**
     * Author : TL
     */
    public void seDeconnecter() {
        this.vue.setVisible(false);
        this.vue = new IHMconnection(this);
        this.utilisateur = null;
    }
    
    /**
     * Author TL
     * Retourne un hashMap constitué en clé du type de viennoiserie et en valeur d'un array liste contenant toutes les fournées de la viennoiserie correspondante
     * @return HashMap<ListeViennoiseries,ArrayList<String[]>>
     */
    public HashMap<ListeViennoiseries,ArrayList<String[]>> getInfosFournees() {
        HashMap<ListeViennoiseries,ArrayList<String[]>> bla = new HashMap();
        for (Produit p : listeProduits) {
            if (p.getBorV().equals("Viennoiserie")) {
                bla.put(((Viennoiserie)p).getType(), ((Viennoiserie)p).getInfosFournees());
            }
        }
        return bla;
    }
    
    /**
     * Author TL
     * Retourne un hashMap constitué en clé du type de viennoiserie et en valeur tableau contenant les infos de la viennoiserie correspondante
     * @return HashMap<ListeViennoiseries,String[]>
    */
    public HashMap<ListeViennoiseries, String[]> getInfosViennoiseries() {
        HashMap<ListeViennoiseries,String[]> bla = new HashMap();
        for (Produit p : listeProduits) {
            if (p.getBorV().equals("Viennoiserie")) {
                bla.put(((Viennoiserie)p).getType(), ((Viennoiserie)p).getInfos());
            }
        }
        return bla;
    }
    
    /**
     * Author TL
     * Retourne un hashMap constitué en clé du type de viennoiserie et en valeur tableau contenant les infos de la boisson correspondante
     * @return HashMap<ListeViennoiseries,String[]>
    */
    public HashMap<ListeBoissons, String[]> getInfosBoisson() {
        HashMap<ListeBoissons,String[]> bla = new HashMap();
        for (Produit p : listeProduits) {
            if (p.getBorV().equals("Boisson")) {
                bla.put(((Boisson)p).getType(), ((Boisson)p).getInfos());
            }
        }
        return bla;
    }
    
    /**
     * Author : TL
     * cherche l'utilisateur passé en paramètre, puis s'il est trouvé, lance la fenetre du type d'utilisateur.
     * @param nom nom de l'utilisateur
     * @param mdp mot de passe de l'utilisateur
     */
    void connexion(String nom, char[] mdp) {
        String rep = chercheUtilisateur(nom, mdp);
        if (rep.equals("pasTrouve")) {
            vue.afficheErreur("L'utilisateur n'a pas été trouvé");
        } else {
            vue.setVisible(false);
            if (rep.equals(ListeUtilisateurs.Manager.toString())) {
                vue = new IHMManageur(this);
            } else if (rep.equals(ListeUtilisateurs.OperateurDeCuisson.toString())) {
                vue = new IHMOperateur(this);
            } else if (rep.equals(ListeUtilisateurs.Vendeur.toString())) {
                vue = new IHMVendeurAlertes(this);
            }
        }
    }

    /**
     * Author : TL
     * Cherche dans le fichier utilisateur si la personne passé en paramètre y est
     * @param nom nom de l'utilisateur
     * @param mdp mdp de l'utilisateur
     * @return String : "pasTrouve" si l'utilisateur n'a pas été trouvé, sinon le type d'utilisateur (Manager, OC, vendeur)
     */
    private String chercheUtilisateur(String nom, char[] mdp) {
        String ret = "pasTrouve";
        
        String fichier ="users.txt";
		
	//lecture du fichier texte	
	try{
		InputStream ips=new FileInputStream(fichier); 
		InputStreamReader ipsr=new InputStreamReader(ips);
		BufferedReader br=new BufferedReader(ipsr);
		String ligne;
		while ((ligne=br.readLine())!=null){
			String phrase[] = ligne.split(":");
                        if (phrase[0].equals(nom)) {
                            ret = phrase[2];
                        }
		}
		br.close(); 
	}		
	catch (Exception e){
		System.out.println(e.toString());
	}
        
        return ret;
        
    }
    /**
     * Author : MB
     * @param produit
     * @param listehoraire
     * @return 
     * Retourne le hashmap des horraires et remplace le stock horraire 
     * par heure existant par celui passe en parametre
     */
    public HashMap modifierStockHoraire(Produit produit, HashMap listehoraire){
        
       Map<Integer,Integer> horaire = new HashMap<Integer,Integer>();
       horaire=listehoraire;
       for (Map.Entry<Integer, Integer> me : horaire.entrySet()) {
           int key = me.getKey();
           int value = me.getValue();
           if(produit.getStockMin(key)!=value){
               produit.modificationCreneau(key,value);
           }            
        }
        return stockHoraire(produit);
    }
    /**
     * Author : MB
     * @param produit
     * @return 
     * Retourne une liste de stock horraire pour un produit
     */
    public HashMap<Integer, Integer> stockHoraire(Produit produit){
        return produit.getStockVitrineMin();
    }
    
    /**
     * Author : TdF
     * @param produit
     * @return retour
     * Retourne un boolean indiquant si le produit a dépassé le stock minimal de produit nécessaire en rayon
     */
    public boolean verifStockMini(String produit){
        boolean retour = false;
        for(Produit p : listeProduits){
            if(p.getNom().equals(produit)){
                if(p.getStock() < p.getStockMin()){
                    retour = true;
                }                
            }
        }
        return retour;
    }

    private void initialisationDonnees() {
        //vue.setVisible(true);
        listeProduits = new ArrayList<Produit>();
        factureEnCours = new HashMap<Produit,Integer>();
        
        Viennoiserie p1 = new Viennoiserie(ListeViennoiseries.Croissant, 30, 2, 20, 10);
        Viennoiserie p2 = new Viennoiserie(ListeViennoiseries.PainAuLait, 20, 3, 16, 10);
        Viennoiserie p3 = new Viennoiserie(ListeViennoiseries.PainAuChocolat, 20, 3, 16, 10);
        Viennoiserie p4 = new Viennoiserie(ListeViennoiseries.PainAuRaisin, 20, 3, 16, 10);
        Boisson b1 = new Boisson(ListeBoissons.Sprite, (float) 1.5, 5, 100);
        Boisson b2 = new Boisson(ListeBoissons.CocaCola, 2, 8, 100);
        Boisson b3 = new Boisson(ListeBoissons.PetiteChapelle, 40, 2, 100);
        Boisson b4 = new Boisson(ListeBoissons.Whisky, 14, 2, 100);
        Boisson b5 = new Boisson(ListeBoissons.SaintJoseph, 10, 3, 100);
        Boisson b6 = new Boisson(ListeBoissons.FantaCitron, 3, 6, 100);
        Boisson b7 = new Boisson(ListeBoissons.Pepsi, 3, 4, 100);
        Boisson b8 = new Boisson(ListeBoissons.Orangina, (float) 2.5, 6, 100);
        Boisson b9 = new Boisson(ListeBoissons.JusDOrange, (float) 1.5, 4, 100);
        listeProduits.add(p1);
        listeProduits.add(p2);
        listeProduits.add(p3);
        listeProduits.add(p4);
        listeProduits.add(b1);
        listeProduits.add(b2);
        listeProduits.add(b3);
        listeProduits.add(b4);
        listeProduits.add(b5);
        listeProduits.add(b6);
        listeProduits.add(b7);
        listeProduits.add(b8);
        listeProduits.add(b9);        
    }

    /**
     * Author : TdF
     * @param hmProduit hmQuantite 
     * @return 
     * Mais à jour les facturations du produits .
     */
    void miseAJourFacturation(String hmProduit, int hmQuantite) {
        for (Produit p : listeProduits) {
            if(p.getNom().equals(hmProduit)){
                Date date = new Date();
                HashMap<Date, Integer> nbProduitVendu = new HashMap<>();
                nbProduitVendu = p.getNbVendus();
                nbProduitVendu.put(date, hmQuantite);
                p.setNbVendus(nbProduitVendu);
            }
        }        
    }

}
