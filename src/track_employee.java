import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import jdk.jfr.Category;

public class track_employee extends javax.swing.JFrame {

    public track_employee() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        date_chooser = new datechooser.beans.DateChooserPanel();
        employee_id = new javax.swing.JTextField();
        remove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        submit.setBackground(new java.awt.Color(204, 204, 255));
        submit.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        submit.setText("Record absence");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        employee_id.setBackground(new java.awt.Color(204, 204, 204));

        remove.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        remove.setText("Remove absence");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        jLabel2.setText("Employee ID:");

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("←");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Record or remove employee absence");

        id_label.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        id_label.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_label)
                            .addComponent(employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(remove))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        ResultSet rs_duplicate;
        ResultSet rs_count;
        boolean recordAdded = false;

        if (employee_id.getText().trim().isEmpty()) {
            id_label.setText("Employee ID must be filled out");
        } else {
            id_label.setText("");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con_duplicate = DriverManager.getConnection("jdbc:mysql://localhost:8889/employee_manager", "root", "root");

                String sql_duplicate = "Select date from absent_table where id=? and date=?";
                PreparedStatement pst_duplicate = con_duplicate.prepareStatement(sql_duplicate);

                int id = Integer.parseInt(employee_id.getText());

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(date_chooser.getSelectedDate().getTime());

                pst_duplicate.setInt(1, id);
                pst_duplicate.setString(2, date);

                rs_duplicate = pst_duplicate.executeQuery();

                while (!rs_duplicate.next()) {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/employee_manager", "root", "root");

                    String sql = "Insert into absent_table values(?, ?)";
                    PreparedStatement pst = con.prepareStatement(sql);

                    pst.setInt(1, id);
                    pst.setString(2, date);

                    pst.executeUpdate();
                    con.close();
                    rs_duplicate.close();
                }
                
                if (recordAdded) {
                    JOptionPane.showMessageDialog(null, "Absence sucessfully recorded");

                } else {
                    JOptionPane.showMessageDialog(null, "This absence was already recorded");
                    rs_duplicate.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Absence sucessfully recorded");
                dispose();
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        if (employee_id.getText().trim().isEmpty()) {
            id_label.setText("Employee ID must be filled out");
        } else {
            id_label.setText("");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con_remove = DriverManager.getConnection("jdbc:mysql://localhost:8889/employee_manager", "root", "root");

                String sql_remove = "delete from absent_table where id=? and date=?";
                PreparedStatement pst_duplicate = con_remove.prepareStatement(sql_remove);

                int id = Integer.parseInt(employee_id.getText());

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(date_chooser.getSelectedDate().getTime());

                pst_duplicate.setInt(1, id);
                pst_duplicate.setString(2, date);

                pst_duplicate.executeUpdate();
                con_remove.close();

                JOptionPane.showMessageDialog(null, "Absence deleted sucessfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(track_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(track_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(track_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(track_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new track_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private datechooser.beans.DateChooserPanel date_chooser;
    private javax.swing.JTextField employee_id;
    private javax.swing.JLabel id_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton remove;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}