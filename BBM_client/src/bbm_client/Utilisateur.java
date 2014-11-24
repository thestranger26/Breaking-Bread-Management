/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

/**
 *
 * @author Tristan
 */
public class Utilisateur {
    private Controleur c;
    private String nom;
    private String prenom;
    private ListeUtilisateurs type;
    
    public Utilisateur(Controleur c, String n, String p, ListeUtilisateurs t) {
        this.c = c;
        nom = n;
        prenom = p;
        type= t;
    }

    //GETTEURS et SETTEURS
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public ListeUtilisateurs getType() {
        return type;
    }
    public String getTypeString() {
        return type.toString();
    }
    public void setType(ListeUtilisateurs type) {
        this.type = type;
    }
    
    
}
