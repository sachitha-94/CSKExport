/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sajja
 */
public class AdminChangePasswordForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChangePasswordForm
     */
    public AdminChangePasswordForm() {

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cPasswordField = new javax.swing.JPasswordField();
        nPasswordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        rnPasswordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        massage_1_Label = new javax.swing.JLabel();
        massage_3_Label = new javax.swing.JLabel();
        massage_2_Label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setText("current password :");

        cPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPasswordFieldActionPerformed(evt);
            }
        });
        cPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cPasswordFieldKeyPressed(evt);
            }
        });

        nPasswordField.setEditable(false);
        nPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPasswordFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("new password :");

        rnPasswordField.setEditable(false);
        rnPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnPasswordFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel6.setText("re-type new password :");

        okButton.setBackground(new java.awt.Color(51, 102, 255));
        okButton.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        okButton.setText("ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                okButtonKeyPressed(evt);
            }
        });

        massage_1_Label.setForeground(new java.awt.Color(255, 51, 51));

        massage_3_Label.setForeground(new java.awt.Color(255, 0, 0));

        massage_2_Label.setForeground(new java.awt.Color(0, 255, 51));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Change PassWord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rnPasswordField)
                                    .addComponent(nPasswordField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                            .addComponent(massage_3_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(massage_2_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(massage_1_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(massage_1_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(massage_2_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rnPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(massage_3_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPasswordFieldActionPerformed
//        String cTpassword = "";
//        String checkPassword = "";
//
//        massage_1_Label.setText("");
//        massage_2_Label.setText("");
//
//        char[] cpassword1 = cPasswordField.getPassword();
//        for (int i = 0; i < cpassword1.length; i++) {
//            cTpassword += cpassword1[i];
//
//        }
//
//        try {
//            checkPassword = LogInController.checkPassword();
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(adminChangePasswordForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        if (cTpassword.equals(checkPassword)) {
//
//            massage_2_Label.setText("Type new password");
//
//            nPasswordField.setEditable(true);
//
//            nPasswordField.requestFocus();
//
//        } else {
//            cPasswordField.setText("");
//            massage_1_Label.setText("Error password");
//        }


    }//GEN-LAST:event_cPasswordFieldActionPerformed

    private void cPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPasswordFieldKeyPressed

    }//GEN-LAST:event_cPasswordFieldKeyPressed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
//        String nTpassword = "";
//        String rnTpassword = "";
//        String cTpassword = "";
//        String checkPassword = "";
//
//        massage_2_Label.setText("");
//
//        char[] cpassword1 = cPasswordField.getPassword();
//        for (int i = 0; i < cpassword1.length; i++) {
//            cTpassword += cpassword1[i];
//
//        }
//        try {
//            checkPassword = LogInController.checkPassword();
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(adminChangePasswordForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        char[] npassword1 = nPasswordField.getPassword();
//        for (int i = 0; i < npassword1.length; i++) {
//            nTpassword += npassword1[i];
//
//        }
//
//        char[] npassword2 = rnPasswordField.getPassword();
//        for (int i = 0; i < npassword2.length; i++) {
//            rnTpassword += npassword2[i];
//
//        }
//        if (nTpassword.equals(rnTpassword) & cTpassword.equals(checkPassword)) {
//
//            try {
//                int update = LogInController.update(nTpassword);
//                if (update > 0) {
//                    JOptionPane.showMessageDialog(rootPane, "password changed");
//                    nPasswordField.setText("");
//                    rnPasswordField.setText("");
//                    cPasswordField.setText("");
//                }
//            } catch (ClassNotFoundException | SQLException ex) {
//                Logger.getLogger(adminChangePasswordForm.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            massage_3_Label.setText("don't match with new password");
//            nPasswordField.setText("");
//            rnPasswordField.setText("");
//
//            nPasswordField.requestFocus();
//
//        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void nPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPasswordFieldActionPerformed
//        massage_3_Label.setText("");
//        massage_2_Label.setText("re-type new password");
//        rnPasswordField.setEditable(true);
//        rnPasswordField.requestFocus();
    }//GEN-LAST:event_nPasswordFieldActionPerformed

    private void rnPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnPasswordFieldActionPerformed
//        massage_2_Label.setText("");
//        okButton.requestFocus();
    }//GEN-LAST:event_rnPasswordFieldActionPerformed

    private void okButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okButtonKeyPressed
//        String nTpassword = "";
//        String rnTpassword = "";
//        String cTpassword = "";
//        String checkPassword = "";
//
//        massage_2_Label.setText("");
//
//        char[] cpassword1 = cPasswordField.getPassword();
//        for (int i = 0; i < cpassword1.length; i++) {
//            cTpassword += cpassword1[i];
//
//        }
//        try {
//            checkPassword = LogInController.checkPassword();
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(adminChangePasswordForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        char[] npassword1 = nPasswordField.getPassword();
//        for (int i = 0; i < npassword1.length; i++) {
//            nTpassword += npassword1[i];
//
//        }
//
//        char[] npassword2 = rnPasswordField.getPassword();
//        for (int i = 0; i < npassword2.length; i++) {
//            rnTpassword += npassword2[i];
//
//        }
//        if (nTpassword.equals(rnTpassword) & cTpassword.equals(checkPassword)) {
//
//            try {
//                int update = LogInController.update(nTpassword);
//                if (update > 0) {
//                    JOptionPane.showMessageDialog(rootPane, "password changed");
//                    nPasswordField.setText("");
//                    rnPasswordField.setText("");
//                    cPasswordField.setText("");
//                }
//            } catch (ClassNotFoundException | SQLException ex) {
//                Logger.getLogger(adminChangePasswordForm.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            massage_3_Label.setText("don't match with new password");
//            nPasswordField.setText("");
//            rnPasswordField.setText("");
//
//            nPasswordField.requestFocus();
//
//        }
    }//GEN-LAST:event_okButtonKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cPasswordField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel massage_1_Label;
    private javax.swing.JLabel massage_2_Label;
    private javax.swing.JLabel massage_3_Label;
    private javax.swing.JPasswordField nPasswordField;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField rnPasswordField;
    // End of variables declaration//GEN-END:variables
}