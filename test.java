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
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author uk023
 */
public class test extends javax.swing.JFrame {
Connection con=null;     
Statement s=null;
PreparedStatement pst=null;
ResultSet r=null;
  String value;
    /**
     * Creates new form test
     */
    public test() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        view = new javax.swing.JButton();
        searchkey = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        mweight = new javax.swing.JTextField();
        ename = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        membershiplevel = new javax.swing.JTextField();
        present_weight = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ENAME = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(876878, 8987898));
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        getContentPane().setLayout(null);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mid", "membname", "weight", "trainername", "EQUIPMENTSUSED", "membershipclass", "present_weight"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(630, 840, 1010, 80);

        view.setBackground(new java.awt.Color(0, 0, 0));
        view.setForeground(new java.awt.Color(255, 255, 0));
        view.setText("view");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(1110, 950, 110, 25);

        searchkey.setBackground(new java.awt.Color(0, 0, 0));
        searchkey.setForeground(new java.awt.Color(255, 255, 0));
        searchkey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchkeyKeyReleased(evt);
            }
        });
        getContentPane().add(searchkey);
        searchkey.setBounds(1320, 580, 127, 30);

        mname.setBackground(new java.awt.Color(0, 0, 0));
        mname.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(mname);
        mname.setBounds(1290, 110, 190, 30);

        mweight.setBackground(new java.awt.Color(0, 0, 0));
        mweight.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(mweight);
        mweight.setBounds(1290, 240, 200, 30);

        ename.setBackground(new java.awt.Color(0, 0, 0));
        ename.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(ename);
        ename.setBounds(1290, 180, 190, 30);

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setForeground(new java.awt.Color(255, 255, 0));
        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(1280, 950, 110, 25);

        membershiplevel.setBackground(new java.awt.Color(0, 0, 0));
        membershiplevel.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(membershiplevel);
        membershiplevel.setBounds(1290, 380, 210, 30);

        present_weight.setBackground(new java.awt.Color(0, 0, 0));
        present_weight.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(present_weight);
        present_weight.setBounds(1300, 450, 200, 30);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setForeground(new java.awt.Color(255, 255, 0));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(72, 27, 100, 25);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("SEARCH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1120, 580, 130, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("MEMBERNAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1100, 130, 130, 16);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("MEMBER WEIGHT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1100, 250, 140, 20);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("TRAINER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1110, 180, 110, 20);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("EQUIPMENTS USED");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1100, 310, 140, 20);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("MEMEBERSHIPLEVEL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1110, 390, 160, 20);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("PRESENT WEIGHT");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1110, 460, 140, 20);

        ENAME.setBackground(new java.awt.Color(0, 0, 0));
        ENAME.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(ENAME);
        ENAME.setBounds(1290, 300, 200, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\uk023\\OneDrive\\Desktop\\gympics\\StoreHD04-1920x1080-6e94ca13436af492c3bb9b7a414d6010.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1920, 1040);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
      
        
        
     
       
        
          
        try
           {  
              
               String query="SELECT m.mid,m.mname,m.mweight,e.ename,c.ENAME ,g.membershiplevel,p.present_weight FROM members m INNER JOIN emp7 e ON (e.eid = m.employeeno) INNER JOIN equipment c ON (c.ENO = m.mid) INNER JOIN membership g ON(g.idmembership=m.mid)INNER JOIN monthlyplanner p ON(p.progid=m.mid)";

               
   //   String query =         SELECT m.mname FROM member mJOIN TABLE_B ON TABLE_A.ID = TABLE_B.ID JOIN TABLE_C ON TABLE_C.ID = TABLE_B.ID



           

               con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
            s=con.createStatement();
            r=s.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel(r));
        }
        catch(Exception e)
        {
        
        }
    }//GEN-LAST:event_viewActionPerformed

    private void searchkeyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchkeyKeyReleased
        // TODO add your handling code here:
            try{
           con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
             String query="SELECT m.mid,m.mname,m.mweight,e.ename,c.ENAME ,g.membershiplevel,p.present_weight FROM members m INNER JOIN emp7 e ON (e.eid = m.employeeno) INNER JOIN equipment c ON (c.ENO = m.mid) INNER JOIN membership g ON(g.idmembership=m.mid)INNER JOIN monthlyplanner p ON(p.progid=m.mid) where m.mid=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, searchkey.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String setid = rs.getString("mname");
                mname.setText(setid);
                
                String setname = rs.getString("mweight");
                mweight.setText(setname);
                String setadd= rs.getString("ename");
                ename.setText(setadd);
                 
                 String setp= rs.getString("c.ENAME");
                 ENAME.setText(setp);
                
           
                
                 String setss= rs.getString("membershiplevel");
                membershiplevel.setText(setss);
                
                
                    String setpp=rs.getString("present_weight");
                present_weight.setText(setpp);
            }       
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchkeyKeyReleased

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
          mname.setText("");
        mweight.setText("");
        ename.setText("");
       ENAME.setText("");
        membershiplevel.setText("");
        present_weight.setText("");
       
    }//GEN-LAST:event_resetActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model =jTable1.getModel();
        searchkey.setText(model.getValueAt(i,0).toString());
        mname.setText(model.getValueAt(i,1).toString());
        mweight.setText(model.getValueAt(i,2).toString());
         ename.setText(model.getValueAt(i,3).toString());
        ENAME.setText(model.getValueAt(i,4).toString()); 
          membershiplevel.setText(model.getValueAt(i,5).toString());
        present_weight.setText(model.getValueAt(i,6).toString()); 
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
          new homepage7().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ENAME;
    private javax.swing.JButton back;
    private javax.swing.JTextField ename;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField membershiplevel;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mweight;
    private javax.swing.JTextField present_weight;
    private javax.swing.JButton reset;
    private javax.swing.JTextField searchkey;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
