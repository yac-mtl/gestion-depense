/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetre;

import static fenetre.DepenseAffichage.jTextFieldBalance;
import static fenetre.DepenseAffichage.jTextFieldLimitteBalance;
import static fenetre.DepenseAffichage.jButtonAjoutDepense;
import static fenetre.DepenseAffichage.jLabelInformation;
import java.awt.event.KeyEvent;
import javax.management.StringValueExp;
import javax.swing.JOptionPane;

/**
 *
 * @author yacine-pc
 */
public class Preference extends javax.swing.JFrame {

    /**
     * Creates new form Preference
     * 
     */
    
     @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(0); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Preference() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldChoixBalance = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxSelectLangue = new javax.swing.JComboBox<>();
        jButtonValiderLangue = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel9.setText("jLabel9");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Ou");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("ecrivez la somme desiree:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Balance minimale :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 153, 20));

        jTextFieldChoixBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldChoixBalanceKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldChoixBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 143, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Par default");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 204, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jTextField1.setText("Choisissez le montant minimal de la balnce,pour limmiter vos depense");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 410, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Langues :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 110, -1));

        jComboBoxSelectLangue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxSelectLangue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "French", "English", " " }));
        jComboBoxSelectLangue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectLangueActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSelectLangue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 140, -1));

        jButtonValiderLangue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonValiderLangue.setText("Valider");
        jButtonValiderLangue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderLangueActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonValiderLangue, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 80, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Annuler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telecharger-jelly-bean-4-2.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 490, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
         
    
          
          try{
          double limitte =    Double.parseDouble(jTextFieldChoixBalance.getText());
          
          if(Double.parseDouble(jTextFieldChoixBalance.getText()) > Double.parseDouble(jTextFieldBalance.getText())){
               JOptionPane.showMessageDialog(null, "votre balnce est inferieur a ce montant,veillez ajouter de l'argent svp,ou choisir un autre montant","ereur",JOptionPane.ERROR_MESSAGE);
           }
         
       else{
           jTextFieldLimitteBalance.setText(String.valueOf(jTextFieldChoixBalance.getText()));
           jButtonAjoutDepense.setVisible(true);
           jLabelInformation.setVisible(false);
           this.dispose();
      }}catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "veillez ecrire un montant SVP","ereur",JOptionPane.ERROR_MESSAGE);
              }
           JOptionPane.showMessageDialog(null, "veillez selectionner ou ecrire un montant SVP","ereur",JOptionPane.ERROR_MESSAGE);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // fermer cette fenetre et ouvrir la fenetre des operation 
        this.dispose();
        DepenseAffichage dp = new DepenseAffichage();
        dp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextFieldChoixBalance.setText("");
        jTextFieldLimitteBalance.setText("0");
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldChoixBalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldChoixBalanceKeyTyped
        // TODO add your handling code here:
             char n = evt.getKeyChar();
      if (!(Character.isDigit(n)) || (n==KeyEvent.VK_BACK_SPACE)|| (n==KeyEvent.VK_DELETE)){
          evt.consume();
      }
    }//GEN-LAST:event_jTextFieldChoixBalanceKeyTyped

    private void jComboBoxSelectLangueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectLangueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelectLangueActionPerformed

    private void jButtonValiderLangueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderLangueActionPerformed
        // TODO add your handling code here:
        if(jComboBoxSelectLangue.getSelectedItem().toString().equals("French")){
            this.dispose();
            JOptionPane.showMessageDialog(null, "l'application est origine en francais","information",JOptionPane.INFORMATION_MESSAGE);
        }else if(jComboBoxSelectLangue.getSelectedItem().toString().equals("English")){
        this.dispose();
        JOptionPane.showMessageDialog(null, "English will be available soon ,sorry for the inconvenienes","information",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "veillez choisir une option SVP","Erreur",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonValiderLangueActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Preference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preference().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonValiderLangue;
    private javax.swing.JComboBox<String> jComboBoxSelectLangue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextFieldChoixBalance;
    // End of variables declaration//GEN-END:variables
}