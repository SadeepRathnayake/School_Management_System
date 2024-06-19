/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Iteacher;
import Controller.teacherImpl;
import Model.teacher;
import Util.databaseConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sadeep
 */
public class teachers extends javax.swing.JFrame {

    /**
     * Creates new form teachers
     */
    
    PreparedStatement pst;
    ResultSet rs;
    private Connection con;
    
    public teachers() throws ClassNotFoundException, SQLException {
        initComponents();
        
        try {
            con = databaseConnection.getDBConnection(); // Initialize the database connection
            table_load();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: Unable to connect to the database.");
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

        buttonGroup_Gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_teachersTable = new javax.swing.JTable();
        jLabel_pic = new javax.swing.JLabel();
        jPanel_registration = new javax.swing.JPanel();
        jLabel_fullName = new javax.swing.JLabel();
        jLabel_DoB = new javax.swing.JLabel();
        jLabel_gender = new javax.swing.JLabel();
        jLabel_contact = new javax.swing.JLabel();
        jLabel_address = new javax.swing.JLabel();
        jTextField_fullName = new javax.swing.JTextField();
        jTextField_address = new javax.swing.JTextField();
        jDateChooser_DoB = new com.toedter.calendar.JDateChooser();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        jTextField_contact = new javax.swing.JTextField();
        jButton_INSERT = new javax.swing.JButton();
        jButton_UPDATE = new javax.swing.JButton();
        jButton_DELETE = new javax.swing.JButton();
        jButton_CLEAR = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jLabel_background = new javax.swing.JLabel();
        jMenuBar_menubar = new javax.swing.JMenuBar();
        jMenu_navigation = new javax.swing.JMenu();
        jMenuItem_dashboard = new javax.swing.JMenuItem();
        jMenuItem_logout = new javax.swing.JMenuItem();
        jMenuItem_close = new javax.swing.JMenuItem();
        jMenu_about = new javax.swing.JMenu();
        jMenuItem_info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(761, 471));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_teachersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "Full Name", "Birthday", "Gender", "Contact", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_teachersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_teachersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_teachersTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 710, 186));

        jLabel_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/teacher2.png"))); // NOI18N
        jLabel_pic.setText("jLabel1");
        jPanel1.add(jLabel_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 160, 180));

        jPanel_registration.setBorder(javax.swing.BorderFactory.createTitledBorder("Teacher Registration"));

        jLabel_fullName.setText("Full Name");

        jLabel_DoB.setText("Birthday");

        jLabel_gender.setText("Gender");

        jLabel_contact.setText("Contact");

        jLabel_address.setText("Address");

        buttonGroup_Gender.add(jRadioButton_male);
        jRadioButton_male.setText("Male");

        buttonGroup_Gender.add(jRadioButton_female);
        jRadioButton_female.setText("Female");

        jButton_INSERT.setText("INSERT");
        jButton_INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERTActionPerformed(evt);
            }
        });

        jButton_UPDATE.setText("UPDATE");
        jButton_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATEActionPerformed(evt);
            }
        });

        jButton_DELETE.setText("DELETE");
        jButton_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETEActionPerformed(evt);
            }
        });

        jButton_CLEAR.setText("CLEAR");
        jButton_CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CLEARActionPerformed(evt);
            }
        });

        jButton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/back.png"))); // NOI18N
        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_registrationLayout = new javax.swing.GroupLayout(jPanel_registration);
        jPanel_registration.setLayout(jPanel_registrationLayout);
        jPanel_registrationLayout.setHorizontalGroup(
            jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addComponent(jLabel_fullName)
                        .addGap(13, 13, 13)
                        .addComponent(jTextField_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addComponent(jLabel_DoB)
                        .addGap(24, 24, 24)
                        .addComponent(jDateChooser_DoB, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_gender)
                            .addComponent(jLabel_contact))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                                .addComponent(jRadioButton_male)
                                .addGap(12, 12, 12)
                                .addComponent(jRadioButton_female))))
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addComponent(jLabel_address)
                        .addGap(24, 24, 24)
                        .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addComponent(jButton_INSERT, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton_UPDATE))
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addComponent(jButton_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton_back)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_registrationLayout.setVerticalGroup(
            jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel_fullName))
                            .addComponent(jTextField_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel_DoB))
                            .addComponent(jDateChooser_DoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel_gender))
                            .addComponent(jRadioButton_male)
                            .addComponent(jRadioButton_female))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_contact)
                            .addComponent(jTextField_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel_address))
                            .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_INSERT)
                            .addComponent(jButton_UPDATE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_DELETE)
                            .addComponent(jButton_CLEAR))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_back)))
                .addContainerGap())
        );

        jPanel1.add(jPanel_registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 510, 210));

        jLabel_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/internal_Background.png"))); // NOI18N
        jPanel1.add(jLabel_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 470));

        jMenu_navigation.setText("Navigation");

        jMenuItem_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/home.png"))); // NOI18N
        jMenuItem_dashboard.setText("Dashboard");
        jMenuItem_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_dashboardActionPerformed(evt);
            }
        });
        jMenu_navigation.add(jMenuItem_dashboard);

        jMenuItem_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/logout.png"))); // NOI18N
        jMenuItem_logout.setText("Logout");
        jMenuItem_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_logoutActionPerformed(evt);
            }
        });
        jMenu_navigation.add(jMenuItem_logout);

        jMenuItem_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/cancel.png"))); // NOI18N
        jMenuItem_close.setText("Close");
        jMenuItem_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_closeActionPerformed(evt);
            }
        });
        jMenu_navigation.add(jMenuItem_close);

        jMenuBar_menubar.add(jMenu_navigation);

        jMenu_about.setText("About");

        jMenuItem_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/about.png"))); // NOI18N
        jMenuItem_info.setText("Info");
        jMenuItem_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_infoActionPerformed(evt);
            }
        });
        jMenu_about.add(jMenuItem_info);

        jMenuBar_menubar.add(jMenu_about);

        setJMenuBar(jMenuBar_menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(779, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_dashboardActionPerformed
        // TODO add your handling code here:
        dashboard dFrame = new dashboard();
        dFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem_dashboardActionPerformed

    private void jMenuItem_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_logoutActionPerformed
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            login lFrame = new login();
            lFrame.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jMenuItem_logoutActionPerformed

    private void jMenuItem_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_closeActionPerformed
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(this, "Are you sure you want to close the application?", "Cancel Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jMenuItem_closeActionPerformed

    private void jMenuItem_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_infoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Created by S.D.R.");
    }//GEN-LAST:event_jMenuItem_infoActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        dashboard dFrame = new dashboard();
        dFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERTActionPerformed
    // INSERT OPERATION

    String fullName, address, gender, contact, birthday;

    // Retrieve data from UI components
    fullName = jTextField_fullName.getText();
    address = jTextField_address.getText();
    contact = jTextField_contact.getText();
    gender = (jRadioButton_male.isSelected()) ? "Male" : "Female"; // Assuming there are only male and female options

    // Check if any required field is empty
    if (jTextField_fullName.getText().isEmpty() || jDateChooser_DoB.getDate() == null ||
            (!jRadioButton_male.isSelected() && !jRadioButton_female.isSelected()) ||
            jTextField_contact.getText().isEmpty() || jTextField_address.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Retrieve and format the date of birth
    java.util.Date dobDate = jDateChooser_DoB.getDate();  // Ensure this is checked for null
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    birthday = sdf.format(dobDate);  // Only format if dobDate is not null

    // Validate contact number
    String contactNumber = jTextField_contact.getText().trim();
    if (!contactNumber.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid 10-digit contact number.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Validate birth date
    java.util.Date selectedDate = jDateChooser_DoB.getDate();
    Date currentDate = new Date(System.currentTimeMillis());
    if (selectedDate.after(currentDate)) {
        JOptionPane.showMessageDialog(this, "Please select a birth date before today.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Create a new teacher object
    teacher newTeacher = new teacher();
    newTeacher.setFull_Name(fullName);
    newTeacher.setAddress(address);
    newTeacher.setContact(contact);
    newTeacher.setGender(gender);
    newTeacher.setBirthday(birthday);

    try {
        PreparedStatement pst = con.prepareStatement(
            "INSERT INTO teachers (Full_Name, Address, Contact, Gender, Birthday) VALUES (?, ?, ?, ?, ?)"
        );

        pst.setString(1, newTeacher.getFull_Name());
        pst.setString(2, newTeacher.getAddress());
        pst.setString(3, newTeacher.getContact());
        pst.setString(4, newTeacher.getGender());
        pst.setString(5, newTeacher.getBirthday());

        int rowsInserted = pst.executeUpdate();

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Teacher added successfully!");

            // Refresh the table with new data
            table_load();

            // Clear input fields after successful insertion
            clearFields();
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add teacher.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(teachers.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    
    }//GEN-LAST:event_jButton_INSERTActionPerformed

    private void jButton_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATEActionPerformed
    // UPDATE OPERATION

    String fullName, address, gender, contact, birthday, teacherID;

    // Retrieve data from UI components
    fullName = jTextField_fullName.getText();
    address = jTextField_address.getText();
    contact = jTextField_contact.getText();
    gender = (jRadioButton_male.isSelected()) ? "Male" : "Female"; // Assuming there are only male and female options

    // Check if any required field is empty
    if (jTextField_fullName.getText().isEmpty() || jDateChooser_DoB.getDate() == null ||
            (!jRadioButton_male.isSelected() && !jRadioButton_female.isSelected()) ||
            jTextField_contact.getText().isEmpty() || jTextField_address.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Retrieve and format the date of birth
    java.util.Date dobDate = jDateChooser_DoB.getDate();  // Ensure this is checked for null
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    birthday = sdf.format(dobDate);  // Only format if dobDate is not null

    // Validate contact number
    String contactNumber = jTextField_contact.getText().trim();
    if (!contactNumber.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid 10-digit contact number.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Validate birth date
    java.util.Date selectedDate = jDateChooser_DoB.getDate();
    Date currentDate = new Date(System.currentTimeMillis());
    if (selectedDate.after(currentDate)) {
        JOptionPane.showMessageDialog(this, "Please select a birth date before today.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the selected row index
    int selectedRowIndex = jTable_teachersTable.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please select a teacher to update.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Retrieve Teacher ID from the selected row
    teacherID = jTable_teachersTable.getValueAt(selectedRowIndex, 0).toString();

    // Create a new teacher object
    teacher updatedTeacher = new teacher();
    updatedTeacher.setFull_Name(fullName);
    updatedTeacher.setAddress(address);
    updatedTeacher.setContact(contact);
    updatedTeacher.setGender(gender);
    updatedTeacher.setBirthday(birthday);
    updatedTeacher.setTeacher_ID(teacherID);

    try {
        PreparedStatement pst = con.prepareStatement(
            "UPDATE teachers SET Full_Name = ?, Address = ?, Contact = ?, Gender = ?, Birthday = ? WHERE Teacher_ID = ?"
        );

        pst.setString(1, updatedTeacher.getFull_Name());
        pst.setString(2, updatedTeacher.getAddress());
        pst.setString(3, updatedTeacher.getContact());
        pst.setString(4, updatedTeacher.getGender());
        pst.setString(5, updatedTeacher.getBirthday());
        pst.setString(6, updatedTeacher.getTeacher_ID());

        int rowsUpdated = pst.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Teacher updated successfully!");

            // Refresh the table with new data
            table_load();

            // Clear input fields after successful update
            clearFields();
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update teacher.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(teachers.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton_UPDATEActionPerformed

    private void jTable_teachersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_teachersTableMouseClicked
        // Get the selected row index
        int rowIndex = jTable_teachersTable.getSelectedRow();

        // Check if a row is selected
        if (rowIndex != -1) {
            // Get the model from the table
            DefaultTableModel model = (DefaultTableModel) jTable_teachersTable.getModel();
        
            // Retrieve data from the selected row
            String fullName = (String) model.getValueAt(rowIndex, 1); // Assuming Full Name is at column index 1
            String birthday = (String) model.getValueAt(rowIndex, 2); // Assuming Birthday is at column index 2
            String gender = (String) model.getValueAt(rowIndex, 3); // Assuming Gender is at column index 3
            String contact = (String) model.getValueAt(rowIndex, 4); // Assuming Contact is at column index 4
            String address = (String) model.getValueAt(rowIndex, 5); // Assuming Address is at column index 5
        
            // Populate the fields with the retrieved data
            jTextField_fullName.setText(fullName);
            // Set the date in the DateChooser (convert String to Date)
            try {
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
                jDateChooser_DoB.setDate(date);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            if (gender.equals("Male")) {
                jRadioButton_male.setSelected(true);
            } else if (gender.equals("Female")) {
                jRadioButton_female.setSelected(true);
            } else {
                // Handle other cases if needed
            }
            jTextField_contact.setText(contact);
            jTextField_address.setText(address);
        }
    }//GEN-LAST:event_jTable_teachersTableMouseClicked

    private void jButton_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETEActionPerformed
    // DELETE OPERATION

    // Get the selected row index from the table
    int selectedRow = jTable_teachersTable.getSelectedRow();

    // Check if a row is selected
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a teacher to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the teacher ID from the selected row
    String teacherID = jTable_teachersTable.getValueAt(selectedRow, 0).toString(); // Assuming teacher ID is in the first column

    // Ask for confirmation before deleting
    int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this teacher?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    
    if (option == JOptionPane.YES_OPTION) {
        try {
            // Prepare the SQL statement to delete the teacher record
            PreparedStatement pst = con.prepareStatement("DELETE FROM teachers WHERE Teacher_ID = ?");
            pst.setString(1, teacherID);

            // Execute the SQL statement
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Teacher deleted successfully!");
                
                // Refresh the table with updated data
                table_load();
                
                // Clear input fields after successful insertion
                clearFields();

            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete teacher.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(teachers.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_jButton_DELETEActionPerformed

    private void jButton_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CLEARActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton_CLEARActionPerformed

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
            java.util.logging.Logger.getLogger(teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new teachers().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(teachers.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(teachers.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_Gender;
    private javax.swing.JButton jButton_CLEAR;
    private javax.swing.JButton jButton_DELETE;
    private javax.swing.JButton jButton_INSERT;
    private javax.swing.JButton jButton_UPDATE;
    private javax.swing.JButton jButton_back;
    private com.toedter.calendar.JDateChooser jDateChooser_DoB;
    private javax.swing.JLabel jLabel_DoB;
    private javax.swing.JLabel jLabel_address;
    private javax.swing.JLabel jLabel_background;
    private javax.swing.JLabel jLabel_contact;
    private javax.swing.JLabel jLabel_fullName;
    private javax.swing.JLabel jLabel_gender;
    private javax.swing.JLabel jLabel_pic;
    private javax.swing.JMenuBar jMenuBar_menubar;
    private javax.swing.JMenuItem jMenuItem_close;
    private javax.swing.JMenuItem jMenuItem_dashboard;
    private javax.swing.JMenuItem jMenuItem_info;
    private javax.swing.JMenuItem jMenuItem_logout;
    private javax.swing.JMenu jMenu_about;
    private javax.swing.JMenu jMenu_navigation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_registration;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_teachersTable;
    private javax.swing.JTextField jTextField_address;
    private javax.swing.JTextField jTextField_contact;
    private javax.swing.JTextField jTextField_fullName;
    // End of variables declaration//GEN-END:variables

    // Method to load data into the table
    public void table_load(){

    Iteacher teacherImpl = new teacherImpl();
       	ArrayList<teacher> teacherList = teacherImpl.getAllTeacher();

	// Convert the ArrayList to a DefaultTableModel
	DefaultTableModel model = new DefaultTableModel();
	model.addColumn("Teacher ID");
	model.addColumn("Full Name");
	model.addColumn("Birthday");
	model.addColumn("Gender");
	model.addColumn("Contact");
	model.addColumn("Address");

	for (teacher teacher : teacherList) {
            model.addRow(new Object[] {
		teacher.getTeacher_ID(),
		teacher.getFull_Name(),
                teacher.getBirthday(),
                teacher.getGender(),
		teacher.getContact(),
		teacher.getAddress(),
            });
	}

	jTable_teachersTable.setModel(model);

    }

    private void clearFields() {
        // Clear text fields
        jTextField_fullName.setText("");
        jTextField_address.setText("");
        jTextField_contact.setText("");

        // Clear radio buttons
        buttonGroup_Gender.clearSelection(); // Assuming buttonGroup_Gender is your ButtonGroup for gender selection

        // Clear date chooser
        jDateChooser_DoB.setDate(null);
    }
    
}
