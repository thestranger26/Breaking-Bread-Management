/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author Tristan
 */
public class Fournee implements Serializable{
    private Viennoiserie viennoiserie;
    private int idFournee;
    private GregorianCalendar debutCuisson;
    private GregorianCalendar finCuisson;
    private ListeEtatsFournee etatFournee;
    private int nbElementsInitial;
    private int nbElements;
    
    
    public Fournee(Viennoiserie v, int id, int nbElementsInit) {
        viennoiserie = v;
        idFournee = id;
        nbElementsInitial = nbElementsInit;
        nbElements = nbElementsInit;
        etatFournee = ListeEtatsFournee.EnCuisson;
        debutCuisson = new GregorianCalendar(TimeZone.getDefault());
    }

    
    //GETTEURS et SETTEURS
    public Viennoiserie getViennoiserie() {
        return viennoiserie;
    }
    public void setViennoiserie(Viennoiserie viennoiserie) {
        this.viennoiserie = viennoiserie;
    }
    public int getIdFournee() {
        return idFournee;
    }
    public void setIdFournee(int idFournee) {
        this.idFournee = idFournee;
    }
    public GregorianCalendar getDebutCuisson() {
        return debutCuisson;
    }
    public void setDebutCuisson(GregorianCalendar debutCuisson) {
        this.debutCuisson = debutCuisson;
    }
    public GregorianCalendar getFinCuisson() {
        return finCuisson;
    }
    public void setFinCuisson(GregorianCalendar finCuisson) {
        this.finCuisson = finCuisson;
    }
    public ListeEtatsFournee getEtatFournee() {
        return etatFournee;
    }
    public void setEtatFournee(ListeEtatsFournee etatFournee) {
        this.etatFournee = etatFournee;
    }
    public int getNbElementsInitial() {
        return nbElementsInitial;
    }
    public void setNbElementsInitial(int nbElementsInitial) {
        this.nbElementsInitial = nbElementsInitial;
    }
    public int getNbElements() {
        return nbElements;
    }
    public void setNbElements(int nbElements) {
        this.nbElements = nbElements;
    }
    
    
}
