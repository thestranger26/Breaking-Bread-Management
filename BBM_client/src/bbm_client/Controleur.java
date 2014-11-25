/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.GroupLayout;

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
        vue = new IHMVendeurAlertes();


//vue.setVisible(true);
       
        
        //vue.setVisible(true);
        listeProduits = new ArrayList<Produit>();
        factureEnCours = new HashMap<Produit,Integer>();
    }
}
