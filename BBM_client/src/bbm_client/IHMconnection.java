/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import javax.swing.JOptionPane;
import javax.swing.Popup;


/**
 *
 * @author maxime
 */
public class IHMconnection extends VuePrincipale {

    /**
     * Creates new form connection
     */
    public IHMconnection(Controleur c) {
        initComponents();
        this.add(jPanel1);
        this.setSize(1000, 800);
        this.setVisible(true);
        controleur = c;
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        boutonConnection = new javax.swing.JButton();
        labelMotDePasse = new javax.swing.JLabel();
        nomUtilisateur = new javax.swing.JTextField();
        labelUtilisateur = new javax.swing.JLabel();
        Titre = new javax.swing.JLabel();
        Copyright = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        jScrollPane1.setViewportView(jTextPane1);

        jTextField2.setText("jTextField2");

        boutonConnection.setText("Se connecter");
        boutonConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonConnectionActionPerformed(evt);
            }
        });

        labelMotDePasse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelMotDePasse.setText("Mot de  passe :");

        nomUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomUtilisateurActionPerformed(evt);
            }
        });

        labelUtilisateur.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelUtilisateur.setText("Utilisateur :");

        Titre.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Titre.setText("Breaking Bread Manager");
        Titre.setIconTextGap(16);

        Copyright.setText("Copyright L2M2T All rights reserved");

        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(labelUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(Copyright))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(labelMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boutonConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(labelUtilisateur)
                .addGap(34, 34, 34)
                .addComponent(nomUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelMotDePasse)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(boutonConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(Copyright)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boutonConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonConnectionActionPerformed
        // TODO add your handling code here:
        
        String nom = nomUtilisateur.getText();
        char[] mdp = jPasswordField1.getPassword();
        controleur.connexion(nom,mdp);
        
    }//GEN-LAST:event_boutonConnectionActionPerformed

    private void nomUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomUtilisateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomUtilisateurActionPerformed

     /**
     * Méthode pour afficher une popup d'erreur
     * @param phrase Phrase à afficher dans la popup
     */
    @Override
    public void afficheErreur(String phrase) {
        javax.swing.JOptionPane.showMessageDialog(null,phrase); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Copyright;
    private javax.swing.JLabel Titre;
    private javax.swing.JButton boutonConnection;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelMotDePasse;
    private javax.swing.JLabel labelUtilisateur;
    private javax.swing.JTextField nomUtilisateur;
    // End of variables declaration//GEN-END:variables

}
