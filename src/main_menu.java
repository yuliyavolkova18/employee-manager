
import com.sun.jdi.connect.spi.Connection;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class main_menu extends javax.swing.JFrame {

    public main_menu() {
        initComponents();
        display_table();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    private void display_table() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/employee_manager", "root", "root");
            String sql = "Select id as 'Id', first_name as 'First name', last_name as 'Last name', position as 'Position', base_salary as 'Base salary' from employee_table";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            employees_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employees_table = new javax.swing.JTable();
        add_employee = new javax.swing.JButton();
        delete_employee = new javax.swing.JButton();
        edit_employee = new javax.swing.JButton();
        generate_report = new javax.swing.JButton();
        track_employee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sign_out = new javax.swing.JButton();
        new_user = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        view_absences = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        employees_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "First name", "Last name", "Position", "Salary"
            }
        ));
        jScrollPane1.setViewportView(employees_table);
        if (employees_table.getColumnModel().getColumnCount() > 0) {
            employees_table.getColumnModel().getColumn(0).setHeaderValue("Id");
            employees_table.getColumnModel().getColumn(1).setHeaderValue("First name");
            employees_table.getColumnModel().getColumn(2).setHeaderValue("Last name");
            employees_table.getColumnModel().getColumn(3).setHeaderValue("Position");
            employees_table.getColumnModel().getColumn(4).setHeaderValue("Salary");
        }

        add_employee.setBackground(new java.awt.Color(0, 0, 204));
        add_employee.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
        add_employee.setForeground(new java.awt.Color(255, 255, 255));
        add_employee.setText("New employee");
        add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employeeActionPerformed(evt);
            }
        });

        delete_employee.setFont(new java.awt.Font("Apple SD Gothic Neo", 2, 13)); // NOI18N
        delete_employee.setForeground(new java.awt.Color(102, 102, 102));
        delete_employee.setText("Delete employee");
        delete_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_employeeActionPerformed(evt);
            }
        });

        edit_employee.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        edit_employee.setText("Edit employee");
        edit_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_employeeActionPerformed(evt);
            }
        });

        generate_report.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        generate_report.setText("Generate report");
        generate_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_reportActionPerformed(evt);
            }
        });

        track_employee.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        track_employee.setText("Track employees");
        track_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                track_employeeMouseClicked(evt);
            }
        });
        track_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                track_employeeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("AsiaProm Employee Attendance Payroll Manager");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        sign_out.setBackground(new java.awt.Color(204, 204, 204));
        sign_out.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        sign_out.setText("Sign out");
        sign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_outActionPerformed(evt);
            }
        });

        new_user.setBackground(new java.awt.Color(204, 204, 204));
        new_user.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        new_user.setText("Create new user");
        new_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(new_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sign_out)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_user)
                    .addComponent(sign_out))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Apple SD Gothic Neo", 2, 13)); // NOI18N
        jLabel2.setText("Showing all of the company's active employees:");

        view_absences.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        view_absences.setText("View absences");
        view_absences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_absencesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(add_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(track_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(generate_report, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(edit_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(view_absences, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(delete_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(25, 25, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_employee)
                    .addComponent(edit_employee)
                    .addComponent(delete_employee)
                    .addComponent(view_absences))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generate_report)
                    .addComponent(track_employee))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employeeActionPerformed
        new add_employee().setVisible(true);
    }//GEN-LAST:event_add_employeeActionPerformed

    private void delete_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_employeeActionPerformed
        new delete_employee().setVisible(true);
    }//GEN-LAST:event_delete_employeeActionPerformed

    private void generate_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_reportActionPerformed
        new view_report().setVisible(true);
    }//GEN-LAST:event_generate_reportActionPerformed

    private void track_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_track_employeeActionPerformed
        new track_employee().setVisible(true);
    }//GEN-LAST:event_track_employeeActionPerformed

    private void track_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_track_employeeMouseClicked
    }//GEN-LAST:event_track_employeeMouseClicked

    private void sign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_outActionPerformed
        JOptionPane.showMessageDialog(null, "Signing out...");
        System.exit(0);
    }//GEN-LAST:event_sign_outActionPerformed

    private void edit_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_employeeActionPerformed
        new edit_employee().setVisible(true);
    }//GEN-LAST:event_edit_employeeActionPerformed

    private void new_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_userActionPerformed
        new new_user().setVisible(true);
    }//GEN-LAST:event_new_userActionPerformed

    private void view_absencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_absencesActionPerformed
        new view_absences().setVisible(true);
    }//GEN-LAST:event_view_absencesActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_employee;
    private javax.swing.JButton delete_employee;
    private javax.swing.JButton edit_employee;
    private javax.swing.JTable employees_table;
    private javax.swing.JButton generate_report;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton new_user;
    private javax.swing.JButton sign_out;
    private javax.swing.JButton track_employee;
    private javax.swing.JButton view_absences;
    // End of variables declaration//GEN-END:variables
}