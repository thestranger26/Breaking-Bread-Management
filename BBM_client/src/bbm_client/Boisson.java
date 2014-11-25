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

       /**
     * Toutes les infos sont en String
     * 0 -> type
     * 1 -> temps Vente max
     * 2 -> Stock vitrine
     * 3 -> Stock min
     * 4 -> stock
     * 5 -> prix
     * @return tableau des infos
     */
    @Override
    public String[] getInfos() {
        String[] tabValeurs = {type.toString(),tempsVente.toString(),Integer.toString(stockVitrine),Integer.toString(stockMin),Integer.toString(stock),Float.toString(prix)};

        return tabValeurs;
    }
    
}
