
import Connection.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author StatiSense
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        updateDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void updateDB(){
        int y;
        
        try{
             Connection conn = ConnectionProvider.getCon();
         Statement stm = conn.createStatement();
         ResultSet rst = stm.executeQuery("SELECT * FROM nd2");
         ResultSetMetaData x = rst.getMetaData();
         y = x.getColumnCount();
          
         DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel(); 
         dtm.setRowCount(0);
         
         while(rst.next()){
             Vector column = new Vector();
                for(int i = 1; i <= y; i++){
                 column.add(rst.getString("studentID"));
                 column.add(rst.getString("FullName"));
                 column.add(rst.getString("COM211"));
                 column.add(rst.getString("COM212"));
                 column.add(rst.getString("COM213"));
                 column.add(rst.getString("COM214"));
                 column.add(rst.getString("COM215"));
                 column.add(rst.getString("COM216"));
                 column.add(rst.getString("SIW219"));
                 column.add(rst.getString("GNS201"));
                 column.add(rst.getString("EED216"));
                }
                 dtm.addRow(column);
            }
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
        }
        
    }
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("RESULT ENTRY FORM FOR ND 2 FIRST SEMESTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("MATRIC NO");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("NAME");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("COM 212");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 89, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("COM 213");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("COM 214");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 171, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("COM 215");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 212, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("COM 216");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 253, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("SIW 219");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 294, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("GNS 201");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 335, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("EED 216");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 376, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("COM 211");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 48, -1, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel7.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 45, 230, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel7.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 86, 230, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 127, 230, -1));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 168, 230, -1));

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 209, 230, -1));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 230, -1));

        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 291, 230, -1));

        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 332, 230, -1));

        jTextField11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel7.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 373, 230, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 390, 430));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 240, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 240, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 520));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRIC NO", "NAME", "COM 211", "COM 212", "COM 213", "COM 214", "COM 215", "COM 216", "SIW 219", "GNS 201", "EED 216"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 930, 520));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1450, 520));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 1340, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");    
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
    jTextField9.setText("");
    jTextField10.setText("");
    jTextField11.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       int z = JOptionPane.showConfirmDialog(null,"Do you really want to close this page", "Select", JOptionPane.YES_NO_OPTION);
        if(z == 0){
            setVisible(false);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String id = jTextField1.getText();
    String name = jTextField2.getText();
    String a = jTextField3.getText();
    String b = jTextField4.getText();
    String c = jTextField5.getText();
    String d = jTextField6.getText();
    String e = jTextField7.getText();
    String f = jTextField8.getText();
    String g = jTextField9.getText();
    String h = jTextField10.getText();
    String i = jTextField11.getText();
    
    try{
       Connection conn = ConnectionProvider.getCon();
       Statement stm = conn.createStatement();
       stm.executeUpdate("INSERT INTO nd2 values ('"+id+"', '"+name+"', '"+a+"', '"+b+"', '"+c+"', '"+d+"', '"+e+"','"+f+"', '"+g+"', '"+h+"', '"+i+"')");
        JOptionPane.showMessageDialog(null, "Result saved successfully");
        setVisible(true);
           updateDB();
    }
    catch(Exception ex){
       JOptionPane.showMessageDialog(null, "Incorrect Data format or ID is repeated");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel(); 
         dtm.setRowCount(0);
         String mat = jTextField1.getText();
         
         try{
             int deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete Item","Warning!",JOptionPane.YES_NO_OPTION);
           if(deleteItem == JOptionPane.YES_OPTION){
            
            Connection conn = ConnectionProvider.getCon();
           Statement stm = conn.createStatement();
           
           stm.executeUpdate("delete from nd2 where studentid = '"+mat+"'");
           updateDB();
           
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        
        }
    }
         
         catch(Exception e){
             JOptionPane.showMessageDialog(null,"Oops, something went wrong"); 
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
      
       jTextField1.setText(dtm.getValueAt( selectedRow, 0).toString());
       jTextField2.setText(dtm.getValueAt( selectedRow, 1).toString());
       jTextField3.setText(dtm.getValueAt( selectedRow, 2).toString());
       jTextField4.setText(dtm.getValueAt( selectedRow, 3).toString());
       jTextField5.setText(dtm.getValueAt( selectedRow, 4).toString());
       jTextField6.setText(dtm.getValueAt( selectedRow, 5).toString());
       jTextField7.setText(dtm.getValueAt( selectedRow, 6).toString());
       jTextField8.setText(dtm.getValueAt( selectedRow, 7).toString());
       jTextField9.setText(dtm.getValueAt( selectedRow, 8).toString());
       jTextField10.setText(dtm.getValueAt( selectedRow, 9).toString());
       jTextField11.setText(dtm.getValueAt( selectedRow, 9).toString());
      
       jTable1.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         MessageFormat header = new MessageFormat("Printing in progress");
         MessageFormat footer = new MessageFormat("Page {0, number, integer}");
         
         try{
              jTable1.print(JTable.PrintMode.NORMAL, header, footer); 
         }
         catch(java.awt.print.PrinterException e){
             System.err.format("No Printer Found!", e.getMessage());
         }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
