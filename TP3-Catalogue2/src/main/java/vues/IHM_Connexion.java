/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vues;

/**
 *
 * @author Sidi Breizh
 */
public class IHM_Connexion extends javax.swing.JFrame {

    /**
     * Creates new form IHM_Connexion
     */
    public IHM_Connexion() {
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

        PannUser = new javax.swing.JPanel();
        lbl_User = new javax.swing.JLabel();
        lbl_Pwd = new javax.swing.JLabel();
        PwdField = new javax.swing.JPasswordField();
        ImageUser_lbl = new javax.swing.JLabel();
        Tf_User = new javax.swing.JTextField();
        PannButton = new javax.swing.JPanel();
        Butt_connexion = new javax.swing.JButton();
        Butt_pwd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_User.setLabelFor(lbl_User);
        lbl_User.setText("Utilisateur :");

        lbl_Pwd.setText("Mot de passe :");

        PwdField.setText("jPasswordField1");
        PwdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwdFieldActionPerformed(evt);
            }
        });

        ImageUser_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N

        Tf_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_UserActionPerformed(evt);
            }
        });

        Butt_connexion.setText("Connexion");
        Butt_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_connexionActionPerformed(evt);
            }
        });

        Butt_pwd.setText("Mot de passe oubli?? ?");
        Butt_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_pwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PannButtonLayout = new javax.swing.GroupLayout(PannButton);
        PannButton.setLayout(PannButtonLayout);
        PannButtonLayout.setHorizontalGroup(
            PannButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannButtonLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(Butt_connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Butt_pwd)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        PannButtonLayout.setVerticalGroup(
            PannButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannButtonLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(PannButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Butt_connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Butt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout PannUserLayout = new javax.swing.GroupLayout(PannUser);
        PannUser.setLayout(PannUserLayout);
        PannUserLayout.setHorizontalGroup(
            PannUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PannButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PannUserLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(PannUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Pwd)
                    .addComponent(lbl_User))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PannUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tf_User)
                    .addComponent(PwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PannUserLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(ImageUser_lbl))
        );
        PannUserLayout.setVerticalGroup(
            PannUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PannUserLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ImageUser_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(PannUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_User)
                    .addComponent(Tf_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(PannUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Pwd)
                    .addComponent(PwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PannButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbl_User.getAccessibleContext().setAccessibleParent(lbl_User);
        ImageUser_lbl.getAccessibleContext().setAccessibleName("Label_Image_User");
        ImageUser_lbl.getAccessibleContext().setAccessibleParent(ImageUser_lbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PannUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PannUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PwdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PwdFieldActionPerformed

    private void Tf_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_UserActionPerformed

    private void Butt_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt_connexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Butt_connexionActionPerformed

    private void Butt_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Butt_pwdActionPerformed

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
            java.util.logging.Logger.getLogger(IHM_Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IHM_Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IHM_Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHM_Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IHM_Connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Butt_connexion;
    private javax.swing.JButton Butt_pwd;
    private javax.swing.JLabel ImageUser_lbl;
    private javax.swing.JPanel PannButton;
    private javax.swing.JPanel PannUser;
    private javax.swing.JPasswordField PwdField;
    private javax.swing.JTextField Tf_User;
    private javax.swing.JLabel lbl_Pwd;
    private javax.swing.JLabel lbl_User;
    // End of variables declaration//GEN-END:variables
}
