/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import model.Donnee;

/**
 *
 * @author yepin
 */
public class Menu extends javax.swing.JFrame {

    private InterfaceClassement gc;
    private InterfaceConsultation info;
    private InterfaceRally r;
    private InterfaceEnregistreTemps ergT;

    public Menu(Donnee d) {
        initComponents();
        this.gc = new InterfaceClassement(d);
        this.info = new InterfaceConsultation(d);
        this.r = new InterfaceRally(d,this.info);
        this.ergT = new InterfaceEnregistreTemps(d);
        r.setVisible(false);
        info.setVisible(false);
        gc.setVisible(false);
        ergT.setVisible(false);
        this.jLabelLogo.setIcon(new ImageIcon("src/img/logo.png"));
        this.jLabelLogo.setHorizontalAlignment(0);
        this.jButtonCl.setHorizontalAlignment(0);
        this.jButtonCrea.setHorizontalAlignment(0);
        this.jButtonInfo.setHorizontalAlignment(SwingConstants.CENTER);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCrea = new javax.swing.JButton();
        jButtonCl = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCrea.setText("Création");
        jButtonCrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreaActionPerformed(evt);
            }
        });

        jButtonCl.setText("Consultation Classement");
        jButtonCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClActionPerformed(evt);
            }
        });

        jButtonInfo.setText("Consultation Info");
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setText("Enregistrement Temps");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCrea, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(241, 241, 241))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCl)
                    .addComponent(jButtonInfo))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreaActionPerformed
        // TODO add your handling code here:
        this.r.setVisible(true);
//        this.gc.setVisible(false);
//        this.info.setVisible(false); 
//        this.ergT.setVisible(false);
    }//GEN-LAST:event_jButtonCreaActionPerformed

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        // TODO add your handling code here:
        this.info.setVisible(true);
//           this.gc.setVisible(false);
//        this.r.setVisible(false);
//        this.ergT.setVisible(false);
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButtonClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClActionPerformed
        // TODO add your handling code here:  
        this.gc.setVisible(true);
//        this.info.setVisible(false);
//        this.r.setVisible(false);
//        this.ergT.setVisible(false);
    }//GEN-LAST:event_jButtonClActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//         this.gc.setVisible(false);
//        this.info.setVisible(false);
//        this.r.setVisible(false);
        this.ergT.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

//------------------------------------tabClassement--------------------------------//
//--------------------------tabClassementAnnuel-----------------------// 
//--------------------------tabClassementEdition-----------------------//     
    //------------------------------------tabCreation--------------------------------//   
    //---------------------tabEdition--------------------//
    //---------------------tabRallye--------------------//  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCl;
    private javax.swing.JButton jButtonCrea;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
