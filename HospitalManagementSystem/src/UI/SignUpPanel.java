/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Person;
import model.PersonDirectory;
import javax.swing.JSplitPane;
import model.PatientDirectory;
/**
 *
 * @author aravind
 */
public class SignUpPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpPanel
     */
    //JOptionPane.Visibility = true;
    static String doctorButton = "Doctor";
    static String patientButton = "Patient";
    static String Role = "";
    static String License = "";
    
    PersonDirectory personDirectory;
    private JSplitPane SplitPane;
    PatientDirectory patientDirectory;
    public SignUpPanel(JSplitPane SplitPane, PersonDirectory personDirectory, PatientDirectory patientDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.SplitPane = SplitPane;
        this.patientDirectory = patientDirectory;
    }
    
    private static boolean checkInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }
    return true;
    }
    
    public SignUpPanel() {
        initComponents();
        //JRadioButton doctorRadio = new JRadioButton(doctorButton);
        licenseLabel.setVisible(false);
        licenseField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        licenseLabel = new javax.swing.JLabel();
        licenseField = new javax.swing.JTextField();
        doctorRadio = new javax.swing.JRadioButton();
        patientRadio = new javax.swing.JRadioButton();
        genderBox = new javax.swing.JComboBox<>();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        communityLabel = new javax.swing.JLabel();
        communityField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();

        nameLabel.setText("Full Name");

        emailLabel.setText("Email ID");

        passLabel.setText("Password");

        genderLabel.setText("Gender");

        ageLabel.setText("Age");

        licenseLabel.setText("License Number");

        buttonGroup1.add(doctorRadio);
        doctorRadio.setText("Doctor");
        doctorRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(patientRadio);
        patientRadio.setText("Patient");
        patientRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientRadioActionPerformed(evt);
            }
        });

        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Prefer not to say" }));

        addressLabel.setText("Address");

        cityLabel.setText("City");

        communityLabel.setText("Community");

        submitButton.setText("Sign Up");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(nameLabel)
                    .addComponent(passLabel)
                    .addComponent(genderLabel)
                    .addComponent(ageLabel)
                    .addComponent(addressLabel)
                    .addComponent(cityLabel)
                    .addComponent(communityLabel)
                    .addComponent(licenseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ageField)
                    .addComponent(genderBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 150, Short.MAX_VALUE)
                    .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressField)
                    .addComponent(cityField)
                    .addComponent(communityField)
                    .addComponent(licenseField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(passField))
                .addGap(249, 249, 249))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(doctorRadio)
                        .addGap(53, 53, 53)
                        .addComponent(patientRadio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(submitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityLabel)
                    .addComponent(communityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseLabel)
                    .addComponent(licenseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorRadio)
                    .addComponent(patientRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void doctorRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorRadioActionPerformed
        if(doctorRadio.isSelected() == true){
            licenseLabel.setVisible(true);
            licenseField.setVisible(true);
            Role = "Doctor";
        }
    }//GEN-LAST:event_doctorRadioActionPerformed

    private void patientRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientRadioActionPerformed
        if(patientRadio.isSelected() == true){
            licenseLabel.setVisible(false);
            licenseField.setVisible(false);
            Role = "Patient";
        }
    }//GEN-LAST:event_patientRadioActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
       if(nameField.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Enter a Name");
       }
       else if(emailField.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this,"Enter an email id");
       }
       else if(passField.getPassword().equals(""))
       {
           JOptionPane.showMessageDialog(this,"Enter a password");
       }
       else if(ageField.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Enter an Age");
       }
//       else if(txtGender.getText().equals(""))
//       {
//        JOptionPane.showMessageDialog(this, "Gender Feild is empty");
//       }
       else if(addressField.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Enter an address");
       }
       else if(cityField.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Enter a city");
       }
       else if(communityField.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Enter a community");
       }
       else if(licenseField.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Enter a License ID");
       }
       else if(!checkInteger(ageField.getText()))
       {
        JOptionPane.showMessageDialog(this, "Age Entered should be Integer");
       }
       else if(Integer.parseInt(ageField.getText())>150)
       {
        JOptionPane.showMessageDialog(this, "Age Should not be over 150");
       }
//       else if(!(txtGender.getText().equals("Male") || txtGender.getText().equals("Female") || txtGender.getText().equals("male") || txtGender.getText().equals("female")))
//       {
//        JOptionPane.showMessageDialog(this, "Gender Feild Invalid");
//       }
       else
       {
        String Name = nameField.getText();
        String Gender = String.valueOf(genderBox.getEditor().getItem());
        String Email = emailField.getText();
        char Password[] = passField.getPassword();
        int age = Integer.parseInt(ageField.getText());
        String Address = addressField.getText();
        String City = cityField.getText();
        String Community = communityField.getText();
        String License = licenseField.getText();
        
        Person p = personDirectory.addNewPerson();
        p.setName(Name);
        p.setAge(age);
        p.setGender(Gender);
        p.setAddress(Address);
        p.setCity(City);
        p.setCommunity(Community);
        p.setLicense(License);
        p.setRole(Role);
        
        JOptionPane.showMessageDialog(this, "Person Details Saved");
        
        nameLabel.setText("");
        ageLabel.setText("");
        genderBox.setSelectedItem("Select");
        addressLabel.setText("");
        cityLabel.setText("");
        communityLabel.setText("");
       }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField communityField;
    private javax.swing.JLabel communityLabel;
    private javax.swing.JRadioButton doctorRadio;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField licenseField;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JRadioButton patientRadio;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
