/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.GroupLayout;
import java.util.Arrays;

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



//vue.setVisible(true);
       
        
        //vue.setVisible(true);
        listeProduits = new ArrayList<Produit>();
        factureEnCours = new HashMap<Produit,Integer>();
    }

    void connexion(String nom, char[] mdp) {
        String rep = chercheUtilisateur(nom, mdp);
        if (rep.equals("pasTrouve")) {
            vue.afficheErreur("L'utilisateur n'a pas été trouvé");
        } else {
            
        }
    }

    private String chercheUtilisateur(String nom, char[] mdp) {
        String ret = "pasTrouve";
        
        if (nom.equals("tristan")) {
            ret=ListeUtilisateurs.Manager.toString();
        } else if (nom.equals("maxime")) {
            ret=ListeUtilisateurs.OperateurDeCuisson.toString();
        } else if (nom.equals("luca")) {
            ret=ListeUtilisateurs.Vendeur.toString();
        } 
        return ret;
        
    }
    public void commencerCuisson(Fournee fournee) {
        fournee.setEtatFournee(ListeEtatsFournee.EnCuisson);
        fournee.getDebutCuisson();
    }

}
