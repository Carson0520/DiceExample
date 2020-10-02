/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceexample;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author cars0520
 */


public class DiceGame extends javax.swing.JFrame {
    
    Dice d1,d2;
    public DiceGame() {
        initComponents();
        d1 = new Dice(dicePanel1.getGraphics());
        d2 = new Dice(dicePanel2.getGraphics());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rollbutton = new javax.swing.JButton();
        colorbutton = new javax.swing.JButton();
        dicePanel1 = new javax.swing.JPanel();
        dicePanel2 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rollbutton.setText("Roll");
        rollbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollbuttonActionPerformed(evt);
            }
        });

        colorbutton.setText("Set Dice Color");
        colorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorbuttonActionPerformed(evt);
            }
        });

        dicePanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dicePanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        dicePanel1.setPreferredSize(new java.awt.Dimension(151, 151));

        javax.swing.GroupLayout dicePanel1Layout = new javax.swing.GroupLayout(dicePanel1);
        dicePanel1.setLayout(dicePanel1Layout);
        dicePanel1Layout.setHorizontalGroup(
            dicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        dicePanel1Layout.setVerticalGroup(
            dicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        dicePanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dicePanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        dicePanel2.setName(""); // NOI18N
        dicePanel2.setPreferredSize(new java.awt.Dimension(151, 151));

        javax.swing.GroupLayout dicePanel2Layout = new javax.swing.GroupLayout(dicePanel2);
        dicePanel2.setLayout(dicePanel2Layout);
        dicePanel2Layout.setHorizontalGroup(
            dicePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        dicePanel2Layout.setVerticalGroup(
            dicePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        lblTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTotal.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dicePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rollbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dicePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(colorbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollbutton)
                    .addComponent(colorbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dicePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(dicePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorbuttonActionPerformed
        // TODO add your handling code here:
        Color newColor = JColorChooser.showDialog(this, "Pick New Dice Color", Color.red);
        d1.setColor(newColor);
        d2.setColor(newColor);
        newColor = JColorChooser.showDialog(this,"Choose dot color", Color.black);
        d1.draw();
        d2.draw();
    }//GEN-LAST:event_colorbuttonActionPerformed

    private void rollbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollbuttonActionPerformed
        // TODO add your handling code here:
        d1.roll();
        d2.roll();
        int total = d1.getNumber() + d2.getNumber();
        lblTotal.setText("Total : " + total);
        
    }//GEN-LAST:event_rollbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colorbutton;
    private javax.swing.JPanel dicePanel1;
    private javax.swing.JPanel dicePanel2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JButton rollbutton;
    // End of variables declaration//GEN-END:variables
}
