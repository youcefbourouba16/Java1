/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resirvation;

import Model.Model1;
import java.awt.Dimension;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author youcef
 */
public class ResirvationUI extends javax.swing.JFrame {

    /**
     * Creates new form ResirvationUI
     */
     List<String> list_Wilaya = new ArrayList<>();
     int loadCount=0;
     
     public enum IdentityType {
    // Enum constants
    PASSPORT,
    CI
    
    }

        // Add elements to the list
        
    public ResirvationUI() {
        initComponents();
        setVisible_Elemnts(true);
        jd_delicration.setDate(new Date());
        jd_expiration.setDate(new Date());
        jCalendar1.setMinSelectableDate(new Date());
        add_ToWilayas("choose wilaya","Alger","djelfa","Oran","Laghouat");
        for (String string : list_Wilaya) {
            cb_depart.addItem(string);
            cb_distination.addItem(string);
        }
        cb_depart.setSelectedItem(0);
        loadCount=1;
        SpinnerNumberModel newModel = new SpinnerNumberModel(0, 0, 24, 3);
        jSpinner1.setModel(newModel);

       
    }
    private void add_ToWilayas(String... strings) {
        for (String s : strings) {
            list_Wilaya.add(s);
        }
    }
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        buttonGroup31 = new javax.swing.ButtonGroup();
        buttonGroup32 = new javax.swing.ButtonGroup();
        buttonGroup33 = new javax.swing.ButtonGroup();
        buttonGroup34 = new javax.swing.ButtonGroup();
        buttonGroup35 = new javax.swing.ButtonGroup();
        buttonGroup36 = new javax.swing.ButtonGroup();
        buttonGroup37 = new javax.swing.ButtonGroup();
        buttonGroup38 = new javax.swing.ButtonGroup();
        cb_distination = new javax.swing.JComboBox<>();
        cb_depart = new javax.swing.JComboBox<>();
        tf_nom = new javax.swing.JTextField();
        tf_prenom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb_passport = new javax.swing.JRadioButton();
        rb_Ci = new javax.swing.JRadioButton();
        tf_num = new javax.swing.JTextField();
        jl_numPass = new javax.swing.JLabel();
        jl_declaration = new javax.swing.JLabel();
        jl_expiration = new javax.swing.JLabel();
        jl_bagage = new javax.swing.JLabel();
        rb_eco = new javax.swing.JRadioButton();
        rb_buissnes = new javax.swing.JRadioButton();
        rb_aller_retour = new javax.swing.JRadioButton();
        rb_allerSimpl = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jd_delicration = new com.toedter.calendar.JDateChooser();
        jd_expiration = new com.toedter.calendar.JDateChooser();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_reserve = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(204, 204, 255));
        setResizable(false);

        cb_distination.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        cb_distination.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_distinationItemStateChanged(evt);
            }
        });

        cb_depart.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        cb_depart.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_departItemStateChanged(evt);
            }
        });

        tf_nom.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        tf_nom.setName("Nom"); // NOI18N

        tf_prenom.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        tf_prenom.setName("Prenom "); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jLabel1.setText("Nom :");

        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jLabel2.setText("Prenom :");

        buttonGroup3.add(rb_passport);
        rb_passport.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        rb_passport.setText("Passport");
        rb_passport.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_passportItemStateChanged(evt);
            }
        });
        rb_passport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_passportActionPerformed(evt);
            }
        });

        buttonGroup3.add(rb_Ci);
        rb_Ci.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        rb_Ci.setText("CI");
        rb_Ci.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_CiItemStateChanged(evt);
            }
        });

        tf_num.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        tf_num.setName("Num Identite"); // NOI18N

        jl_numPass.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jl_numPass.setText("Num Pass   :");

        jl_declaration.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jl_declaration.setText("Date de delicration :   ");

        jl_expiration.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jl_expiration.setText("Date d'expiration Pass/CI  :   ");

        jl_bagage.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jl_bagage.setText("Bagage (Fournir une estimation) :");

        buttonGroup1.add(rb_eco);
        rb_eco.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        rb_eco.setText("Economique ");

        buttonGroup1.add(rb_buissnes);
        rb_buissnes.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        rb_buissnes.setText("Business");

        buttonGroup2.add(rb_aller_retour);
        rb_aller_retour.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        rb_aller_retour.setText("Aller/retour");

        buttonGroup2.add(rb_allerSimpl);
        rb_allerSimpl.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        rb_allerSimpl.setText("Aller Simple");

        jLabel7.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jLabel7.setText("Depui :");

        jLabel8.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jLabel8.setText("a' :");

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Class :");

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("A/R :");

        jd_delicration.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jd_delicrationPropertyChange(evt);
            }
        });

        jd_expiration.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jd_expirationPropertyChange(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        jLabel11.setText("Prenom :");

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Documment de voyage :");

        btn_reserve.setBackground(new java.awt.Color(102, 255, 204));
        btn_reserve.setFont(new java.awt.Font("Cascadia Code", 0, 20)); // NOI18N
        btn_reserve.setForeground(new java.awt.Color(255, 255, 255));
        btn_reserve.setText("Reserve (no paiment requered)");
        btn_reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reserveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_passport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_Ci)
                                .addGap(68, 68, 68)
                                .addComponent(jl_numPass)
                                .addGap(26, 26, 26)
                                .addComponent(tf_num, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_declaration)
                                    .addComponent(jl_expiration))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jd_delicration, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jd_expiration, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42))))
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_bagage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addComponent(jLabel2)
                                                .addGap(35, 35, 35)))
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_depart, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_distination, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_eco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_buissnes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(217, 217, 217)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(rb_allerSimpl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rb_aller_retour))
                                            .addComponent(jLabel10))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_distination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_depart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_eco)
                            .addComponent(rb_buissnes)
                            .addComponent(rb_allerSimpl)
                            .addComponent(rb_aller_retour))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tf_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_passport)
                            .addComponent(rb_Ci)
                            .addComponent(tf_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_numPass))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_declaration)
                            .addComponent(jd_delicration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_expiration)
                            .addComponent(jd_expiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jl_bagage))
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btn_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jd_expirationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jd_expirationPropertyChange
        // TODO add your handling code here:
        jd_expiration.setMinSelectableDate(jd_delicration.getDate());
        
    }//GEN-LAST:event_jd_expirationPropertyChange

    private void jd_delicrationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jd_delicrationPropertyChange
        // TODO add your handling code here:
        Date date=new Date();
        jd_delicration.setMaxSelectableDate(date);
        jd_expiration.setDate(jd_delicration.getDate());
        
    
        
    }//GEN-LAST:event_jd_delicrationPropertyChange

    private void validation_TF(JTextField... strings){
       
        for (JTextField s : strings) {
            if (s.getText().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Veuillez remlire votre "+s.getName()+" .",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                         
            ); 
                return;
            }
            
        }
    }
    private void setVisible_Elemnts(boolean b){
        jl_numPass.setVisible(b);
        jl_bagage.setVisible(b);
        jl_expiration.setVisible(b);
        jl_declaration.setVisible(b);
        jd_delicration.setVisible(b);
        jd_expiration.setVisible(b);
        jSpinner1.setVisible(b);
        tf_num.setVisible(b);
    }
    private void validation(){
        if (cb_depart.getSelectedItem().equals("choose wilaya" ) ||
                 cb_distination.getSelectedItem().equals("choose wilaya" ) ||
                cb_depart.getSelectedIndex()==cb_distination.getSelectedIndex()) {
             JOptionPane.showMessageDialog(
                    null,
                    "Veuillez sélectionner votre destination",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
             return;
        }
        if (rb_buissnes.isSelected()==rb_eco.isSelected()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Veuillez sélectionner la classe .",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            ); return;
        }
         if (rb_allerSimpl.isSelected()==rb_aller_retour.isSelected()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Veuillez sélectionner Aller simple ou bien Aller reteur .",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            ); return;
        }
         if (rb_passport.isSelected()==rb_Ci.isSelected()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Veuillez sélectionner type d'identite .",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            ); return;
        }else setVisible_Elemnts(true);
        validation_TF(tf_nom,tf_prenom,tf_num);
    }
    private void changerLabel(IdentityType s){
        jl_declaration.setText("Date de delicration "+s+" :");
        jl_expiration.setText("Date d'expiration "+s+" :" );
        jl_numPass.setText("Numero de "+s+" :");
    }
    private void btn_reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reserveActionPerformed
        // TODO add your handling code here:
        validation();
        String IdType,classe,AR;
        if (rb_buissnes.isSelected()) {
            classe="buisness";
        }else classe="economique";
        
        if (rb_allerSimpl.isSelected()) {
            AR="Aller Simple";
        }else AR="Aller retour .";
       
    }//GEN-LAST:event_btn_reserveActionPerformed

    private void cb_departItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_departItemStateChanged
        // TODO add your handling code here:
         if (loadCount==1) {
           if (cb_depart.getSelectedItem().equals("choose wilaya")) {
            cb_depart.removeItemAt(0);
        }else return;  
        }else return;
    }//GEN-LAST:event_cb_departItemStateChanged

    private void cb_distinationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_distinationItemStateChanged
        // TODO add your handling code here:
         if (loadCount==1) {
           if (cb_distination.getSelectedItem().equals("choose wilaya")) {
            cb_distination.removeItemAt(0);
        }else return;  
        }else return;
    }//GEN-LAST:event_cb_distinationItemStateChanged

    private void rb_passportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_passportActionPerformed
        // TODO add your handling code here:
        setVisible_Elemnts(true);
    }//GEN-LAST:event_rb_passportActionPerformed

    private void rb_passportItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_passportItemStateChanged
        // TODO add your handling code here:
        changerLabel(IdentityType.PASSPORT);
    }//GEN-LAST:event_rb_passportItemStateChanged

    private void rb_CiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_CiItemStateChanged
        // TODO add your handling code here:
        changerLabel(IdentityType.CI);
    }//GEN-LAST:event_rb_CiItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResirvationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResirvationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResirvationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResirvationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResirvationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reserve;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup31;
    private javax.swing.ButtonGroup buttonGroup32;
    private javax.swing.ButtonGroup buttonGroup33;
    private javax.swing.ButtonGroup buttonGroup34;
    private javax.swing.ButtonGroup buttonGroup35;
    private javax.swing.ButtonGroup buttonGroup36;
    private javax.swing.ButtonGroup buttonGroup37;
    private javax.swing.ButtonGroup buttonGroup38;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> cb_depart;
    private javax.swing.JComboBox<String> cb_distination;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JSpinner jSpinner1;
    private com.toedter.calendar.JDateChooser jd_delicration;
    private com.toedter.calendar.JDateChooser jd_expiration;
    private javax.swing.JLabel jl_bagage;
    private javax.swing.JLabel jl_declaration;
    private javax.swing.JLabel jl_expiration;
    private javax.swing.JLabel jl_numPass;
    private javax.swing.JRadioButton rb_Ci;
    private javax.swing.JRadioButton rb_allerSimpl;
    private javax.swing.JRadioButton rb_aller_retour;
    private javax.swing.JRadioButton rb_buissnes;
    private javax.swing.JRadioButton rb_eco;
    private javax.swing.JRadioButton rb_passport;
    private javax.swing.JTextField tf_nom;
    private javax.swing.JTextField tf_num;
    private javax.swing.JTextField tf_prenom;
    // End of variables declaration//GEN-END:variables
}
