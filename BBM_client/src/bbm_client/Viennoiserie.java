/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author Tristan
 */
public class Viennoiserie extends Produit{
    private TreeSet<Fournee> fournees;
    private ListeViennoiseries type;
    private GregorianCalendar dureeCuisson;
    
    public Viennoiserie(ListeViennoiseries t, GregorianCalendar dureeCuisson, int p, int stockMin, GregorianCalendar tempsV) {
        fournees = new TreeSet<Fournee>();
        type = t;
        dureeCuisson = dureeCuisson;
        prix = p;
        tempsVente = tempsV;
        this.stockMin = stockMin;
        nbVendus = new HashMap<GregorianCalendar,Integer>();
    }

    
    //GETTEURS et SETTEURS
    public TreeSet<Fournee> getFournees() {
        return fournees;
    }
    public void setFournees(TreeSet<Fournee> fournees) {
        this.fournees = fournees;
    }
    public ListeViennoiseries getType() {
        return type;
    }
    public void setType(ListeViennoiseries type) {
        this.type = type;
    }
    public GregorianCalendar getDureeCuisson() {
        return dureeCuisson;
    }
    public void setDureeCuisson(GregorianCalendar dureeCuisson) {
        this.dureeCuisson = dureeCuisson;
    }
    
}
