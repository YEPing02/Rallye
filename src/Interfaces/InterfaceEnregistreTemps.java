/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import gestionClassement.*;
import gestionPlannification.*;
import gestionInscription.*;
import gestionDonnees.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Donnee;

/**
 *
 * @author yepin
 */
public class InterfaceEnregistreTemps extends javax.swing.JFrame {

    private Donnee d;

    @Override
    public void setDefaultCloseOperation(int operation) {
        this.setVisible(false);
    }

    public InterfaceEnregistreTemps(Donnee d) {
        initComponents();
        this.d = d;
        inittab(d.getLstRallye());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCoureur = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jTextFieldTemps = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPena = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTempsPena = new javax.swing.JTextField();
        jLabel1LblPena = new javax.swing.JLabel();
        jLabelTypePena = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCp = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxRallye = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxEdition = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxEtape = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxSpeciale = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListCoureur.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListCoureurValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListCoureur);

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Temps : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTemps, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldTemps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Temps", jPanel1);

        jListPena.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPenaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListPena);

        jLabel9.setText("Libellé de pénalité:");

        jLabel10.setText("Type de pénalité : ");

        jLabel13.setText("Saisir temps de pénalité : ");

        jButton2.setText("Valider");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Coureur  punis : ");

        jComboBoxCp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(jLabel13))
                                .addGap(29, 29, 29)
                                .addComponent(jTextFieldTempsPena, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelTypePena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1LblPena, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCp, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1LblPena, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabelTypePena))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldTempsPena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jButton2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pénalité", jPanel2);

        jLabel1.setText("Rallye");

        jComboBoxRallye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRallyeActionPerformed(evt);
            }
        });

        jLabel2.setText("Edition");

        jComboBoxEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEditionActionPerformed(evt);
            }
        });

        jLabel3.setText("Etape");

        jComboBoxEtape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEtapeActionPerformed(evt);
            }
        });

        jLabel4.setText("Spéciale");

        jComboBoxSpeciale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSpecialeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxRallye, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEtape, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxSpeciale, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBoxEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxRallye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxEtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jComboBoxSpeciale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxRallyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRallyeActionPerformed
        setListeEdition();
    }//GEN-LAST:event_jComboBoxRallyeActionPerformed

    private void jComboBoxEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEditionActionPerformed
        if (jComboBoxEdition.getSelectedIndex() != -1) {
            setListeEtape();
        }
    }//GEN-LAST:event_jComboBoxEditionActionPerformed

    private void jComboBoxEtapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEtapeActionPerformed
        if (jComboBoxEtape.getSelectedIndex() != -1) {
            setListeSpeciale();
        }
    }//GEN-LAST:event_jComboBoxEtapeActionPerformed

    private void jComboBoxSpecialeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSpecialeActionPerformed
        if (jComboBoxSpeciale.getSelectedIndex() != -1) {
            setListeInscrip();
            setListeCp();
            jTextFieldTemps.setText("");
        }
    }//GEN-LAST:event_jComboBoxSpecialeActionPerformed

    private void jListCoureurValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListCoureurValueChanged
        setTemps();

    }//GEN-LAST:event_jListCoureurValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (getDisputer(getInscrip()) == null) {  // si inscription dans edition n'existe pas dans cette spéciale (qu'il n'y a pas disputer correspondante à l'inscription)
                getSpeciale().enregistrerTemps(getInscrip(), getTemps());
            } else {
                getDisputer(getInscrip()).setTemps(getTemps());
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

// ---------------------pena---------------------------------//   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setTempsPena();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxCpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCpActionPerformed
        if (jComboBoxCp.getSelectedIndex() != -1) {
            setListePenalite();
        }
    }//GEN-LAST:event_jComboBoxCpActionPerformed

    private void jListPenaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPenaValueChanged
        setPenalite();
    }//GEN-LAST:event_jListPenaValueChanged
    // ------------------------init----------------------------//

    public void inittab(ArrayList<Rallye> array) {
        setListeRallye(array);

    }

    //--------------------------------tabdesus----------------------------//  
    public Rallye getRallye() {
        return this.d.getRallye(jComboBoxRallye.getSelectedIndex());
    }

    public Edition getEdition() {
        System.out.println("Interfaces.InterfaceGC.getEdition()" + this.jComboBoxEdition.getSelectedIndex());
        return getRallye().getEdition(this.jComboBoxEdition.getSelectedIndex());
    }

    public Etape getEtape() {
        return getEdition().getEtape(jComboBoxEtape.getSelectedIndex());
    }

    public Speciale getSpeciale() {
        return getEtape().getSpeciale(jComboBoxSpeciale.getSelectedIndex());
    }

    public Inscription getInscrip() {
        return getEdition().getLstInscrp().get(jListCoureur.getAnchorSelectionIndex());
    }

    public Disputer getDisputer(Inscription ins) {
        for (Disputer d : getSpeciale().getlstResultatSpeciale()) {
            if (ins.equals(d.getInscription())) {
                return d;
            }
        }
        return null;
    }

    public void setListeRallye(ArrayList<Rallye> array) {
        for (Rallye e : array) {
            jComboBoxRallye.addItem(e.getNomR());
            System.out.println("r" + array.indexOf(e));
        }
    }

    public void setListeEdition() {
        this.jComboBoxEdition.removeAllItems();
        for (Edition e : getRallye().getlstEditions()) {
            jComboBoxEdition.addItem(String.valueOf(e.getNumEdition()));
            System.out.println("ed" + getRallye().getlstEditions().indexOf(e) + jComboBoxEdition.getSelectedIndex());
        }
    }

    public void setListeEtape() {
        jComboBoxEtape.removeAllItems();
        for (Etape e : getEdition().getLstEtapes()) {
            jComboBoxEtape.addItem("Etape" + " " + e.getNumOrdreE());
        }
    }

    public void setListeSpeciale() {
        jComboBoxSpeciale.removeAllItems();
        for (Speciale e : getEtape().getLstSpeciales()) {
            jComboBoxSpeciale.addItem("Spéciale" + " " + e.getNumOrdreS());
        }
    }

    public void setListeInscrip() {

        jListCoureur.setListData(getEdition().getStringNomLstInscrp());
    }
//------------------------------------enregistrerTemps----------------------------------//

    public float getTemps() {
        return Float.valueOf(jTextFieldTemps.getText());
    }

    public void setTemps() {
        float f = 0;
        for (Disputer d : getSpeciale().getlstResultatSpeciale()) {
            if (d.getInscription().equals(getInscrip())) {
                f = d.getTemps();
            }
        }
        jTextFieldTemps.setText(String.valueOf(f));
    }
    //---------------------------------Pénalité------------------------------------//

    public Disputer getCpena() {
        return getSpeciale().getlstDisputerCpenalite().get(jComboBoxCp.getSelectedIndex());
    }

    public Penalite getPena() {
        return getCpena().getPenalites().get(jListPena.getSelectedIndex());
    }

    public void setListeCp() {
        jComboBoxCp.removeAllItems();
        for (Disputer d : getSpeciale().getlstResultatSpeciale()) {
            if (!d.getPenalites().isEmpty()) {
                jComboBoxCp.addItem(d.stringGetCoureur());
            }
        }
    }

    public void setListePenalite() {
        jListPena.removeAll();
        jListPena.setListData(getCpena().stringGetPena());
    }

    public void setPenalite() {
        this.jLabel1LblPena.setText("");
        this.jLabelTypePena.setText("");
        this.jTextFieldTempsPena.setText("");
        this.jLabel1LblPena.setText(getPena().getLibellePenalite());
        this.jLabelTypePena.setText(getPena().getTypePenalite());
        this.jTextFieldTempsPena.setText(String.valueOf(getCpena().getTempsPenalite().get(jListPena.getSelectedIndex())));
    }

    public void setTempsPena() {
        try {
            getCpena().setTempsPenalite(Float.valueOf(jTextFieldTempsPena.getText()));
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxCp;
    private javax.swing.JComboBox<String> jComboBoxEdition;
    private javax.swing.JComboBox<String> jComboBoxEtape;
    private javax.swing.JComboBox<String> jComboBoxRallye;
    private javax.swing.JComboBox<String> jComboBoxSpeciale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel1LblPena;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTypePena;
    private javax.swing.JList<String> jListCoureur;
    private javax.swing.JList<String> jListPena;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldTemps;
    private javax.swing.JTextField jTextFieldTempsPena;
    // End of variables declaration//GEN-END:variables
}
