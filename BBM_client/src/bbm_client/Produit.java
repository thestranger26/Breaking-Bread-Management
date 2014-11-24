/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author Tristan
 */
public abstract class Produit implements Serializable {
    protected Controleur c;
    protected float prix;
    protected GregorianCalendar tempsVente;
    protected int stock;
    protected int stockMin;
    protected int stockVitrine;
    protected HashMap<Integer,Integer> stockVitrineMin;
    protected HashMap<GregorianCalendar,Integer> nbVendus;

    
    //GETTEURS et SETTEURS
    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }
    public GregorianCalendar getTempsVente() {
        return tempsVente;
    }
    public void setTempsVente(GregorianCalendar tempsVente) {
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
    public HashMap<GregorianCalendar, Integer> getNbVendus() {
        return nbVendus;
    }
    public void setNbVendus(HashMap<GregorianCalendar, Integer> nbVendus) {
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
    public int getVentes(GregorianCalendar date) {
        return nbVendus.get((Object) date);
    }
    
    /**
     * Modifie le nombre d'éléments vendus de la date passée en paramètre
     * @param date - Jour qu'on veut modifié
     * @param nb - Elements vendus ce jour
     */
    public void setNbVendus(GregorianCalendar date, int nb) {
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
    
}
