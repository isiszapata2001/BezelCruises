/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.ConexionBasedeDatos;

/**
 *
 * @author Maykin Perdomo
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public frmLogin() {
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

        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel4 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        Pswusuario = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Btningresar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(0, 90, 130));
        panel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICONO.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel1.add(jLabel2);
        jLabel2.setBounds(10, 100, 200, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/bezel_cruises.png"))); // NOI18N
        jLabel9.setToolTipText("");
        panel1.add(jLabel9);
        jLabel9.setBounds(10, 290, 210, 50);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1);
        jButton1.setBounds(120, 380, 73, 23);

        getContentPane().add(panel1);
        panel1.setBounds(280, 130, 220, 460);

        panel4.setBackground(new java.awt.Color(33, 45, 62));
        panel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        panel4.add(jLabel3);
        jLabel3.setBounds(126, 42, 128, 28);
        jLabel3.getAccessibleContext().setAccessibleName("Iniciar_Sesion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");
        panel4.add(jLabel4);
        jLabel4.setBounds(41, 134, 70, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");
        panel4.add(jLabel5);
        jLabel5.setBounds(40, 220, 70, 17);

        txtusuario.setBackground(new java.awt.Color(33, 45, 62));
        txtusuario.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setBorder(null);
        txtusuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtusuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtusuarioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        panel4.add(txtusuario);
        txtusuario.setBounds(110, 160, 160, 33);

        Pswusuario.setBackground(new java.awt.Color(33, 45, 62));
        Pswusuario.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Pswusuario.setForeground(new java.awt.Color(255, 255, 255));
        Pswusuario.setBorder(null);
        panel4.add(Pswusuario);
        Pswusuario.setBounds(110, 250, 170, 34);
        panel4.add(jSeparator1);
        jSeparator1.setBounds(69, 201, 214, 4);
        panel4.add(jSeparator2);
        jSeparator2.setBounds(69, 291, 214, 2);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconousuario.png"))); // NOI18N
        panel4.add(jLabel7);
        jLabel7.setBounds(40, 160, 30, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Passwicono.png"))); // NOI18N
        jLabel6.setRequestFocusEnabled(false);
        panel4.add(jLabel6);
        jLabel6.setBounds(40, 250, 30, 40);

        Btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btningresar.png"))); // NOI18N
        Btningresar.setBorderPainted(false);
        Btningresar.setContentAreaFilled(false);
        Btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtningresarActionPerformed(evt);
            }
        });
        panel4.add(Btningresar);
        Btningresar.setBounds(70, 340, 190, 40);

        jCheckBox1.setBackground(new java.awt.Color(33, 45, 62));
        jCheckBox1.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Mostrar Contraseña");
        jCheckBox1.setBorder(null);
        panel4.add(jCheckBox1);
        jCheckBox1.setBounds(40, 300, 140, 25);

        getContentPane().add(panel4);
        panel4.setBounds(500, 130, 350, 460);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crucero.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1100, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtusuarioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioAncestorAdded

    private void BtningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtningresarActionPerformed
  frmAgentes frm = new  frmAgentes();
  frm.setVisible(true);
  frm.dispose();
    }//GEN-LAST:event_BtningresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  frmMenuPrincipal frm1 = new  frmMenuPrincipal();
  frm1.show(true);
  this.hide();        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btningresar;
    private javax.swing.JPasswordField Pswusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel4;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
