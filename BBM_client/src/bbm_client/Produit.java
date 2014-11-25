/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author Tristan
 */
public abstract class Produit implements Serializable {
    protected Controleur c;
    protected float prix;
    protected Date tempsVente;
    protected int stock;
    protected int stockMin;
    protected int stockVitrine;
    protected HashMap<Integer,Integer> stockVitrineMin;
    protected HashMap<Date,Integer> nbVendus;
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

    
    //GETTEURS et SETTEURS
    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }
    public Date getTempsVente() {
        return tempsVente;
    }
    public void setTempsVente(Date tempsVente) {
        this.tempsVente = tempsVente;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStockMin() {
        return stockMin;
    }
    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }
    public int getStockVitrine() {
        return stockVitrine;
    }
    public void setStockVitrine(int stockVitrine) {
        this.stockVitrine = stockVitrine;
    }
    public HashMap<Integer, Integer> getStockVitrineMin() {
        return stockVitrineMin;
    }
    public void setStockVitrineMin(HashMap<Integer, Integer> stockVitrineMin) {
        this.stockVitrineMin = stockVitrineMin;
    }
    public HashMap<Date, Integer> getNbVendus() {
        return nbVendus;
    }
    public void setNbVendus(HashMap<Date, Integer> nbVendus) {
        this.nbVendus = nbVendus;
    }
    
    /**
     * Retourne le temps de vente du produit sous forme de String
     * @return String - le temps de vente
     */
    public String getTempsVenteString() {
        return tempsVente.toString();
    }
    
    /**
     * Retourne le nombre de ventes de la date passé en paramètre
     * @param date
     * @return int
     */
    public int getVentes(Date date) {
        return nbVendus.get((Object) date);
    }
    
    /**
     * Modifie le nombre d'éléments vendus de la date passée en paramètre
     * @param date - Jour qu'on veut modifié
     * @param nb - Elements vendus ce jour
     */
    public void setNbVendus(Date date, int nb) {
        nbVendus.replace(date, nb);
    }
    
    /**
     * Modifie le stock en vitrine du produit dont l'ID a été passé en paramètre
     * @param id - ID de la viennoiserie
     * @param nb - Nouveau stock
     */
    public void setStockVitrine(int id, int nb) {
        stockVitrineMin.replace(id, nb);
    }
    
    /**
     * Récupère le cuissson en cours 
     * @param prod - produit souhaité
     */
    public int cuissonEnCours(Produit prod){
        System.out.println("Coucou");
        return 0;
    }

    public abstract String[] getInfos();
}
