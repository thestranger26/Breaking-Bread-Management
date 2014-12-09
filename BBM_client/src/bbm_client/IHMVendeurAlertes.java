/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbm_client;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maxime
 */
public class IHMVendeurAlertes extends VuePrincipale {

    
    public enum etatMethodePaiement{
        CB, LIQUIDE, CHEQUE, AUCUN
    }
    
    
    //Variables globales
    etatMethodePaiement eMP = etatMethodePaiement.AUCUN;
    int nbreProduitAjoute = 0;
    int prixTotal = 0;
    HashMap<String, Integer> hmProduitQuantite = new HashMap<String, Integer>();
    
    /**
     * Creates new form IHMVendeurAlertes
     */
    public IHMVendeurAlertes(Controleur c){
        initComponents();
        this.add(jPanel3);
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

        jButton1 = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Déconnexion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ongletFacturation1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableAlerte1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        comboBoxListeProduit1 = new javax.swing.JComboBox();
        bouttonMoins1 = new javax.swing.JButton();
        textNbProduitAjoutPanier1 = new javax.swing.JTextField();
        bouttonPlus1 = new javax.swing.JButton();
        bouttonAjouterPanier1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablePanierProduit1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButtonValiderAchat = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        textTotalPanier1 = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonCarteBleue = new javax.swing.JRadioButton();
        jRadioButtonLiquide = new javax.swing.JRadioButton();
        jRadioButtonCheque = new javax.swing.JRadioButton();
        labelBBMVENDEUR = new javax.swing.JLabel();

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Déconnexion.setText("Déconnexion");
        Déconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DéconnexionActionPerformed(evt);
            }
        });

        tableAlerte1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produit", "Quantité", "Type d'alerte", "Action"
            }
        ));
        jScrollPane4.setViewportView(tableAlerte1);
        tableAlerte1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        ongletFacturation1.addTab("Alerte", jPanel4);

        comboBoxListeProduit1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bouttonMoins1.setText("-");

        textNbProduitAjoutPanier1.setText("NB");
        textNbProduitAjoutPanier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNbProduitAjoutPanier1ActionPerformed(evt);
            }
        });

        bouttonPlus1.setText("+");
        bouttonPlus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonPlus1ActionPerformed(evt);
            }
        });

        bouttonAjouterPanier1.setText("Ajouter");
        bouttonAjouterPanier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonAjouterPanier1ActionPerformed(evt);
            }
        });

        tablePanierProduit1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Quantité", "Produit", "Prix", "X"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablePanierProduit1);

        jLabel3.setText("Moyen de payement");

        jButtonValiderAchat.setText("Valider achat");
        jButtonValiderAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderAchatActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(textTotalPanier1);

        jLabel4.setText("Total :");

        buttonGroup1.add(jRadioButtonCarteBleue);
        jRadioButtonCarteBleue.setText("Carte Bleue");
        jRadioButtonCarteBleue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCarteBleueActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonLiquide);
        jRadioButtonLiquide.setText("Liquide");
        jRadioButtonLiquide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLiquideActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCheque);
        jRadioButtonCheque.setText("Chèque");
        jRadioButtonCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonChequeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(comboBoxListeProduit1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bouttonMoins1)
                        .addGap(18, 18, 18)
                        .addComponent(textNbProduitAjoutPanier1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bouttonPlus1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bouttonAjouterPanier1)))
                .addGap(83, 83, 83)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonValiderAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jRadioButtonCarteBleue)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonCheque)
                            .addComponent(jRadioButtonLiquide))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxListeProduit1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouttonMoins1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNbProduitAjoutPanier1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouttonPlus1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouttonAjouterPanier1))
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(jRadioButtonCarteBleue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonLiquide)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCheque)
                        .addGap(70, 70, 70)
                        .addComponent(jButtonValiderAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ongletFacturation1.addTab("Facturation", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ongletFacturation1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ongletFacturation1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelBBMVENDEUR.setText("BBM  - VENDEUR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelBBMVENDEUR)
                        .addGap(122, 122, 122)
                        .addComponent(Déconnexion)
                        .addGap(347, 347, 347))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Déconnexion)
                    .addComponent(labelBBMVENDEUR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonValiderAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderAchatActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonValiderAchatActionPerformed

    private void bouttonAjouterPanier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonAjouterPanier1ActionPerformed
        // TODO add your handling code here:

        // Récupération des valeurs nécessaire
        String produit = comboBoxListeProduit1.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) tablePanierProduit1.getModel();
        int prixUnitaire = controleur.getPrix(produit);
        int prixProduitTotal = prixUnitaire*nbreProduitAjoute;

        // Ajout de la ligne dans la JTable
        model.addRow(new Object[] {Integer.toString(nbreProduitAjoute), produit, Integer.toString(prixUnitaire), Integer.toString(prixProduitTotal)});
        hmProduitQuantite.put(produit, nbreProduitAjoute);
        
        // Remise à 0 des produits à ajouter
        nbreProduitAjoute = 0;
        textNbProduitAjoutPanier1.setText(Integer.toString(nbreProduitAjoute));

        // Mise à jour du prix total
        prixTotal += prixProduitTotal;
        textTotalPanier1.setText(Integer.toString(prixTotal));

    }//GEN-LAST:event_bouttonAjouterPanier1ActionPerformed

    private void bouttonPlus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonPlus1ActionPerformed
        // TODO add your handling code here:
        nbreProduitAjoute++;
        textNbProduitAjoutPanier1.setText(Integer.toString(nbreProduitAjoute));
    }//GEN-LAST:event_bouttonPlus1ActionPerformed

    private void textNbProduitAjoutPanier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNbProduitAjoutPanier1ActionPerformed
        // TODO add your handling code here
        for(Map.Entry<String, Integer> entry : hmProduitQuantite.entrySet()) {
            String hmProduit = entry.getKey();
            int hmQuantite = entry.getValue();
            controleur.decroitStock(hmProduit, hmQuantite);
        }
    }//GEN-LAST:event_textNbProduitAjoutPanier1ActionPerformed

    private void jRadioButtonCarteBleueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCarteBleueActionPerformed
        // TODO add your handling code here:
        eMP = etatMethodePaiement.CB;
    }//GEN-LAST:event_jRadioButtonCarteBleueActionPerformed

    private void jRadioButtonLiquideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLiquideActionPerformed
        // TODO add your handling code here:
        eMP = etatMethodePaiement.LIQUIDE;
    }//GEN-LAST:event_jRadioButtonLiquideActionPerformed

    private void jRadioButtonChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonChequeActionPerformed
        // TODO add your handling code here:
        eMP = etatMethodePaiement.CHEQUE;
    }//GEN-LAST:event_jRadioButtonChequeActionPerformed

    private void DéconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DéconnexionActionPerformed
        super.deconnexion();
    }//GEN-LAST:event_DéconnexionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Déconnexion;
    private javax.swing.JButton bouttonAjouterPanier1;
    private javax.swing.JButton bouttonMoins1;
    private javax.swing.JButton bouttonPlus1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboBoxListeProduit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonValiderAchat;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButtonCarteBleue;
    private javax.swing.JRadioButton jRadioButtonCheque;
    private javax.swing.JRadioButton jRadioButtonLiquide;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel labelBBMVENDEUR;
    private javax.swing.JTabbedPane ongletFacturation1;
    private javax.swing.JTable tableAlerte1;
    private javax.swing.JTable tablePanierProduit1;
    private javax.swing.JTextField textNbProduitAjoutPanier1;
    private javax.swing.JEditorPane textTotalPanier1;
    // End of variables declaration//GEN-END:variables
}
