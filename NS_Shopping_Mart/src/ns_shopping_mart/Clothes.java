/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ns_shopping_mart;

import java.io.FileWriter;

/**
 *
 * @author Anjan
 */
public class Clothes extends javax.swing.JFrame {

    /**
     * Creates new form Clothes
     */
    public Clothes() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton_item13 = new javax.swing.JRadioButton();
        jRadioButton_item14 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton_item15 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton_item16 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("item 13");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 20, 60, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price : 800");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 80, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\NS_Shopping_Mart\\Image\\5bf3ac0cadb89e7512bce8f9-large.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 230, 210);

        jPanel2.setLayout(null);

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("item 14");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 30, 42, 16);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Price : 2000");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 10, 80, 16);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\NS_Shopping_Mart\\Image\\Men-Jacket-Denim-Jeans-Jackets-and-Coats-for-Autumn-Casual-Slim-Brand-Clothing-Cowboy-Jeans-Jacket__52262.1544706708.jpg")); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 0, 200, 200);

        jRadioButton_item13.setBackground(new java.awt.Color(153, 255, 153));
        jRadioButton_item13.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton_item13.setText("Add to cart");
        jRadioButton_item13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_item13ActionPerformed(evt);
            }
        });

        jRadioButton_item14.setBackground(new java.awt.Color(153, 255, 153));
        jRadioButton_item14.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton_item14.setText("Add to cart");
        jRadioButton_item14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_item14ActionPerformed(evt);
            }
        });

        jPanel3.setLayout(null);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("item 15");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(160, 80, 50, 16);

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Price : 2000");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(150, 60, 70, 16);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\NS_Shopping_Mart\\Image\\05669518_zi_red.jpg")); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(-20, 0, 250, 240);

        jRadioButton_item15.setBackground(new java.awt.Color(153, 255, 153));
        jRadioButton_item15.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton_item15.setText("Add to cart");
        jRadioButton_item15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_item15ActionPerformed(evt);
            }
        });

        jPanel4.setLayout(null);

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("item 16");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 80, 48, 16);

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Price : 1000");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(0, 60, 70, 16);

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\NS_Shopping_Mart\\Image\\x_ge6275-800x800.jpg")); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(0, 0, 180, 240);

        jRadioButton_item16.setBackground(new java.awt.Color(153, 255, 153));
        jRadioButton_item16.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton_item16.setText("Add to cart");
        jRadioButton_item16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_item16ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Bye Now");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Enter id :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jRadioButton_item15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jRadioButton_item13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton_item14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton_item16, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_item13)
                    .addComponent(jRadioButton_item14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_item15)
                    .addComponent(jRadioButton_item16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
long i=0,item13=800,item14=2000,item15 = 2000,item16=1000,price=0;
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
           if( jRadioButton_item13.isSelected())
        {
        price = price + item13;
        i++;
        }
        if( jRadioButton_item14.isSelected())
        {
        price = price + item14;
        i++;
        }
        if( jRadioButton_item15.isSelected())
        {
        price = price + item15;
        i++;
        }
        if( jRadioButton_item16.isSelected())
        {
        price = price + item16;
        i++;
        }
        try{
             String id = jTextField_id.getText();
             String N_price = Long.toString(price);
             String count = Long.toString(i);
             
                    
        FileWriter fw = new FileWriter("E:\\Clothes.txt",false);
        fw.write(id+"\n");
        fw.write(N_price+"\n");
        fw.write(count+"\n");
      

        
        fw.close();
        System.out.println("Saved");
        
        
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
         
         Clothes_shoping mf = new Clothes_shoping();
         mf.setVisible(true);
         mf.pack();
         mf.setLocationRelativeTo(null);
         this.dispose();
         
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jRadioButton_item13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_item13ActionPerformed
        jRadioButton_item13.isSelected();
    }//GEN-LAST:event_jRadioButton_item13ActionPerformed

    private void jRadioButton_item14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_item14ActionPerformed
        jRadioButton_item14.isSelected();
    }//GEN-LAST:event_jRadioButton_item14ActionPerformed

    private void jRadioButton_item15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_item15ActionPerformed
       jRadioButton_item15.isSelected();
    }//GEN-LAST:event_jRadioButton_item15ActionPerformed

    private void jRadioButton_item16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_item16ActionPerformed
        jRadioButton_item16.isSelected();
    }//GEN-LAST:event_jRadioButton_item16ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         Home_page mf = new Home_page();
         mf.setVisible(true);
         mf.pack();
         mf.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clothes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clothes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton_item13;
    private javax.swing.JRadioButton jRadioButton_item14;
    private javax.swing.JRadioButton jRadioButton_item15;
    private javax.swing.JRadioButton jRadioButton_item16;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
