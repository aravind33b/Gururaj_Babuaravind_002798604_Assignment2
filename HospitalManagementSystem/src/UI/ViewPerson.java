/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author aravind
 */
public class ViewPerson extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatient
     */
    PersonDirectory personDirectory;
    private JSplitPane SplitPane;
    PatientDirectory patientDirectory;
    String searchEmail;
    String mappedDoc ="";
    public ViewPerson(JSplitPane SplitPane,PersonDirectory personDirectory,PatientDirectory patientDirectory, String SearchEmail) {
        initComponents();
        this.personDirectory = personDirectory;
        this.SplitPane = SplitPane;
        this.patientDirectory = patientDirectory;
        this.searchEmail = SearchEmail;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewPersons = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblResidence = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtResidence = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAddPatientID = new javax.swing.JButton();

        tblViewPersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Email ID", "Gender", "Address", "City", "Community", "Role"
            }
        ));
        jScrollPane1.setViewportView(tblViewPersons);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        lblResidence.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblResidence.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResidence.setText("Residence:");

        lblCity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City:");

        lblCommunity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommunity.setText("Community:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddPatientID.setText("Add as Patient");
        btnAddPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddPatientID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                        .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblResidence, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(txtAge)
                                        .addComponent(txtGender)
                                        .addComponent(txtResidence)
                                        .addComponent(txtCity)
                                        .addComponent(txtCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGo)
                            .addComponent(btnAddPatientID)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnView)
                            .addComponent(btnRefresh)
                            .addComponent(btnBack))))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResidence)
                    .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewPersons.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to delete it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPersons.getModel();
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
        
        personDirectory.deletePerson(selectedPerson);
        
        JOptionPane.showMessageDialog(this, "Selected Person was deleted.");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        String SearchString = txtSearch.getText();
        DefaultTableModel model = (DefaultTableModel) tblViewPersons.getModel();
        model.setRowCount(0);
        
        for(Person p: personDirectory.getPersonDirectory())
         {
             System.out.println(SearchString);
             System.out.println(p.getName());
             if(p.getName().equals(SearchString))
             {
             Object[] row = new Object[6];
             row[0]=p;
             row[1]=p.getAge();
             //row[2]=p.getGender();
             row[3]=p.getAddress();
             row[4]=p.getCity();
             row[5]=p.getCommunity();
             
             model.addRow(row);
             break;
             }
         }
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewPersons.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to view or update it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPersons.getModel();
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
        
        txtName.setText(selectedPerson.getName());
        txtAge.setText(String.valueOf(selectedPerson.getAge()));
        //txtGender.setText(selectedPerson.getGender());
        txtCity.setText(selectedPerson.getCity());
        txtResidence.setText(selectedPerson.getAddress());
        txtCommunity.setText(selectedPerson.getCommunity());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    String Name = txtName.getText();
    String Gender = txtGender.getText();
    String Residence = txtResidence.getText();
    String City = txtCity.getText();
    int Age = Integer.parseInt(txtAge.getText());
    String Community = txtCommunity.getText();
    
    int selectedRowIndex = tblViewPersons.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to view or update it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPersons.getModel();
        
        model.setValueAt(Name, selectedRowIndex, 0);
        model.setValueAt(Age, selectedRowIndex, 1);
        model.setValueAt(Gender, selectedRowIndex, 2);
        model.setValueAt(Residence, selectedRowIndex, 3);
        model.setValueAt(City, selectedRowIndex, 4);
        model.setValueAt(Community, selectedRowIndex, 5);
        
        int v=0;
        
        for(Person p: personDirectory.getPersonDirectory())
        {
            if(v == selectedRowIndex)
            {
                p.setName(Name);
                p.setAge(Age);
                //p.setGender(Gender);
                p.setAddress(Residence);
                p.setCommunity(Community);
                p.setCity(City);
            }
            v++;
        }    
    
    JOptionPane.showMessageDialog(this,"Selected Person Details Updated.");
    
    txtName.setText("");
    txtAge.setText("");
    txtGender.setText("");
    txtResidence.setText("");
    txtCommunity.setText("");
    txtCity.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        PersonDetails personDetails = new PersonDetails(SplitPane,personDirectory,patientDirectory);
        SplitPane.setRightComponent(personDetails);
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void btnAddPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientIDActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewPersons.getSelectedRow();
        
        PatientDetails addPatientDetails = new PatientDetails(SplitPane,patientDirectory,personDirectory,selectedRowIndex);
        SplitPane.setRightComponent(addPatientDetails);
    }//GEN-LAST:event_btnAddPatientIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatientID;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblResidence;
    private javax.swing.JTable tblViewPersons;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtResidence;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblViewPersons.getModel();
         model.setRowCount(0);
         
         for(Person p: personDirectory.getPersonDirectory())
         {
             if(p.getEmail().equals(searchEmail))
             {
                 String mappedDoc = p.getName();
             }
             if(p.getPatientToDoctor().equals(mappedDoc))
             {
             Object[] row = new Object[8];
             row[0]=p;
             row[1]=p.getAge();
             row[2]=p.getEmail();
             row[3]=p.getGender();
             row[4]=p.getAddress();
             row[5]=p.getCity();
             row[6]=p.getCommunity();
             row[7]=p.getRole();
             
             model.addRow(row);
             }
         }
    }
}
