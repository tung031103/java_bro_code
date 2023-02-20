package TestGame;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PreZe
 */
public class TicTacToe_Z extends javax.swing.JFrame {

    private String startGame = "x";
    private int xCount = 0;
    private int oCount = 0;

    /**
     * Creates new form TicTacToe_Z
     */
    public TicTacToe_Z() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);
    }

    private void scoreGame() {
        jblUserOne.setText(String.valueOf(xCount));
        JblPlayerTwo.setText(String.valueOf(oCount));
    }

    private void choosePlayer() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";

        }
    }

    private void winGame() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();

        String b12 = jButton12.getText();
        String b13 = jButton13.getText();
        String b10 = jButton10.getText();

        String b15 = jButton15.getText();
        String b14 = jButton14.getText();
        String b11 = jButton11.getText();

        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins! Yay!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoreGame();
            jButton1.setBackground(Color.pink);
            jButton2.setBackground(Color.pink);
            jButton3.setBackground(Color.pink);
        }

        if (b12 == ("X") && b13 == ("X") && b10 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins! Yay!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoreGame();
            jButton12.setBackground(Color.red);
            jButton13.setBackground(Color.red);
            jButton10.setBackground(Color.red);
        }

        if (b15 == ("X") && b14 == ("X") && b11 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins! Yay!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoreGame();
            jButton15.setBackground(Color.orange);
            jButton14.setBackground(Color.orange);
            jButton11.setBackground(Color.orange);
        }
        if (b3 == ("X") && b13 == ("X") && b15 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins! Yay! Please reset game.", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoreGame();
            jButton3.setBackground(Color.pink);
            jButton13.setBackground(Color.pink);
            jButton15.setBackground(Color.pink);
        }

        if (b3 == ("X") && b10 == ("X") && b11 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins! Yay! Please reset game.", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoreGame();
            jButton3.setBackground(Color.pink);
            jButton10.setBackground(Color.pink);
            jButton11.setBackground(Color.pink);
        }

        if (b1 == ("X") && b12 == ("X") && b15 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins! Yay! Please reset game.", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoreGame();
            jButton1.setBackground(Color.pink);
            jButton12.setBackground(Color.pink);
            jButton15.setBackground(Color.pink);
        }

        if (b1 == ("X") && b13 == ("X") && b11 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins! Yay! Please reset game.", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoreGame();
            jButton1.setBackground(Color.pink);
            jButton13.setBackground(Color.pink);
            jButton11.setBackground(Color.pink);
        }
        if (b2 == ("X") && b13 == ("X") && b14 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins! Yay! Please reset game.", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            scoreGame();
            jButton2.setBackground(Color.pink);
            jButton13.setBackground(Color.pink);
            jButton14.setBackground(Color.pink);
        }

        // This is for O count

        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins! Please reset game. ", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoreGame();
            jButton1.setBackground(Color.pink);
            jButton2.setBackground(Color.pink);
            jButton3.setBackground(Color.pink);
        }

        if (b12 == ("O") && b13 == ("O") && b10 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins! Yay!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoreGame();
            jButton12.setBackground(Color.red);
            jButton13.setBackground(Color.red);
            jButton10.setBackground(Color.red);
        }

        if (b15 == ("O") && b14 == ("O") && b11 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins! Yay!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoreGame();
            jButton15.setBackground(Color.orange);
            jButton14.setBackground(Color.orange);
            jButton11.setBackground(Color.orange);
        }
        if (b3 == ("O") && b13 == ("O") && b15 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player o wins! Yay! Please reset game.", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoreGame();
            jButton3.setBackground(Color.pink);
            jButton13.setBackground(Color.pink);
            jButton15.setBackground(Color.pink);
        }
        if (b1 == ("0") && b13 == ("O") && b11 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player o wins! Yay!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoreGame();
            jButton1.setBackground(Color.pink);
            jButton13.setBackground(Color.pink);
            jButton11.setBackground(Color.pink);
        }
        if (b2 == ("O") && b13 == ("O") && b14 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player o wins! Yay! Please reset game.", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoreGame();
            jButton2.setBackground(Color.pink);
            jButton13.setBackground(Color.pink);
            jButton14.setBackground(Color.pink);
        }
        if (b3 == ("O") && b10 == ("O") && b11 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins! Yay! Please reset game.", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoreGame();
            jButton3.setBackground(Color.pink);
            jButton10.setBackground(Color.pink);
            jButton11.setBackground(Color.pink);
        }

        if (b1 == ("O") && b12 == ("O") && b15 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins! Yay! Please reset game.", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            scoreGame();
            jButton1.setBackground(Color.pink);
            jButton12.setBackground(Color.pink);
            jButton15.setBackground(Color.pink);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jblUserOne = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        JblPlayerTwo = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 7));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 98)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic-Tac-Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton4.setText("USER ONE");
        jPanel6.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jblUserOne.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jPanel13.add(jblUserOne, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton9.setText("USER TWO");
        jPanel10.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel14.setLayout(new java.awt.BorderLayout());

        JblPlayerTwo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jPanel14.add(JblPlayerTwo, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton15, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton14, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("18thCentury", 1, 48)); // NOI18N
        jbtnReset.setText("RESET");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("18thCentury", 1, 48)); // NOI18N
        jbtnExit.setText("EXIT");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Tic tac toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            ;
        {
            System.exit(0);
        }
    }// GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);

        jButton12.setText(null);
        jButton13.setText(null);
        jButton10.setText(null);

        jButton15.setText(null);
        jButton14.setText(null);
        jButton11.setText(null);

    }// GEN-LAST:event_jbtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.magenta);
        } else {
            jButton1.setForeground(Color.BLUE);

        }
        choosePlayer();
        winGame();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

        jButton2.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.magenta);
        } else {
            jButton2.setForeground(Color.BLUE);

        }
        choosePlayer();
        winGame();

    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.magenta);
        } else {
            jButton3.setForeground(Color.BLUE);

        }
        choosePlayer();
        winGame();

    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jButton12.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton12.setForeground(Color.magenta);
        } else {
            jButton12.setForeground(Color.BLUE);

        }
        choosePlayer();
        winGame();
    }// GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jButton13.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton13.setForeground(Color.magenta);
        } else {
            jButton13.setForeground(Color.BLUE);

        }
        choosePlayer();
        winGame();
    }// GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton10.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton10.setForeground(Color.magenta);
        } else {
            jButton10.setForeground(Color.BLUE);

        }
        choosePlayer();
        winGame();
    }// GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        jButton15.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton15.setForeground(Color.magenta);
        } else {
            jButton15.setForeground(Color.BLUE);

        }
        choosePlayer();
        winGame();
    }// GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jButton14.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton14.setForeground(Color.magenta);
        } else {
            jButton14.setForeground(Color.BLUE);

        }
        choosePlayer();
        winGame();
    }// GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jButton11.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton11.setForeground(Color.magenta);
        } else {
            jButton11.setForeground(Color.BLUE);

        }
        choosePlayer();
        winGame();
    }// GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Z.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Z.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Z.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Z.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_Z().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JblPlayerTwo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jblUserOne;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    // End of variables declaration//GEN-END:variables
}
