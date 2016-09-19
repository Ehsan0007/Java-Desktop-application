/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wasif Boss
 */
public class Emp_entry extends javax.swing.JFrame {

     public void MyTable()
    {
            try
        {
            //register driver
            Class.forName("com.mysql.jdbc.Driver");
            //connection 
            cn = DriverManager.getConnection("jdbc:mysql://localhost/addstudent","root","");
            //statment
            st = cn.createStatement();
            
            rs = st.executeQuery("select * from tbladdstudent");
            //rs.next();
            
            /////////
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();
            DefaultTableModel model = new DefaultTableModel();
            
            Vector col_name = new Vector();
            Vector row_data;
            
            for(int i = 1; i<=cols; i++)
            {
                col_name.addElement(rsmd.getColumnName(i));
            }
            model.setColumnIdentifiers(col_name);
            
            
            while(rs.next())
            {
                row_data = new Vector();
                for(int j = 1; j<= cols; j++)
                {
                    
                    row_data.addElement(rs.getString(j));
                   
                }
                 model.addRow(row_data);
                 
            }
               // Vector<Vector<String>> vc = new Vector<Vector<String>>()
            table1.setModel(model);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
        catch(SQLException ex)
        {
               JOptionPane.showMessageDialog(this, ex);
        }}
    
    public Emp_entry() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btninsert = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtdesig = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtgender = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Constantia", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add New Employee");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 20, 340, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_management/header.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 110);

        btndelete.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete);
        btndelete.setBounds(580, 270, 90, 40);

        jLabel14.setFont(new java.awt.Font("Brush Script Std", 0, 30)); // NOI18N
        jLabel14.setText("Management");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 400, 170, 40);

        jLabel15.setFont(new java.awt.Font("Brush Script Std", 0, 30)); // NOI18N
        jLabel15.setText("System");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(80, 440, 110, 40);

        jLabel16.setFont(new java.awt.Font("Brush Script Std", 0, 30)); // NOI18N
        jLabel16.setText(" Employee ");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(50, 360, 160, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_management/icon.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jLabel13.setMaximumSize(new java.awt.Dimension(236, 244));
        jLabel13.setMinimumSize(new java.awt.Dimension(236, 244));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 150, 220, 340);

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Management System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gabriola", 1, 18))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 120, 240, 380);

        btninsert.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        jPanel1.add(btninsert);
        btninsert.setBounds(580, 170, 90, 40);

        btnshow.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        btnshow.setText("Show");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });
        jPanel1.add(btnshow);
        btnshow.setBounds(580, 320, 90, 40);

        btnclear.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear);
        btnclear.setBounds(580, 370, 90, 40);

        btnupdate.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);
        btnupdate.setBounds(580, 220, 90, 40);

        btnback.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(580, 420, 90, 40);

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Use Button", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gabriola", 1, 18))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(560, 120, 130, 380);

        jLabel6.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel6.setText("ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 170, 110, 30);

        jLabel7.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel7.setText("Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 210, 110, 30);

        jLabel8.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel8.setText("Designation");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(250, 240, 110, 30);

        jLabel9.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel9.setText("Mobile");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 280, 110, 30);

        jLabel10.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel10.setText("Email");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(250, 320, 110, 30);

        jLabel11.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(250, 360, 110, 30);

        jLabel12.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel12.setText("Address");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(250, 390, 110, 30);
        jPanel1.add(txtname);
        txtname.setBounds(360, 200, 190, 30);
        jPanel1.add(txtdesig);
        txtdesig.setBounds(360, 240, 190, 30);
        jPanel1.add(txtmobile);
        txtmobile.setBounds(360, 280, 190, 30);
        jPanel1.add(txtemail);
        txtemail.setBounds(360, 320, 190, 30);

        txtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidFocusLost(evt);
            }
        });
        jPanel1.add(txtid);
        txtid.setBounds(360, 160, 190, 30);

        txtgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        txtgender.setSelectedIndex(-1);
        jPanel1.add(txtgender);
        txtgender.setBounds(360, 360, 130, 20);

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(360, 390, 190, 100);

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fill Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gabriola", 1, 18))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 120, 320, 380);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Designation", "Mobile", "Email", "Gender", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 500, 680, 200);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        main obj=new main();
        obj.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txtid.getText());
        String name=txtname.getText();
        String designation=txtdesig.getText();
        String mobile=txtmobile.getText();
        String Email=txtemail.getText();
        String gender=(String) txtgender.getSelectedItem();
       String address=txtaddress.getText();
        
        try
        {
            Query="INSERT INTO TBLADDSTUDENT VALUES("+id+",'"+name+"','"+designation+"','"+mobile+"','"+Email+"','"+gender+"','"+address+"') ";
            st=cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Record Are Inserted");
            txtid.setText("");
            txtname.setText("");
            txtdesig.setText("");
            txtmobile.setText("");
            txtemail.setText("");
            txtgender.setSelectedItem("");
            txtaddress.setText("");
            
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
         try{
        int id=Integer.parseInt(txtid.getText());
        String name=txtname.getText();
        String designation=txtdesig.getText();
        String mobile=txtmobile.getText();
        String Email=txtemail.getText();
        String gender=(String) txtgender.getSelectedItem();
       String address=txtaddress.getText();
       
        Query="update tbladdstudent set ID='"+id+"',NAME='"+name+"',DESIGNATION='"+designation+"',MOBILE='"+mobile+"',EMAIL='"+Email+"',GENDER='"+gender+"',ADDRESS='"+address+"' where ID="+id;
        st=cn.createStatement();
       int check= st.executeUpdate(Query);
       if(check>0){
            JOptionPane.showMessageDialog(this,"Record Are updated");
            txtid.setText("");
            txtname.setText("");
            txtdesig.setText("");
            txtmobile.setText("");
            txtemail.setText("");
            txtgender.setSelectedItem("");
            txtaddress.setText("");
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

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txtid.getText());
        String name=txtname.getText();
        String designation=txtdesig.getText();
        String mobile=txtmobile.getText();
        String Email=txtemail.getText();
        String gender=(String) txtgender.getSelectedItem();
       String address=txtaddress.getText();
        
        try
        {
            Query="DELETE from tbladdstudent where ID='"+id+"'";
            st=cn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Record Are Deleted");
            txtid.setText("");
            txtname.setText("");
            txtdesig.setText("");
            txtmobile.setText("");
            txtemail.setText("");
            txtgender.setSelectedItem("");
            txtaddress.setText("");
            
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        // TODO add your handling code here:
         MyTable();
    }//GEN-LAST:event_btnshowActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtid.setText("");
        txtname.setText("");
        txtdesig.setText("");
        txtmobile.setText("");
        txtemail.setText("");
        txtgender.setSelectedItem("");
        txtaddress.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusLost
        // TODO add your handling code here:
         try{ 
        
        st=cn.createStatement();
        Query="SELECT * from tbladdstudent where ID="+txtid.getText();
        rs=st.executeQuery(Query);
        rs.next();
        txtid.setText(rs.getString(1));
        txtname.setText(rs.getString(2));
        txtdesig.setText(rs.getString(3));
        txtmobile.setText(rs.getString(4));
        txtemail.setText(rs.getString(5));
        txtgender.setSelectedItem(rs.getString(6));
        txtaddress.setText(rs.getString(7));
        
       }catch(SQLException ex)
       {
           
       }
    }//GEN-LAST:event_txtidFocusLost

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
            java.util.logging.Logger.getLogger(Emp_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emp_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emp_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emp_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emp_entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnshow;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtdesig;
    private javax.swing.JTextField txtemail;
    private javax.swing.JComboBox txtgender;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
Connection cn;
Statement st;
String Query;
ResultSet rs;
}
