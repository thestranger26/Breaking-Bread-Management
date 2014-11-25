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
        vue = new IHMManageur();

        
        
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
}
