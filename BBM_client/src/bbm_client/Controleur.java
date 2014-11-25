
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import javax.swing.GroupLayout;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.GroupLayout;
import java.util.Arrays;
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
        vue = new IHMManageur(this);

        
        
    //-----------------------MAXIME S-----------------------//

        Viennoiserie p3 = new Viennoiserie(ListeViennoiseries.Croissant, 30, 2, 20, null);
        p3.getInfosfounnee(123);
        //listeProduits.add(p1);
        //listeProduits.add(p2);
    //-----------------------MAXIME S FIN-----------------------//
        
//vue.setVisible(true);
       
        
        //vue.setVisible(true);
        listeProduits = new ArrayList<Produit>();
        factureEnCours = new HashMap<Produit,Integer>();
    }
    
        /**
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
    public void commencerCuisson(Fournee fournee) {
        fournee.setEtatFournee(ListeEtatsFournee.EnCuisson);
        fournee.getDebutCuisson();
    }
    
    
}