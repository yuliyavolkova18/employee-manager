import com.mysql.cj.xdevapi.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class view_report extends javax.swing.JFrame {

    public view_report() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        employees_table = new javax.swing.JTable();
        year = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employees_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "First name", "Last name", "Base salary", "Absences"
            }
        ));
        jScrollPane1.setViewportView(employees_table);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        submit.setText("Make report");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("View employee absences and generate monthly expenditure report");

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("←");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        jLabel2.setText("Year:");

        jLabel3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        jLabel3.setText("Month:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(submit)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
    }//GEN-LAST:event_yearActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
    }//GEN-LAST:event_monthActionPerformed

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
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/employee_manager", "root", "root");
            String sql = "select absent_table.id as 'Id', employee_table.first_name as 'First name', employee_table.last_name as 'Last name', employee_table.base_salary as 'Base salary', count(absent_table.date) as 'Absences' from absent_table, employee_table where month(absent_table.date)=? and year(absent_table.date)=? and absent_table.id=employee_table.id group by absent_table.id;";
            PreparedStatement pst = con.prepareStatement(sql);

            String monthSelection = month.getSelectedItem().toString();
            String yearSelection = year.getSelectedItem().toString();

            pst.setString(1, monthSelection);
            pst.setString(2, yearSelection);

            ResultSet rs = pst.executeQuery();
            employees_table.setModel(DbUtils.resultSetToTableModel(rs));

            int absent = 0;
            int salary = 0;
            int calculated_salary = 0;
            int absentee_salary = 0;

            String sql_total_absences = "select count(date) as count from absent_table where month(date)=? and year(date)=?;";
            PreparedStatement pst_total_absences = con.prepareStatement(sql_total_absences);
            pst_total_absences.setString(1, monthSelection);
            pst_total_absences.setString(2, yearSelection);
            ResultSet rs_total_absences = pst_total_absences.executeQuery();

            String sql_total_salary = "select sum(base_salary) as total_salary from employee_table;";
            PreparedStatement pst_total_salary = con.prepareStatement(sql_total_salary);
            ResultSet rs_total_salary = pst_total_salary.executeQuery();

            String sql_absentee_salary = "select sum(employee_table.base_salary) as absentee_salary from employee_table where employee_table.id in(select distinct absent_table.id from absent_table where month(absent_table.date)=? and year(absent_table.date)=?);";
            PreparedStatement pst_absentee_salary = con.prepareStatement(sql_absentee_salary);
            pst_absentee_salary.setString(1, monthSelection);
            pst_absentee_salary.setString(2, yearSelection);
            ResultSet rs_absentee_salary = pst_absentee_salary.executeQuery();

            while (rs_total_absences.next()) {
                String total_absences = rs_total_absences.getString("count");
                absent = Integer.parseInt(total_absences);
            }

            while (rs_total_salary.next()) {
                String total_salary = rs_total_salary.getString("total_salary");
                salary = Integer.parseInt(total_salary);
            }

            while (rs_absentee_salary.next()) {
                String total_absentee_salary = rs_absentee_salary.getString("absentee_salary");
                absentee_salary = Integer.parseInt(total_absentee_salary);
            }

            String monthText = "";

            if (monthSelection == "1") {
                monthText = "January";
            } else if (monthSelection == "2") {
                monthText = "February";
            } else if (monthSelection == "3") {
                monthText = "March";
            } else if (monthSelection == "4") {
                monthText = "April";
            } else if (monthSelection == "5") {
                monthText = "May";
            } else if (monthSelection == "6") {
                monthText = "June";
            } else if (monthSelection == "7") {
                monthText = "July";
            } else if (monthSelection == "8") {
                monthText = "August";
            } else if (monthSelection == "9") {
                monthText = "September";
            } else if (monthSelection == "10") {
                monthText = "October";
            } else if (monthSelection == "11") {
                monthText = "November";
            } else if (monthSelection == "12") {
                monthText = "December";
            }

            if (absent == 0) {
                calculated_salary = salary;
            } else {
                calculated_salary = salary - ((absentee_salary / 22) * absent);
            }
            
            

            FileWriter fw = new FileWriter("report", false);
            fw.write("Employee payroll total report for " + monthText + " of " + yearSelection);
            fw.write(System.getProperty("line.separator"));
            fw.write("===============");
            fw.write(System.getProperty("line.separator"));
            fw.write("Total base salary for all employees: " + salary);
            fw.write(System.getProperty("line.separator"));
            fw.write("Total absences for all employees: " + absent);
            fw.write(System.getProperty("line.separator"));
            fw.write("===============");
            fw.write(System.getProperty("line.separator"));
            fw.write("Total deducted salary from total base salary based on absences in " + monthText + ": " + ((absentee_salary / 22) * absent));
            fw.write(System.getProperty("line.separator"));
            fw.write("Total calculated salary for all employees in " + monthText + ": " + calculated_salary);
            fw.close();
            JOptionPane.showMessageDialog(null, "Salary report for the month of "+monthText+" has been generated!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
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
            java.util.logging.Logger.getLogger(view_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTable employees_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}