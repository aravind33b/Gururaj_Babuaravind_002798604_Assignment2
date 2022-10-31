/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import model.Patient;
import model.PatientDirectory;
import UI.PersonDetails;

/**
 *
 * @author aravind
 */
public class PersonDetails extends javax.swing.JPanel {

    /**
     * Creates new form PersonDetails
     */
    static String Role = "";
           
    Integer PatientID = 0;
    private int selectedRowIndex;
    String InitialName;
    int InitialAge;
    String InitialGender;
    //String Password;
    PersonDirectory personDirectory;
    private JSplitPane SplitPane;
    PatientDirectory patientDirectory;
    String SearchEmail;
    public PersonDetails(JSplitPane SplitPane, PersonDirectory personDirectory, PatientDirectory patientDirectory) {
        initComponents();
        licenseLabel.setVisible(false);
        licenseField.setVisible(false);
        this.personDirectory = personDirectory;
        this.SplitPane = SplitPane;
        this.patientDirectory = patientDirectory;
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
        titlePerson = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblResidence = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtResidence = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        genderBox = new javax.swing.JComboBox<>();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        licenseLabel = new javax.swing.JLabel();
        licenseField = new javax.swing.JTextField();
        doctorRadio = new javax.swing.JRadioButton();
        patientRadio = new javax.swing.JRadioButton();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();

        titlePerson.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titlePerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePerson.setText("Person Details");
        titlePerson.setToolTipText("");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("Age:");

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        lblResidence.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResidence.setText("Address:");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City:");

        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommunity.setText("Community:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Prefer not to say" }));

        emailLabel.setText("Email ID:");

        licenseLabel.setText("License ID:");

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

        passLabel.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAge)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(licenseLabel)
                            .addComponent(passLabel))
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doctorRadio)
                        .addGap(56, 56, 56)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(genderBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)
                        .addComponent(txtResidence, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCommunity, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(licenseField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(patientRadio))
                .addGap(0, 198, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePerson)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResidence)
                    .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseLabel)
                    .addComponent(licenseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorRadio)
                    .addComponent(patientRadio))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed
    private static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }
    // only got here if we didn't return false
    return true;
}
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Name Feild is empty");
       }
       else if(txtAge.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Age Feild is empty");
       }
//       else if(txtGender.getText().equals(""))
//       {
//        JOptionPane.showMessageDialog(this, "Gender Feild is empty");
//       }
       else if(txtResidence.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Residence Feild is empty");
       }
       else if(txtCity.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "City Feild is empty");
       }
       else if(txtCommunity.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Community Feild is empty");
       }
       else if(!isInteger(txtAge.getText()))
       {
        JOptionPane.showMessageDialog(this, "Age Entered should be Integer");
       }
       else if(Integer.parseInt(txtAge.getText())>200)
       {
        JOptionPane.showMessageDialog(this, "Age Should not be over 200");
       }
//       else if(!(txtGender.getText().equals("Male") || txtGender.getText().equals("Female") || txtGender.getText().equals("male") || txtGender.getText().equals("female")))
//       {
//        JOptionPane.showMessageDialog(this, "Gender Feild Invalid");
//       }
       else
       {
        String Name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String Gender = String.valueOf(genderBox.getEditor().getItem());
        String Email = emailField.getText();
        String Residence = txtResidence.getText();
        String City = txtCity.getText();
        String Community = txtCommunity.getText();
        char Password[] = passField.getPassword();
        
        Person p = personDirectory.addNewPerson();
        p.setName(Name);
        p.setAge(age);
        p.setEmail(Email);
        p.setGender(Gender);
        p.setAddress(Residence);
        p.setCity(City);
        p.setCommunity(Community);
        p.setRole(Role);
        p.setPassword(Password);
        p.setPatientToDoctor("none");
        
        JOptionPane.showMessageDialog(this, "Person Details Saved");
        
        txtName.setText("");
        txtAge.setText("");
        genderBox.setSelectedItem("Select");
        txtResidence.setText("");
        txtCity.setText("");
        txtCommunity.setText("");
        emailField.setText("");
        licenseField.setText("");
        
        //writting into Patient Table as well
        int t=0;
//        for(Patient pt: patientDirectory.getPatientDirectory())
//        {
//            if(pt.getPatientID()==Integer.parseInt(txtPatientID.getText()))
//                t++;
//        }
        if(t==0)
        {
//        String Name = txtName.getText();
//        int age = Integer.parseInt(txtAge.getText());
//        String Gender = txtGender.getText();
//        String Residence = txtResidence.getText();
//        String City = txtCity.getText();
//        String Community = txtCommunity.getText();
//        int PatientID = Integer.parseInt(txtPatientID.getText());
        
        Patient pnt = patientDirectory.addNewPatient();
        pnt.setName(Name);
        pnt.setAge(age);
        pnt.setGender(Gender);
        pnt.setAddress(Residence);
        pnt.setCity(City);
        pnt.setCommunity(Community);
        pnt.setPatientID(++PatientID);
        }
//        else
//        {
//            JOptionPane.showMessageDialog(this, "This patient ID is already used");
//        }
       }
    }//GEN-LAST:event_btnSaveActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton doctorRadio;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblResidence;
    private javax.swing.JTextField licenseField;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JRadioButton patientRadio;
    private javax.swing.JLabel titlePerson;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtResidence;
    // End of variables declaration//GEN-END:variables
}
