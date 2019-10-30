package Interfaces;

import gestionClassement.ClassementAnnuel;
import gestionPlannification.*;
import model.*;
import java.util.ArrayList;

public class InterfaceClassement extends javax.swing.JFrame {

    private Donnee d;

    @Override
    public void setDefaultCloseOperation(int operation) {
        this.setVisible(false);
    }

    public InterfaceClassement(Donnee d) {
        super("Grand Prix Amérique");
        this.d = d;
        initComponents();
        inittab1(d.getLstRallye());
        inittab2(d.getLstClassementAnnuel());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxEtape = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxEdition = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxRallye = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaClGene = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaClE = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxAnnee = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaClACoureur = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaClACons = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaClAEquipe = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane.setName("Classement Etape"); // NOI18N

        jComboBoxEtape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEtapeActionPerformed(evt);
            }
        });

        jLabel1.setText("Etape");

        jComboBoxEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEditionActionPerformed(evt);
            }
        });

        jLabel2.setText("Edition");

        jComboBoxRallye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRallyeActionPerformed(evt);
            }
        });

        jLabel3.setText("Rallye");

        jLabel5.setText("Classement général");

        jLabel6.setText("Classement etape");

        jTextAreaClGene.setColumns(20);
        jTextAreaClGene.setRows(5);
        jScrollPane4.setViewportView(jTextAreaClGene);

        jTextAreaClE.setColumns(20);
        jTextAreaClE.setRows(5);
        jScrollPane2.setViewportView(jTextAreaClE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxRallye, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jComboBoxEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxEtape, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(299, 299, 299)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRallye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxEtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(77, 77, 77))
        );

        jTabbedPane.addTab("CLassement du Rallye", jPanel1);

        jComboBoxAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnneeActionPerformed(evt);
            }
        });

        jLabel4.setText("Année");

        jLabel7.setText("Coureur");

        jLabel8.setText("Constructeur");

        jLabel9.setText("Equipe Constructeur");

        jTextAreaClACoureur.setColumns(20);
        jTextAreaClACoureur.setRows(5);
        jScrollPane6.setViewportView(jTextAreaClACoureur);

        jTextAreaClACons.setColumns(20);
        jTextAreaClACons.setRows(5);
        jScrollPane3.setViewportView(jTextAreaClACons);

        jTextAreaClAEquipe.setColumns(20);
        jTextAreaClAEquipe.setRows(5);
        jScrollPane7.setViewportView(jTextAreaClAEquipe);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(173, 173, 173)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane6)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );

        jTabbedPane.addTab("Classement Annuel", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Classement Etape");
        jTabbedPane.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxRallyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRallyeActionPerformed
        setListeEdition();
    }//GEN-LAST:event_jComboBoxRallyeActionPerformed

    private void jComboBoxEtapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEtapeActionPerformed
        if (jComboBoxEtape.getSelectedIndex() != -1)
            afficherClassementEtape();
    }//GEN-LAST:event_jComboBoxEtapeActionPerformed

    private void jComboBoxAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnneeActionPerformed
        ClassementAnnuel clA = d.getClassementAnnuel(jComboBoxAnnee.getSelectedIndex());
        afficherClassementAnnee(clA);
    }//GEN-LAST:event_jComboBoxAnneeActionPerformed

    private void jComboBoxEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEditionActionPerformed
        if (jComboBoxEdition.getSelectedIndex() != -1) {
            afficherClassementEdition();
            setListeEtape();
        }
    }//GEN-LAST:event_jComboBoxEditionActionPerformed

    /**
     * ************** Jpanel 1 ClassmentRallye ******************
     */
    public void inittab1(ArrayList<Rallye> array) {
        setListeRallye(array);
        afficherClassementEdition();
    }

    public Rallye getRallye() {
        return this.d.getRallye(jComboBoxRallye.getSelectedIndex());
    }

    public Edition getEdition() {
//    System.out.println("Interfaces.InterfaceGC.getEdition()"+this.jComboBoxEdition.getSelectedIndex());
        return getRallye().getEdition(this.jComboBoxEdition.getSelectedIndex());
    }

    public Etape getEtape() {
        return getEdition().getEtape(jComboBoxEtape.getSelectedIndex());
    }

    public void setListeRallye(ArrayList<Rallye> array) {
        for (Rallye e : array) {
            jComboBoxRallye.addItem(e.getNomR());
            //           System.out.println("r"+array.indexOf(e));
        }
    }

    public void setListeEdition() {
        this.jComboBoxEdition.removeAllItems();
        for (Edition e : getRallye().getlstEditions()) {
            jComboBoxEdition.addItem(String.valueOf(e.getNumEdition()));
            //        System.out.println("ed"+getRallye().getlstEditions().indexOf(e)+ jComboBoxEdition.getSelectedIndex());
        }
    }

    public void setListeEtape() {
        jComboBoxEtape.removeAllItems();
        for (Etape e : getEdition().getLstEtapes()) {
            jComboBoxEtape.addItem("Etape" + " " + e.getNumOrdreE());
        }
    }

    public void afficherClassementEdition() { // afficher liste de string
        jTextAreaClGene.setText("");
        jTextAreaClGene.append(getEdition().afficheClassementEdition());
    }

    public void afficherClassementEtape() { // afficher liste de string
        jTextAreaClE.setText("");
        jTextAreaClE.append(getEtape().afficheClassementEtape());
    }

    /**
     * ************** Jpanel 2    ClassementAnnuel******************
     */
    public void inittab2(ArrayList<ClassementAnnuel> array) {
        setListeAnnee(array);
        ClassementAnnuel clA = array.get(getNumClAnnee());
        afficherClassementAnnee(clA);
    }

    public void setListeAnnee(ArrayList<ClassementAnnuel> array) {
        for (ClassementAnnuel e : array) {
            jComboBoxAnnee.addItem(String.valueOf(e.getAnnee()));
        }
    }

    public int getNumClAnnee() {
        return this.jComboBoxAnnee.getSelectedIndex();
    }

    public void afficherClassementAnnee(ClassementAnnuel clA) {
        jTextAreaClACoureur.setText("");
        jTextAreaClACons.setText("");
        jTextAreaClAEquipe.setText("");
        jTextAreaClACoureur.append(clA.afficheClassementAnnuelCoureur());
        jTextAreaClACons.append(clA.afficheClassementAnnuelConstruct());
        jTextAreaClAEquipe.append(clA.afficheClassementEditionEquipe());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAnnee;
    private javax.swing.JComboBox<String> jComboBoxEdition;
    private javax.swing.JComboBox<String> jComboBoxEtape;
    private javax.swing.JComboBox<String> jComboBoxRallye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextAreaClACons;
    private javax.swing.JTextArea jTextAreaClACoureur;
    private javax.swing.JTextArea jTextAreaClAEquipe;
    private javax.swing.JTextArea jTextAreaClE;
    private javax.swing.JTextArea jTextAreaClGene;
    // End of variables declaration//GEN-END:variables

}
