/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newspaper.agency.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Anant
 */
public class Add_newspaper extends javax.swing.JFrame {

    Connection conn= null;
PreparedStatement pst=null;
ResultSet rs=null;

    /**
     * Creates new form Add_newspaper
     */
    public Add_newspaper() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnews_name = new javax.swing.JTextField();
        txtnews_lang = new javax.swing.JTextField();
        txtnews_price = new javax.swing.JTextField();
        txtnews_quan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Language");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Quantity");

        txtnews_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnews_nameKeyPressed(evt);
            }
        });

        txtnews_lang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnews_langKeyPressed(evt);
            }
        });

        txtnews_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnews_priceKeyPressed(evt);
            }
        });

        txtnews_quan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnews_quanActionPerformed(evt);
            }
        });
        txtnews_quan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnews_quanKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anant\\AppData\\Local\\Temp\\icons8_Back_26px_1.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anant\\AppData\\Local\\Temp\\icons8_Save_32px_2.png")); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel6.setText("NEWSPAPER DETAILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnews_name)
                                .addComponent(txtnews_quan, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                            .addComponent(txtnews_lang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnews_price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnews_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnews_lang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnews_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnews_quan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnews_quanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnews_quanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnews_quanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        conn=Connects.Connectnams();
        String s="insert into add_news(news_id,news_name,news_lang,news_price,news_quan) values (?,?,?,?,?)";
        try
        {
            pst=conn.prepareStatement(s);
            pst.setString(1,null);
            pst.setString(2,txtnews_name.getText());
            pst.setString(3,txtnews_lang.getText());
            pst.setString(4,txtnews_price.getText());
            pst.setString(5,txtnews_quan.getText());
           
           

            
           
            pst.execute();

           // if(rs.next())
            //{
                //close();
               JOptionPane.showMessageDialog(null,"Records Added Successfully ","Congratulations",JOptionPane.INFORMATION_MESSAGE);
               Add_newspaper an=new Add_newspaper();
               setVisible(false);
            //}
           // else
           // {
           //     JOptionPane.showMessageDialog(null,"Invalid Data","Access Denied", JOptionPane.ERROR_MESSAGE);
           // }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
                                            


    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnews_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnews_nameKeyPressed
        int s=evt.getKeyCode();
        String input=txtnews_name.getText();
        if((s>=evt.VK_A && s<=evt.VK_Z)||s==com.sun.glass.events.KeyEvent.VK_BACKSPACE||s==com.sun.glass.events.KeyEvent.VK_SPACE)
        {
            txtnews_name.setEditable(true);
        }
        else
        {
            txtnews_name.setEditable(false);
          
        }
    }//GEN-LAST:event_txtnews_nameKeyPressed

    private void txtnews_langKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnews_langKeyPressed
         int s=evt.getKeyCode();
        String input=txtnews_lang.getText();
        if((s>=evt.VK_A && s<=evt.VK_Z)||s==com.sun.glass.events.KeyEvent.VK_BACKSPACE||s==com.sun.glass.events.KeyEvent.VK_SPACE)
        {
            txtnews_lang.setEditable(true);
        }
        else
        {
            txtnews_lang.setEditable(false);
          
        }
    }//GEN-LAST:event_txtnews_langKeyPressed

    private void txtnews_priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnews_priceKeyPressed
          int s=evt.getKeyCode();
        String input=txtnews_price.getText();
        if((s>=evt.VK_NUMPAD0 && s<=evt.VK_NUMPAD9)||s==com.sun.glass.events.KeyEvent.VK_BACKSPACE)
        {
            txtnews_price.setEditable(true);
        }
        else
        {
            txtnews_price.setEditable(false);
          
        }
    }//GEN-LAST:event_txtnews_priceKeyPressed

    private void txtnews_quanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnews_quanKeyPressed
         int s=evt.getKeyCode();
        String input=txtnews_quan.getText();
        if((s>=evt.VK_NUMPAD0 && s<=evt.VK_NUMPAD9)||s==com.sun.glass.events.KeyEvent.VK_BACKSPACE)
        {
            txtnews_quan.setEditable(true);
        }
        else
        {
            txtnews_quan.setEditable(false);
          
        }
    }//GEN-LAST:event_txtnews_quanKeyPressed

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
            java.util.logging.Logger.getLogger(Add_newspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_newspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_newspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_newspaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_newspaper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtnews_lang;
    private javax.swing.JTextField txtnews_name;
    private javax.swing.JTextField txtnews_price;
    private javax.swing.JTextField txtnews_quan;
    // End of variables declaration//GEN-END:variables
}
