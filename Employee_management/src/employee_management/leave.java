package employee_management;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import employee_management.*;

/**
 *
 * @author Wasif Boss
 */
public class leave extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public leave() {
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
        a4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        a3 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        a6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        a7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Cooper Black", 2, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee  Leave Setting ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 20, 390, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_management/header.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 150);
        jPanel1.add(a4);
        a4.setBounds(130, 380, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Department");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 370, 90, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Designation");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 330, 90, 40);
        jPanel1.add(a3);
        a3.setBounds(130, 340, 150, 30);
        jPanel1.add(a2);
        a2.setBounds(130, 300, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 300, 90, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Search by ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 110, 50);
        jPanel1.add(a1);
        a1.setBounds(130, 160, 150, 30);
        jPanel1.add(a5);
        a5.setBounds(130, 260, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Emp Id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 260, 90, 40);

        cancel.setBackground(new java.awt.Color(0, 153, 204));
        cancel.setText("Back");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(500, 490, 110, 35);

        Delete.setBackground(new java.awt.Color(0, 153, 204));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(360, 490, 110, 35);

        update.setBackground(new java.awt.Color(0, 153, 204));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(220, 490, 110, 35);

        insert.setBackground(new java.awt.Color(0, 153, 204));
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert);
        insert.setBounds(90, 490, 110, 35);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Laeve  Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Naskh Medium", 2, 14), java.awt.Color.blue)); // NOI18N
        jPanel2.setLayout(null);
        jPanel2.add(a6);
        a6.setBounds(120, 70, 80, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Days");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 60, 70, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setText("Salect Month");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(6, 30, 110, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Salary Month", "January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(122, 28, 147, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setText("Leave Reason");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 110, 106, 28);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(120, 110, 230, 120);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Date");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(210, 60, 50, 40);
        jPanel2.add(a7);
        a7.setBounds(250, 70, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(300, 199, 370, 240);
        jPanel2.getAccessibleContext().setAccessibleName("Leave Info");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

       main m1=new main();
      
       m1.show();
        this.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_insertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a5;
    private javax.swing.JTextField a6;
    private javax.swing.JTextField a7;
    private javax.swing.JButton cancel;
    private javax.swing.JButton insert;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
