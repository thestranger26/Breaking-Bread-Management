
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    

    /**
     * Constructeur d'une viennoiserie
     * @param t type viennoiserie
     * @param dureCuisson
     * @param p Prix
     * @param stockMin
     * @param tempsV temps de vente Max
     */
    public Viennoiserie(ListeViennoiseries t, int dureCuisson, int p, int stockMin,int tempsV) {
        fournees = new TreeSet<Fournee>();
        type = t;
        dureeCuisson = dureCuisson;
        prix= p;
        tempsVente = new java.sql.Date(tempsV*60*100);
        this.stockMin = stockMin;
        nbVendus = new HashMap<Date,Integer>();        
        Fournee f1= new Fournee(this, 123, 20);
        Fournee f2 = new Fournee(this, 345, 20);
        Fournee f3 = new Fournee(this, 789, 20);
        fournees.add(f1);
        fournees.add(f2);
        fournees.add(f3);
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
    
    public Fournee getFournee(int idF) {
        Fournee ret = null;
        for (Fournee f : fournees) {
            if (idF == f.getIdFournee()) {
                ret = f;
            }
        }
        return ret;
    }
    
    public ArrayList getInfosfournee(int idF) {
        ArrayList res= new ArrayList();
     for (Fournee f : fournees) {
            if (idF == f.getIdFournee()) {
                res.add(f.getIdFournee());
                //res.add(f.getDebutCuisson());
                res.add(f.getEtatFournee());
                //res.add(f.getFinCuisson());
                res.add(f.getNbElements());
                res.add(f.getViennoiserie());
            }
            System.out.println(res);
        }
     return res;
    }
   

    
    /**
     * tableau des infos : 
     *  0 -> Type
     *  1 -> stock
     *  2 -> prix
     *  3 -> stock min
     *  4 -> stock Vitrine
     * @return tableau des infos
     */
    @Override
    public String[] getInfos() {
        String[] tabValeurs = {type.toString(),Integer.toString(stock),Float.toString(prix),Integer.toString(stockMin),Integer.toString(stockVitrine) };
        return null;
    }
    /**
     * Author : MS & LR
     * Methode qui va initialiser la cuisson et lancer le temps de cuisson
     * @param idFournee 
     */
   public void commencerCuisson(int idFournee) {
       Fournee f = getFournee(idFournee);
       if(f!=null) {
            System.out.println(f.getDebutCuisson());
            System.out.println(f.getFinCuisson());
            System.out.println(f.getIdFournee());
            System.out.println(f.getNbElements());
            System.out.println(f.getEtatFournee());
            System.out.println(f.getNbElementsInitial());
            System.out.println(f.getViennoiserie());
            f.setEtatFournee(ListeEtatsFournee.EnCuisson);
            f.setDebutCuisson(new Date()); 
            String t = f.getDebutCuisson();
            f.setFinCuisson(ajouterMinute(f.getDebutCuissonDate(),this.dureeCuisson));         
       }
    }
    
   public static Date ajouterMinute(Date dat, int nbMinute) { 
        Calendar cal = Calendar.getInstance(); 
        cal.setTime(dat);
        cal.add(Calendar.MINUTE, nbMinute);
        return cal.getTime();
    }
    
    
}

