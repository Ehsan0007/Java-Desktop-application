/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Wasif Boss
 */
public class basic extends javax.swing.JFrame {

    /**
     * Creates new form leave_setting
     */
    public basic() {
        initComponents();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/addstudent","root","");
        
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtempid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtdepartment = new javax.swing.JTextField();
        txtdesignation = new javax.swing.JTextField();
        txtdateofjoining = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtsalarytype = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtsalaryamount = new javax.swing.JTextField();
        btnexit = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Constantia", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Basic Salary");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 10, 290, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_management/header.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 110);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Emp Id");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 100, 90, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 140, 90, 28);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Designation");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 180, 90, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Department");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 220, 90, 28);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Date Of Joining");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 260, 112, 28);

        txtempid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtempidFocusLost(evt);
            }
        });
        jPanel1.add(txtempid);
        txtempid.setBounds(160, 100, 138, 30);
        jPanel1.add(txtname);
        txtname.setBounds(160, 140, 138, 30);
        jPanel1.add(txtdepartment);
        txtdepartment.setBounds(160, 220, 138, 30);

        txtdesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesignationActionPerformed(evt);
            }
        });
        jPanel1.add(txtdesignation);
        txtdesignation.setBounds(160, 180, 138, 30);
        jPanel1.add(txtdateofjoining);
        txtdateofjoining.setBounds(160, 260, 138, 30);

        btnupdate.setBackground(new java.awt.Color(0, 153, 204));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);
        btnupdate.setBounds(220, 340, 110, 35);

        btnback.setBackground(new java.awt.Color(0, 153, 204));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(350, 340, 110, 35);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Naskh Medium", 2, 14), java.awt.Color.blue)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setText("Salary Type");

        txtsalarytype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Salary Any", "Monthly", "Yearly", " " }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setText("Salary Amount");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsalarytype, 0, 147, Short.MAX_VALUE)
                    .addComponent(txtsalaryamount))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsalarytype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsalaryamount, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(310, 90, 345, 199);

        btnexit.setBackground(new java.awt.Color(0, 153, 204));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit);
        btnexit.setBounds(490, 340, 110, 35);

        btninsert.setBackground(new java.awt.Color(0, 153, 204));
        btninsert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        jPanel1.add(btninsert);
        btninsert.setBounds(90, 340, 110, 35);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 110, 700, 490);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

    
        int id=Integer.parseInt(txtempid.getText());
        String name=txtname.getText();
        String designation=txtdesignation.getText();
        String department=txtdepartment.getText();
        String datejoin=txtdateofjoining.getText();
        String salarytype=(String) txtsalarytype.getSelectedItem();
       String salaryamount=txtsalaryamount.getText();
        try{
        Query="update tbladdstudent set ID='"+id+"',NAME='"+name+"',DESIGNATION='"+designation+"',DEPARTMENT='"+department+"',DATEOFJOINING='"+datejoin+"',SALARYTYPE='"+salarytype+"',SALARYAMOUNT='"+salaryamount+"' where ID="+id;
        st=cn.createStatement();
       int check= st.executeUpdate(Query);
       if(check>0){
            JOptionPane.showMessageDialog(this,"Record Are updated");
            txtempid.setText("");
            txtname.setText("");
            txtdesignation.setText("");
            txtdepartment.setText("");
            txtdateofjoining.setText("");
            txtsalarytype.setSelectedItem("");
            txtsalaryamount.setText("");
       }
            else{
         JOptionPane.showMessageDialog(this,"Record Are not updated");
       
       }
}
        catch(SQLException ex)
       {
               JOptionPane.showMessageDialog(this,"Record not Are updated"+ex.getMessage());
       }

     
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        salary s1=new salary();
        s1.show();
        this.hide();

// TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
    System.exit(0);
        

// TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtempidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtempidFocusLost
        // TODO add your handling code here:
        try{ 
        
        st=cn.createStatement();
        Query="SELECT * from tblsalary where EmpId="+txtempid.getText();
        rs=st.executeQuery(Query);
        rs.next();
        txtempid.setText(rs.getString(1));
        txtname.setText(rs.getString(2));
        txtdesignation.setText(rs.getString(3));
        txtdepartment.setText(rs.getString(4));
        txtdateofjoining.setText(rs.getString(5));
        txtsalarytype.setSelectedItem(rs.getString(6));
        txtsalaryamount.setText(rs.getString(7));
        
        
        
       }catch(SQLException ex)
       {
           
       }
        
    }//GEN-LAST:event_txtempidFocusLost

    private void txtdesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesignationActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        
        int id=Integer.parseInt(txtempid.getText());
        String name=txtname.getText();
        String designation=txtdesignation.getText();
        String department=txtdepartment.getText();
        String datejoin=txtdateofjoining.getText();
        String salarytype=(String) txtsalarytype.getSelectedItem();
       String salaryamount=txtsalaryamount.getText();
       
       try
        {
            Query="INSERT INTO TBLsalary VALUES("+id+",'"+name+"','"+designation+"','"+department+"','"+datejoin+"','"+salarytype+"','"+salaryamount+"') ";
            st=cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Record Are Inserted");
            txtempid.setText("");
            txtname.setText("");
            txtdesignation.setText("");
            txtdepartment.setText("");
            txtdateofjoining.setText("");
            txtsalarytype.setSelectedItem("");
            txtsalaryamount.setText("");
            
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btninsertActionPerformed

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
            java.util.logging.Logger.getLogger(basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new basic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtdateofjoining;
    private javax.swing.JTextField txtdepartment;
    private javax.swing.JTextField txtdesignation;
    private javax.swing.JTextField txtempid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsalaryamount;
    private javax.swing.JComboBox txtsalarytype;
    // End of variables declaration//GEN-END:variables
Connection cn;
Statement st;
String Query;
ResultSet rs;
}
