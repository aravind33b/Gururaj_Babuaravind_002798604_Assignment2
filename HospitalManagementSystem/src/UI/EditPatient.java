/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Subhash
 */
public class EditPatient extends javax.swing.JPanel {

    /** Creates new form EditPatient */
    PatientDirectory patientDirectory;
    private JSplitPane SplitPane;
    private int PatientID;
    PersonDirectory personDirectory;
    String InitialName;
    String InitialGender;
    int InitialAge;
    public EditPatient(JSplitPane SplitPane,PatientDirectory patientDirectory,PersonDirectory personDirectory,int PatientID) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.SplitPane = SplitPane;
        this.PatientID = PatientID;
        this.personDirectory = personDirectory;
        
        for(Patient p: patientDirectory.getPatientDirectory())
         {
             if(p.getPatientID()==PatientID)
             {
             this.InitialName = p.getName();
             this.InitialAge = p.getAge();
             //this.InitialGender = p.getGender();
             txtName.setText(p.getName());
             txtAge.setText(String.valueOf(p.getAge()));
             //txtGender.setText(p.getGender());
             txtResidence.setText(p.getAddress());
             txtCity.setText(p.getCity());
             txtCommunity.setText(p.getCommunity());
             txtPatientID.setText(String.valueOf(p.getPatientID()));
             }
         }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblResidence = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtResidence = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Edit Patient Details");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblAge.setText("Age:");

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        lblResidence.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResidence.setText("Residence:");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City:");

        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommunity.setText("Community:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Patient ID:");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAge)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblResidence, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtName)
                        .addComponent(txtAge)
                        .addComponent(txtGender)
                        .addComponent(txtResidence)
                        .addComponent(txtCity)
                        .addComponent(txtCommunity)
                        .addComponent(txtPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResidence)
                    .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
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
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Name Feild is empty.");
        }
       else if(txtAge.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Age Feild is empty");
       }
       else if(txtGender.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Gender Feild is empty");
       }
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
       else if(txtPatientID.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Patient ID Feild is empty");
       }
       else if(!isInteger(txtAge.getText()))
       {
        JOptionPane.showMessageDialog(this, "Age Entered should be Integer");
       }
       else if(Integer.parseInt(txtAge.getText())>200)
       {
        JOptionPane.showMessageDialog(this, "Age Should not be over 200");
       }
       else if(!isInteger(txtPatientID.getText()))
       {
        JOptionPane.showMessageDialog(this, "Patient ID Entered should be Integer");
       }
       
       else if(!(txtGender.getText().equals("Male") || txtGender.getText().equals("Female") || txtGender.getText().equals("male") || txtGender.getText().equals("female")))
       {
        JOptionPane.showMessageDialog(this, "Gender Feild Invalid");
       }
        else
        {
        for(Patient p: patientDirectory.getPatientDirectory())
         {
             if(p.getPatientID()==PatientID)
             {
             p.setName(txtName.getText());
             p.setAge(Integer.parseInt(txtAge.getText()));
             //p.setGender(txtGender.getText());
             p.setAddress(txtResidence.getText());
             p.setCity(txtCity.getText());
             p.setCommunity(txtCommunity.getText());
             p.setPatientID(Integer.parseInt(txtPatientID.getText()));
             }
         }
        
        JOptionPane.showMessageDialog(this, "Selected Patient was Updated.");
        txtName.setText("");
        txtPatientID.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtResidence.setText("");
        txtCity.setText("");
        txtCommunity.setText("");
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ViewPatient viewPatientDetails = new ViewPatient(SplitPane,patientDirectory,personDirectory);
        SplitPane.setRightComponent(viewPatientDetails);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblResidence;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtResidence;
    // End of variables declaration//GEN-END:variables

}
