package javaapplication1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uk023
 */
public class homepage7 extends javax.swing.JFrame {
Connection con=null;
    /**
     * Creates new form homepage7
     */
    public homepage7() {
        initComponents();
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Members = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Employee = new javax.swing.JButton();
        equipments = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        MEMBERSHIP = new javax.swing.JButton();
        PROGRESS = new javax.swing.JButton();
        SEARCH = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(50);
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(7787, 878787));
        setResizable(false);
        setSize(new java.awt.Dimension(75, 10));

        jPanel1.setLayout(null);

        Members.setBackground(new java.awt.Color(0, 0, 0));
        Members.setForeground(new java.awt.Color(255, 255, 0));
        Members.setText("MEMBERS");
        Members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembersActionPerformed(evt);
            }
        });
        jPanel1.add(Members);
        Members.setBounds(156, 160, 269, 94);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("WELCOME TO HOMEPAGE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(135, 13, 780, 70);

        Employee.setBackground(new java.awt.Color(0, 0, 0));
        Employee.setForeground(new java.awt.Color(255, 255, 51));
        Employee.setText("EMPLOYEE");
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(Employee);
        Employee.setBounds(160, 300, 269, 101);

        equipments.setBackground(new java.awt.Color(0, 0, 0));
        equipments.setForeground(new java.awt.Color(255, 255, 0));
        equipments.setText("EQUIPMENTS");
        equipments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentsActionPerformed(evt);
            }
        });
        jPanel1.add(equipments);
        equipments.setBounds(160, 440, 269, 89);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(160, 830, 270, 90);

        MEMBERSHIP.setBackground(new java.awt.Color(0, 0, 0));
        MEMBERSHIP.setForeground(new java.awt.Color(255, 255, 0));
        MEMBERSHIP.setText("MEMBERSHIP");
        MEMBERSHIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEMBERSHIPActionPerformed(evt);
            }
        });
        jPanel1.add(MEMBERSHIP);
        MEMBERSHIP.setBounds(160, 560, 270, 90);

        PROGRESS.setBackground(new java.awt.Color(0, 0, 0));
        PROGRESS.setForeground(new java.awt.Color(255, 255, 0));
        PROGRESS.setText("PROGRESS");
        PROGRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROGRESSActionPerformed(evt);
            }
        });
        jPanel1.add(PROGRESS);
        PROGRESS.setBounds(160, 680, 270, 100);

        SEARCH.setBackground(new java.awt.Color(0, 0, 0));
        SEARCH.setForeground(new java.awt.Color(255, 255, 0));
        SEARCH.setText("SEARCH");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });
        jPanel1.add(SEARCH);
        SEARCH.setBounds(1670, 70, 150, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\uk023\\OneDrive\\Desktop\\gympics\\196010.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1910, 1060);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1905, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          new NewJFrame().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void MembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembersActionPerformed
        // TODO add your handling code here:
        memberdetails mem=new memberdetails();
        mem.setVisible(true);
     
    }//GEN-LAST:event_MembersActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        // TODO add your handling code here:
        employee emp=new employee();
        emp.setVisible(true);
    }//GEN-LAST:event_EmployeeActionPerformed

    private void equipmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentsActionPerformed
        // TODO add your handling code here:
        equip7 eq=new equip7();
        eq.setVisible(true);
    }//GEN-LAST:event_equipmentsActionPerformed

    private void PROGRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROGRESSActionPerformed
        // TODO add your handling code here:
        progress p=new progress();
        p.setVisible(true);
    }//GEN-LAST:event_PROGRESSActionPerformed

    private void MEMBERSHIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEMBERSHIPActionPerformed
        // TODO add your handling code here:
        membership mp=new membership();
        mp.setVisible(true);
        
    }//GEN-LAST:event_MEMBERSHIPActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
        test t=new test();
        t.setVisible(true);
        
    }//GEN-LAST:event_SEARCHActionPerformed

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
            java.util.logging.Logger.getLogger(homepage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Employee;
    private javax.swing.JButton MEMBERSHIP;
    private javax.swing.JButton Members;
    private javax.swing.JButton PROGRESS;
    private javax.swing.JButton SEARCH;
    private javax.swing.JButton equipments;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
