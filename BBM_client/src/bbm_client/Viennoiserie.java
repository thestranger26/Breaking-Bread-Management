/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author Tristan
 */
public class Viennoiserie extends Produit {
    private TreeSet<Fournee> fournees;
    private ListeViennoiseries type;
    private int dureeCuisson;
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    
    public Viennoiserie(ListeViennoiseries t, int dureCuisson, int p, int stockMin, Date tempsV) {
        fournees = new TreeSet<Fournee>();
        type = t;
        dureeCuisson = dureCuisson;
        prix= p;
        tempsVente = tempsV;
        this.stockMin = stockMin;
        nbVendus = new HashMap<Date,Integer>();        
        Fournee fourneeInit= new Fournee(this, 123, 20);
        fournees.add(fourneeInit);
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
    public int getDureeCuisson() {
        return dureeCuisson;
    }
    public void setDureeCuisson(int dureeCuisson) {
        this.dureeCuisson = dureeCuisson;
    }
    
    public void getInfosfounnee(int idF) {
        ArrayList res= new ArrayList();
     for (Fournee f : fournees) {
            if (idF == f.getIdFournee()) {
                res.add(f.getIdFournee());
                res.add(f.getDebutCuisson());
                res.add(f.getEtatFournee());
                res.add(f.getFinCuisson());
                res.add(f.getNbElements());
                res.add(f.getViennoiserie());
            }
            System.out.println(res);
        }
    }
    
    
    
}
