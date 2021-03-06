
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bikash
 */
public class Salary extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "3434!Natun?!%@$#";
    private static final String dataConn = "jdbc:mysql://localhost:3306/ems31?autoReconnect=true&useSSL=false";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, Salary_ID, deleteItem;
    //DefaultTableModel d;

    public Salary() {
        initComponents();
        //Load_Job_Dept();
        upDateDB();

    }
//**************************************FUNCTION START*******************************************************//

    public void upDateDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("select * from Salary");

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel) txtSalary_Table.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();

                for (i = 1; i <= q; i++) {

                    columnData.add(rs.getString("Salary_ID"));
                    columnData.add(rs.getString("Job_ID"));
                    columnData.add(rs.getString("Monthly_Salary"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //**************************************FUNCTION END*******************************************************//
    //**************************************Load_Job_Department*******************************************************//
//    public void Load_Job_Dept() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            sqlConn = DriverManager.getConnection(dataConn, username, password);
//            pst = sqlConn.prepareStatement("select * from Job_Department");
//
//            rs = pst.executeQuery();
//            ResultSetMetaData stData = rs.getMetaData();
//
//            jComboBox1.removeAllItems();
//
//            while (rs.next()) {
//                jComboBox1.addItem(rs.getString("Job_ID"));
//            }
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }
//**************************************Load_Job_Department END*******************************************************//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSalary_ID = new javax.swing.JTextField();
        txtJob_ID = new javax.swing.JTextField();
        txtMonthly_Salary = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtUpdateData = new javax.swing.JButton();
        txtAddNew = new javax.swing.JButton();
        txtReset = new javax.swing.JButton();
        txtPrint = new javax.swing.JButton();
        txtExit = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        txtEmployee = new javax.swing.JButton();
        txtJob_Dept = new javax.swing.JButton();
        txtPayroll = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalary_Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salary Table");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Salary_ID (P.K)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Job_ID (F.K)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Monthly Salary");

        txtSalary_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtJob_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtMonthly_Salary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtJob_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtSalary_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtMonthly_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSalary_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJob_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMonthly_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));

        txtUpdateData.setBackground(new java.awt.Color(0, 0, 255));
        txtUpdateData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUpdateData.setForeground(new java.awt.Color(255, 255, 255));
        txtUpdateData.setText("Update Data");
        txtUpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateDataActionPerformed(evt);
            }
        });

        txtAddNew.setBackground(new java.awt.Color(0, 0, 255));
        txtAddNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAddNew.setForeground(new java.awt.Color(255, 255, 255));
        txtAddNew.setText("Add New");
        txtAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddNewActionPerformed(evt);
            }
        });

        txtReset.setBackground(new java.awt.Color(0, 0, 255));
        txtReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtReset.setForeground(new java.awt.Color(255, 255, 255));
        txtReset.setText("Reset");
        txtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResetActionPerformed(evt);
            }
        });

        txtPrint.setBackground(new java.awt.Color(0, 0, 255));
        txtPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrint.setForeground(new java.awt.Color(255, 255, 255));
        txtPrint.setText("Print");
        txtPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrintActionPerformed(evt);
            }
        });

        txtExit.setBackground(new java.awt.Color(255, 51, 51));
        txtExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtExit.setForeground(new java.awt.Color(255, 255, 255));
        txtExit.setText("Exit");
        txtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExitActionPerformed(evt);
            }
        });

        txtDelete.setBackground(new java.awt.Color(0, 0, 255));
        txtDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDelete.setForeground(new java.awt.Color(255, 255, 255));
        txtDelete.setText("Delete");
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });

        txtEmployee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmployee.setText("Employee");
        txtEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeActionPerformed(evt);
            }
        });

        txtJob_Dept.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtJob_Dept.setText("Job Dept");
        txtJob_Dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJob_DeptActionPerformed(evt);
            }
        });

        txtPayroll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPayroll.setText("Payroll");
        txtPayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayrollActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUpdateData))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtJob_Dept, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateData, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJob_Dept, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Salary");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        txtSalary_Table.setBackground(new java.awt.Color(51, 153, 255));
        txtSalary_Table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSalary_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salary_ID", "Job_ID", "Monthly Salary"
            }
        ));
        txtSalary_Table.setRowHeight(25);
        txtSalary_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalary_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtSalary_Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1340, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeActionPerformed
        // TODO add your handling code here:
        Employee d = new Employee();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_txtEmployeeActionPerformed

    private void txtJob_DeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJob_DeptActionPerformed
        // TODO add your handling code here:
        Job_Dept d = new Job_Dept();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_txtJob_DeptActionPerformed

    private void txtPayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayrollActionPerformed
        // TODO add your handling code here:
        Payroll d = new Payroll();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_txtPayrollActionPerformed
    private JFrame frame;
    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "Employee Management System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            //System.exit(0);
            Admin_Login L = new Admin_Login();
            this.setVisible(false);
            L.setVisible(true);
        }
    }//GEN-LAST:event_txtExitActionPerformed

    private void txtAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddNewActionPerformed
        // TODO add your handling code here

        if (txtSalary_ID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Job ID is empty");
            return;
        }
        if (txtJob_ID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Department Name is empty");
            return;
        }
        if (txtMonthly_Salary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee Name is empty");
            return;
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("insert into Salary(Salary_ID,Job_ID, Monthly_Salary) values(?,?,?)");

            pst.setString(1, txtSalary_ID.getText());
            pst.setString(2, txtJob_ID.getText());
            pst.setString(3, txtMonthly_Salary.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            upDateDB();

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (MySQLIntegrityConstraintViolationException ex) {
            // show duplicate jobid insert error dialog
            System.out.println(ex);
            if (ex.toString().contains("PRIMARY")) {
                JOptionPane.showMessageDialog(this, "Salary id already exists!", "Salary ID didn't match", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Not Registered yet in Job Department", "Job ID didn't match", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtAddNewActionPerformed

    private void txtUpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateDataActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) txtSalary_Table.getModel();
        int SelectedRows = txtSalary_Table.getSelectedRow();
        try {
            Salary_ID = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("update Salary set Job_ID=?,"
                    + "Monthly_Salary=? where Salary_ID =?");

            pst.setString(1, txtJob_ID.getText());
            pst.setString(2, txtMonthly_Salary.getText());
            pst.setString(3, String.valueOf(Salary_ID));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record updated");
            upDateDB();

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtUpdateDataActionPerformed

    private void txtPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Salary");
        MessageFormat footer = new MessageFormat("Page [0, number, integer]");

        try {
            txtSalary_Table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_txtPrintActionPerformed

    private void txtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResetActionPerformed
        // TODO add your handling code here:
      //  jComboBox1.setSelectedIndex(-1);
        txtSalary_ID.setText("");
        txtJob_ID.setText("");
        txtMonthly_Salary.setText("");
    }//GEN-LAST:event_txtResetActionPerformed

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) txtSalary_Table.getModel();
        int SelectedRows = txtSalary_Table.getSelectedRow();

        try {
            Salary_ID = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());

            deleteItem = JOptionPane.showConfirmDialog(null, " Confirm if you want to delete item", "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_NO_OPTION) {
                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                pst = sqlConn.prepareStatement("delete from Salary where Salary_ID =?");

                pst.setInt(1, Salary_ID);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Recorded delete");
                upDateDB();

                txtJob_ID.setText("");
                txtMonthly_Salary.setText("");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (MySQLIntegrityConstraintViolationException ex) {
            // show duplicate jobid insert error dialog
            JOptionPane.showMessageDialog(this, "Payroll References Salary ID ", "References Salary ID", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void txtSalary_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalary_TableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) txtSalary_Table.getModel();
        int SelectedRows = txtSalary_Table.getSelectedRow();

        txtJob_ID.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtMonthly_Salary.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
    }//GEN-LAST:event_txtSalary_TableMouseClicked

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtAddNew;
    private javax.swing.JButton txtDelete;
    private javax.swing.JButton txtEmployee;
    private javax.swing.JButton txtExit;
    private javax.swing.JButton txtJob_Dept;
    private javax.swing.JTextField txtJob_ID;
    private javax.swing.JTextField txtMonthly_Salary;
    private javax.swing.JButton txtPayroll;
    private javax.swing.JButton txtPrint;
    private javax.swing.JButton txtReset;
    private javax.swing.JTextField txtSalary_ID;
    private javax.swing.JTable txtSalary_Table;
    private javax.swing.JButton txtUpdateData;
    // End of variables declaration//GEN-END:variables
}
