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
        vue = new IHMVendeurAlertes(this);

        
        //vue.setVisible(true);
        listeProduits = new ArrayList<Produit>();
        factureEnCours = new HashMap<Produit,Integer>();
        
        Viennoiserie p1 = new Viennoiserie(ListeViennoiseries.Croissant, 30, 2, 20, 10);
        Viennoiserie p2 = new Viennoiserie(ListeViennoiseries.PainAuLait, 20, 3, 16, 10);
        Boisson b1 = new Boisson(ListeBoissons.Sprite, 3, 10, 100);
        listeProduits.add(p1);
        listeProduits.add(p2);
        listeProduits.add(b1);
        
        /**
         * Author : LR & MS
         * Test commencerCuisson()
         */ 
        
        System.out.println("COUCOU TEST");
        Viennoiserie p3 = new Viennoiserie(ListeViennoiseries.Croissant, 30, 2, 20, null);
        p3.getInfosfournee(123);
        p3.commencerCuisson(123);
        p3.getInfosfournee(123);

        this.getInfosProduits();
    }

    int getPrix(String produit) {
        int retour = 8;
        return retour;
    }

    /**
     * Author : TdF
     * Permet de diminuer la quantité de produit en fonction de la quantité vendu.
    */
    void decroitStock(String produit, Integer quantite) {
        throw new UnsupportedOperationException("P : " + produit + " Q : " + Integer.toString(quantite) + " Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Author : TL
     */
    public void seDeconnecter() {
        this.vue = new IHMconnection(this);
        this.utilisateur = null;
    }
    
    public String[] getInfosProduits() {
        return null;
        
        
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
            } else if (rep.equals(ListeUtilisateurs.OperateurDeCuisson.toString())) {
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
}
