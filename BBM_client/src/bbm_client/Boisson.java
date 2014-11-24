/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author Tristan
 */
public class Boisson extends Produit {
    private ListeBoissons type;
    
    public Boisson (ListeBoissons t, int p, int stockMin, GregorianCalendar tempsV) {
        type = t;
        prix = p;
        tempsVente = tempsV;
        this.stockMin = stockMin;
        nbVendus = new HashMap<GregorianCalendar,Integer>();
    }
    
}
