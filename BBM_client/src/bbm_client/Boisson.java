/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author Tristan
 */
public class Boisson extends Produit {
    private ListeBoissons type;
    

    public Boisson (ListeBoissons t, int p, int stockMin, int tempsV) {
        type = t;
        prix = p;
        tempsVente = new java.sql.Date(tempsV*60*100);

        this.stockMin = stockMin;
        nbVendus = new HashMap<Date,Integer>();
    }

    @Override
    public String[] getInfos() {
       this.toString();
        return null;
    }
    
}
