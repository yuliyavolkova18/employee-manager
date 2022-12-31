import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

public class add_employee extends javax.swing.JFrame {

    public add_employee() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        employee_type = new javax.swing.JComboBox<>();
        salary = new javax.swing.JTextField();
        add_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        firstname_label = new javax.swing.JLabel();
        lastname_label = new javax.swing.JLabel();
        salary_label = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Create new employee");
        jLabel1.setSize(new java.awt.Dimension(55, 26));

        jLabel2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        jLabel2.setText("First name:");
        jLabel2.setSize(new java.awt.Dimension(60, 20));

        jLabel3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        jLabel3.setText("Last name:");

        jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        jLabel4.setText("Employee type:");

        jLabel5.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        jLabel5.setText("Salary:");

        first_name.setBackground(new java.awt.Color(204, 204, 204));
        first_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                first_nameKeyReleased(evt);
            }
        });

        last_name.setBackground(new java.awt.Color(204, 204, 204));
        last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_nameActionPerformed(evt);
            }
        });
        last_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                last_nameKeyReleased(evt);
            }
        });

        employee_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Executive assistant", "Secretary", "Receptionist", "Account manager", "Office manager", "Office assistant", "Data entry clerk", "Tenderer", "Contractor" }));

        salary.setBackground(new java.awt.Color(204, 204, 204));
        salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                salaryKeyReleased(evt);
            }
        });

        add_button.setBackground(new java.awt.Color(51, 51, 255));
        add_button.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        add_button.setForeground(new java.awt.Color(255, 255, 255));
        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        reset_button.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        reset_button.setText("Reset");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        firstname_label.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        firstname_label.setForeground(new java.awt.Color(204, 0, 0));

        lastname_label.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        lastname_label.setForeground(new java.awt.Color(204, 0, 0));

        salary_label.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        salary_label.setForeground(new java.awt.Color(204, 0, 0));

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("←");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(add_button)
                            .addGap(27, 27, 27)
                            .addComponent(reset_button))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(employee_type, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(last_name)
                                    .addComponent(first_name)
                                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(firstname_label)
                                        .addComponent(lastname_label)
                                        .addComponent(salary_label))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstname_label)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastname_label)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(employee_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(salary_label)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button)
                    .addComponent(reset_button))
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_nameActionPerformed
    }//GEN-LAST:event_last_nameActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        if (first_name.getText().trim().isEmpty() && last_name.getText().trim().isEmpty() && salary.getText().trim().isEmpty()) {
            firstname_label.setText("First name field empty");
            lastname_label.setText("Last name field empty");
            salary_label.setText("Salary field empty");
        } else if (first_name.getText().isEmpty()) {
            firstname_label.setText("First name field empty");
        } else if (last_name.getText().isEmpty()) {
            lastname_label.setText("Last name field empty");
        } else if (salary.getText().trim().isEmpty()) {
            salary_label.setText("Salary field empty");
        } else if (Integer.parseInt(salary.getText()) <= 1000) {
            salary_label.setText("Input valid salary");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/employee_manager", "root", "root");
                String sql = "Insert into employee_table values(?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);

                String id = null;
                pst.setString(1, id);
                pst.setString(2, first_name.getText().trim());
                pst.setString(3, last_name.getText().trim());

                String type;
                type = employee_type.getSelectedItem().toString();
                pst.setString(4, type);

                pst.setInt(5, Integer.parseInt(salary.getText()));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Employee created successfully!");
                con.close();

                new main_menu().setVisible(false);
                new main_menu().setVisible(true);
                dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_add_buttonActionPerformed

    private void first_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_first_nameKeyReleased
        firstname_label.setText("");
    }//GEN-LAST:event_first_nameKeyReleased

    private void last_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_last_nameKeyReleased
        lastname_label.setText("");
    }//GEN-LAST:event_last_nameKeyReleased

    private void salaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryKeyReleased
        salary_label.setText("");
    }//GEN-LAST:event_salaryKeyReleased

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        first_name.setText("");
        last_name.setText("");
        salary.setText("");
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        new main_menu().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> employee_type;
    private javax.swing.JTextField first_name;
    private javax.swing.JLabel firstname_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField last_name;
    private javax.swing.JLabel lastname_label;
    private javax.swing.JButton reset_button;
    private javax.swing.JTextField salary;
    private javax.swing.JLabel salary_label;
    // End of variables declaration//GEN-END:variables
}