/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author uk023
 */
public class membership extends javax.swing.JFrame {

    Connection con=null;
String gender;
Statement s=null;
 PreparedStatement pst=null;
        ResultSet r=null;
        static int num =0;
    /**
     * Creates new form membership
     */
    public membership() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idmembership = new javax.swing.JTextField();
        membershiprate = new javax.swing.JTextField();
        mlength = new javax.swing.JTextField();
        datecreated = new javax.swing.JTextField();
        membershiplevel = new javax.swing.JTextField();
        expirydate = new javax.swing.JTextField();
        SAVE = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        VIEW = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        batch = new javax.swing.JTextField();
        generate = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        receiptarea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idmembership", "membershiprate", "mlength", "datecreated", "expirydate", "membershiplevel", "batch"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 750, 70);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Membership_id");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(175, 224, 120, 16);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Membershiprate");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(171, 281, 130, 16);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Membershiplength");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 340, 140, 16);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Date created ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(174, 388, 130, 16);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Expiry date");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(174, 446, 130, 16);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Membershiplevel");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(172, 500, 140, 16);

        idmembership.setBackground(new java.awt.Color(0, 0, 0));
        idmembership.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(idmembership);
        idmembership.setBounds(443, 221, 150, 30);

        membershiprate.setBackground(new java.awt.Color(0, 0, 0));
        membershiprate.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(membershiprate);
        membershiprate.setBounds(443, 270, 150, 30);

        mlength.setBackground(new java.awt.Color(0, 0, 0));
        mlength.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(mlength);
        mlength.setBounds(443, 330, 150, 30);

        datecreated.setBackground(new java.awt.Color(0, 0, 0));
        datecreated.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(datecreated);
        datecreated.setBounds(443, 377, 150, 30);

        membershiplevel.setBackground(new java.awt.Color(0, 0, 0));
        membershiplevel.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(membershiplevel);
        membershiplevel.setBounds(440, 490, 150, 30);

        expirydate.setBackground(new java.awt.Color(0, 0, 0));
        expirydate.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(expirydate);
        expirydate.setBounds(443, 435, 150, 30);

        SAVE.setBackground(new java.awt.Color(0, 0, 0));
        SAVE.setForeground(new java.awt.Color(255, 255, 0));
        SAVE.setText("SAVE");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });
        jPanel1.add(SAVE);
        SAVE.setBounds(170, 630, 80, 25);

        UPDATE.setBackground(new java.awt.Color(0, 0, 0));
        UPDATE.setForeground(new java.awt.Color(255, 255, 0));
        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE);
        UPDATE.setBounds(279, 630, 100, 25);

        RESET.setBackground(new java.awt.Color(0, 0, 0));
        RESET.setForeground(new java.awt.Color(255, 255, 0));
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        jPanel1.add(RESET);
        RESET.setBounds(400, 630, 100, 25);

        DELETE.setBackground(new java.awt.Color(0, 0, 0));
        DELETE.setForeground(new java.awt.Color(255, 255, 0));
        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel1.add(DELETE);
        DELETE.setBounds(530, 625, 90, 30);

        VIEW.setBackground(new java.awt.Color(0, 0, 0));
        VIEW.setForeground(new java.awt.Color(255, 255, 0));
        VIEW.setText("VIEW");
        VIEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIEWActionPerformed(evt);
            }
        });
        jPanel1.add(VIEW);
        VIEW.setBounds(360, 710, 70, 30);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setForeground(new java.awt.Color(255, 255, 0));
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(20, 20, 90, 30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Batch");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(181, 550, 130, 16);

        batch.setBackground(new java.awt.Color(0, 0, 0));
        batch.setForeground(new java.awt.Color(255, 255, 0));
        batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchActionPerformed(evt);
            }
        });
        jPanel1.add(batch);
        batch.setBounds(440, 550, 150, 30);

        generate.setBackground(new java.awt.Color(0, 0, 0));
        generate.setForeground(new java.awt.Color(255, 255, 0));
        generate.setText("GENERATE");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        jPanel1.add(generate);
        generate.setBounds(1120, 440, 120, 30);

        print.setBackground(new java.awt.Color(0, 0, 0));
        print.setForeground(new java.awt.Color(255, 255, 51));
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(1260, 440, 120, 30);

        receiptarea.setBackground(new java.awt.Color(0, 0, 0));
        receiptarea.setColumns(20);
        receiptarea.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        receiptarea.setForeground(new java.awt.Color(255, 255, 0));
        receiptarea.setRows(5);
        jScrollPane2.setViewportView(receiptarea);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(1050, 50, 380, 350);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\uk023\\OneDrive\\Desktop\\gympics\\gym-wallpapers-31103-4931422.jpg")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 1910, 990);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // TODO add your handling code here:
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
             String query = "insert into membership(idmembership,membershiprate,mlength,datecreated,expirydate,membershiplevel,batch)values(?,?,?,?,?,?,?)";
          PreparedStatement pst=con.prepareStatement(query);
           pst.setString(1,idmembership.getText()); 
          pst.setString(2, membershiprate.getText());
           pst.setString(3, mlength.getText());
           pst.setString(4, datecreated.getText());
           pst.setString(5, expirydate.getText());
            pst.setString(6,membershiplevel.getText());
            pst.setString(7,batch.getText());
            
             
          pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
        
             JOptionPane.showMessageDialog(null, "Inserted Sucessfully!");
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_SAVEActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
         try{ 
            con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
            int row=jTable1.getSelectedRow();
            String value=(jTable1.getModel().getValueAt(row,0).toString());
             
           String query="UPDATE membership SET idmembership=?,membershiprate=?,mlength=?,datecreated=?,expirydate=?,membershiplevel=?,batch=? where idmembership="+value;
        
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,idmembership.getText());
           pst.setString(2, membershiprate.getText());
           pst.setString(3, mlength.getText());
           pst.setString(4, datecreated.getText());
           pst.setString(5, expirydate.getText());
            pst.setString(6, membershiplevel.getText());
                  pst.setString(7, batch.getText());
          
          
            
           
             
          pst.executeUpdate();
          DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
          model.setRowCount(0);
         
          JOptionPane.showMessageDialog(null, "Inserted Sucessfully!");  
          
    }                                         
           catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }                                    
        
    }//GEN-LAST:event_UPDATEActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
           int i = jTable1.getSelectedRow();
        TableModel model =jTable1.getModel();
        idmembership.setText(model.getValueAt(i,0).toString());
        membershiprate.setText(model.getValueAt(i,1).toString());
        mlength.setText(model.getValueAt(i,2).toString());
         datecreated.setText(model.getValueAt(i,3).toString());
          expirydate.setText(model.getValueAt(i,4).toString()); 
           membershiplevel.setText(model.getValueAt(i,5).toString());
           batch.setText(model.getValueAt(i,6).toString());
          
          
    }//GEN-LAST:event_jTable1MouseClicked

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        idmembership.setText("");
        membershiprate.setText("");
        mlength.setText("");
         datecreated.setText("");
          expirydate.setText(""); 
           membershiplevel.setText("");
            batch.setText("");
            receiptarea.setText(""); 

    }//GEN-LAST:event_RESETActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
          try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
            int row=jTable1.getSelectedRow();
             String value=(jTable1.getModel().getValueAt(row,0).toString());
           String query="DELETE FROM membership where idmembership=?";
            PreparedStatement pst=con.prepareStatement(query);
          pst.setString(1,idmembership.getText()); 
           pst.executeUpdate();
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         model.setRowCount(0);
          System.out.println("  items were removed from PALLET");
          JOptionPane.showMessageDialog(null, "Deleted  Sucessfully!"); 
         
         
         
        
        }
         catch(Exception e){ 
            JOptionPane.showMessageDialog(null, e);
        }      
    }//GEN-LAST:event_DELETEActionPerformed

    private void VIEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIEWActionPerformed
        // TODO add your handling code here:
         String query="select idmembership,membershiprate,mlength,datecreated,expirydate,membershiplevel,batch from membership";
        try
        {     con = DriverManager.getConnection("jdbc:mysql://localhost/project1","root","root");
            s=con.createStatement();
            r=s.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel(r));
        }
        catch(Exception e)
        {
        
        }
        
        
    }//GEN-LAST:event_VIEWActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new homepage7().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
      
		try
		{
			FileInputStream fin = new FileInputStream("receipt number.txt");
			int i = 0;
			
			
			while((i = fin.read())!= -1)
			{
                            int num = i;
			}
			
			fin.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e); 
		}
		
        Date obj = new Date();
		
		String date = obj.toString();


		
		receiptarea.setText("\t********************\n");
		
		receiptarea.setText(""+receiptarea.getText()+"\t   FEE RECEIPT\n");
                
                
        
                receiptarea.setText(""+receiptarea.getText()+"DATE \n\n"+date+"\n\n");


		receiptarea.setText(""+receiptarea.getText()+"Member ID         \t:   "+idmembership.getText()+"\n\n");
		receiptarea.setText(""+receiptarea.getText()+"Membership Price  \t:   "+membershiprate.getText()+"\n");
		receiptarea.setText(""+receiptarea.getText()+"Membership length \t:   "+mlength.getText()+"\n");
		receiptarea.setText(""+receiptarea.getText()+"DATE OF JOINING   \t:   "+datecreated.getText()+"\n");
		receiptarea.setText(""+receiptarea.getText()+"ENDING DATE       \t:   "+expirydate.getText()+"\n");
		receiptarea.setText(""+receiptarea.getText()+"CLASS             \t:   "+membershiplevel.getText()+"\n");
		receiptarea.setText(""+receiptarea.getText()+"BATCH             \t:   "+batch.getText()+"\n");
		
		
		
		
	
        
    }//GEN-LAST:event_generateActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        try{
			receiptarea.print();
		}
		catch(Exception e)
		{
			
		}
		
		try
		{
			FileOutputStream fout = new FileOutputStream("receipt number.txt",true);
            
		
			num++;		
			fout.write(num);
			fout.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }//GEN-LAST:event_printActionPerformed

    private void batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batchActionPerformed

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
            java.util.logging.Logger.getLogger(membership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(membership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(membership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(membership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new membership().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SAVE;
    private javax.swing.JButton UPDATE;
    private javax.swing.JButton VIEW;
    private javax.swing.JButton back;
    private javax.swing.JTextField batch;
    private javax.swing.JTextField datecreated;
    private javax.swing.JTextField expirydate;
    private javax.swing.JButton generate;
    private javax.swing.JTextField idmembership;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField membershiplevel;
    private javax.swing.JTextField membershiprate;
    private javax.swing.JTextField mlength;
    private javax.swing.JButton print;
    private javax.swing.JTextArea receiptarea;
    // End of variables declaration//GEN-END:variables
}
