/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author uk023
 */
public class progress extends javax.swing.JFrame {
 Connection con=null;
String gender;
Statement s=null;
 PreparedStatement pst=null;
        ResultSet r=null;
    /**
     * Creates new form progress
     */
    public progress() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        progid = new javax.swing.JTextField();
        present_weight = new javax.swing.JTextField();
        calories_burnt = new javax.swing.JTextField();
        date_checked = new javax.swing.JTextField();
        calorie_intake = new javax.swing.JTextField();
        target_weight = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        view = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "progid", "present_weight", "calories_burnt", "date_checked", "calorie_intake", "target_weight"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(104, 100, 886, 90);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("PROGRESS_ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(235, 238, 110, 16);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("PRESENT WEIGHT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(235, 286, 130, 16);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("CALORIES BURNT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(235, 332, 120, 16);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("DATE CHECKED ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(235, 379, 120, 16);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("MAX. CALORIE INTAKE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(235, 444, 140, 16);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("TARGET WEIGHT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(235, 501, 120, 16);

        progid.setBackground(new java.awt.Color(0, 0, 0));
        progid.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(progid);
        progid.setBounds(498, 232, 157, 22);

        present_weight.setBackground(new java.awt.Color(0, 0, 0));
        present_weight.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(present_weight);
        present_weight.setBounds(498, 283, 157, 22);

        calories_burnt.setBackground(new java.awt.Color(0, 0, 0));
        calories_burnt.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(calories_burnt);
        calories_burnt.setBounds(498, 329, 157, 22);

        date_checked.setBackground(new java.awt.Color(0, 0, 0));
        date_checked.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(date_checked);
        date_checked.setBounds(498, 376, 157, 22);

        calorie_intake.setBackground(new java.awt.Color(0, 0, 0));
        calorie_intake.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(calorie_intake);
        calorie_intake.setBounds(498, 441, 157, 22);

        target_weight.setBackground(new java.awt.Color(0, 0, 0));
        target_weight.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(target_weight);
        target_weight.setBounds(498, 498, 157, 22);

        Save.setBackground(new java.awt.Color(0, 0, 0));
        Save.setForeground(new java.awt.Color(255, 255, 0));
        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save);
        Save.setBounds(720, 250, 90, 25);

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setForeground(new java.awt.Color(255, 255, 0));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(720, 300, 90, 25);

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setForeground(new java.awt.Color(255, 255, 0));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(720, 360, 90, 25);

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setForeground(new java.awt.Color(255, 255, 0));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(720, 420, 90, 25);

        view.setBackground(new java.awt.Color(0, 0, 0));
        view.setForeground(new java.awt.Color(255, 255, 0));
        view.setText("VIEW");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view);
        view.setBounds(720, 480, 90, 25);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setForeground(new java.awt.Color(255, 255, 0));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(28, 39, 90, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\uk023\\OneDrive\\Desktop\\gympics\\robot_dumbell-20.jpg")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 1920, 1050);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new homepage7().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        String query="select progid,present_weight,calories_burnt,date_checked,calorie_intake,target_weight from monthlyplanner";
        try
        {     con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
            s=con.createStatement();
            r=s.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel(r));
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_viewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
            int row=jTable1.getSelectedRow();
            String value=(jTable1.getModel().getValueAt(row,0).toString());
            String query="DELETE FROM monthlyplanner where progid=?";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,progid.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            System.out.println("  items were removed from PALLET");
            JOptionPane.showMessageDialog(null, "Deleted  Sucessfully!");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:

        progid.setText("");
        present_weight.setText("");
        calories_burnt.setText("");
        date_checked.setText("");
        calorie_intake.setText("");
        target_weight.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
            int row=jTable1.getSelectedRow();
            String value=(jTable1.getModel().getValueAt(row,0).toString());

            String query="UPDATE monthlyplanner SET progid=?,present_weight=?,calories_burnt=?,date_checked=?,calorie_intake=?,target_weight=? where progid="+value;

            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,progid.getText());
            pst.setString(2, present_weight.getText());
            pst.setString(3, calories_burnt.getText());
            pst.setString(4, date_checked.getText());

            pst.setString(5, calorie_intake.getText());
            pst.setString(6, target_weight.getText());

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);

            JOptionPane.showMessageDialog(null, "Inserted Sucessfully!");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
            String query = "insert into monthlyplanner(progid,present_weight,calories_burnt,date_checked,calorie_intake,target_weight)values(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,progid.getText());
            pst.setString(2, present_weight.getText());
            pst.setString(3, calories_burnt.getText());
            pst.setString(4, date_checked.getText());
            pst.setString(5, calorie_intake.getText());
            pst.setString(6, target_weight.getText());

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);

            JOptionPane.showMessageDialog(null, "Inserted Sucessfully!");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model =jTable1.getModel();
        progid.setText(model.getValueAt(i,0).toString());
        present_weight.setText(model.getValueAt(i,1).toString());
        calories_burnt.setText(model.getValueAt(i,2).toString());
        date_checked.setText(model.getValueAt(i,3).toString());
        calorie_intake.setText(model.getValueAt(i,4).toString());
        target_weight.setText(model.getValueAt(i,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new progress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton back;
    private javax.swing.JTextField calorie_intake;
    private javax.swing.JTextField calories_burnt;
    private javax.swing.JTextField date_checked;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField present_weight;
    private javax.swing.JTextField progid;
    private javax.swing.JButton reset;
    private javax.swing.JTextField target_weight;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
