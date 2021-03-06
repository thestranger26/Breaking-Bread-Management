/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.GregorianCalendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.Calendar;

/**
 *
 * @author Tristan
 */
public class Fournee implements Serializable, Comparable<Fournee>{
    private Viennoiserie viennoiserie;
    private int idFournee;
    private Date debutCuisson;
    private Date finCuisson;
    private ListeEtatsFournee etatFournee;
    private int nbElementsInitial;
    private int nbElements;
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    private Timer timer;

    
    
    public Fournee(Viennoiserie v, int id, int nbElementsInit) {
        viennoiserie = v;
        idFournee = id;
        nbElementsInitial = nbElementsInit;
        nbElements = nbElementsInit;
        etatFournee = ListeEtatsFournee.AttenteDebutCuisson;
        debutCuisson = null;
        finCuisson = null;
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
    public String getDebutCuisson() {
        if(debutCuisson==null){
            return "Cuisson non lancé";
        }else{
            return df.format(debutCuisson);
        }
    }
    
    public Date getDebutCuissonDate() {
        if(debutCuisson==null){
            System.out.println("Date null");
        }else{
            return debutCuisson;
        }
        return null;
    }
    
    public void setDebutCuisson(Date debutCuisson) {
        this.debutCuisson = debutCuisson;
    }
    public String getFinCuisson() {
        if(finCuisson==null){
            return "Fin Cuisson non définit";
        }else{
            return df.format(finCuisson);
        }
    }

    public void setFinCuisson(Date finCuisson) {
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

    @Override
    public int compareTo(Fournee o) {
        return 0;
    }

    private Date calculfincuisson(Date debutCuisson, int dureeCuisson) {
        throw new UnsupportedOperationException("Not supported yet. FONCTION A FAIRE"); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Timer createTimer() {
    // Création d'une instance de listener 
    // associée au timer
        ActionListener action = new ActionListener ()
        {
        // Méthode appelée à chaque tic du timer
            @Override
            public void actionPerformed (ActionEvent event)
            {
               // viennoiserie.c.getVue().afficheErreur("reussi");

          }
       };

    // Création d'un timer qui génère un tic
    // chaque 500 millième de seconde
        return new Timer(500, action);
    }
    
        
    /**
     * tableau des infos d'une fournée
     * 0 -> id
     * 1 -> date debut cuisson
     * 2 -> Etat de la fournee
     * 3 -> date de fin de cuisson
     * 4 -> nombre d'éléments initial
     * 5 -> nombre d'éléments actuel
     * 
     * @param id de la fournee a retournee
     * @return tableau des infos
     */
    public String[] getInfosFournee() {
        String[] ret ={Integer.toString(idFournee),getDebutCuisson(), getEtatFournee().toString(), getFinCuisson(),Integer.toString(getNbElementsInitial()), Integer.toString(getNbElements())};
        
        return ret;
    }
}

