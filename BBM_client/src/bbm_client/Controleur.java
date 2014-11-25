/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
        vue = new IHMVendeurAlertes(this);


//vue.setVisible(true);
       
        
        //vue.setVisible(true);
        listeProduits = new ArrayList<Produit>();
        factureEnCours = new HashMap<Produit,Integer>();
    }

    int getPrix(String produit) { 
        
        int retour = 8;
        return retour;
    }
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
    public HashMap<Integer, Integer> stockHoraire(Produit produit){
        return produit.getStockVitrineMin();
    }
    // Permet de diminuer la quantité de produit en fonction de la quantité vendu.
    // Est appelé lors de facturation
    void decroitStock(String produit, Integer quantite) {
        throw new UnsupportedOperationException("P : " + produit + " Q : " + Integer.toString(quantite) + " Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
