/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Subhash
 */
public class Patient extends Person {

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }
    @Override
    public String toString()
    {
        return Name;
    }
    private int PatientID;
    EncounterHistory EH = new EncounterHistory();
    private boolean abnormal;
    private boolean abnormalBloodPressure;
    private boolean abnormalTemperature;
    private boolean abnormalPulse;

    public boolean isAbnormalBloodPressure() {
        return abnormalBloodPressure;
    }

    public void setAbnormalBloodPressure(boolean abnormalBloodPressure) {
        this.abnormalBloodPressure = abnormalBloodPressure;
    }

    public boolean isAbnormalTemperature() {
        return abnormalTemperature;
    }

    public void setAbnormalTemperature(boolean abnormalTemperature) {
        this.abnormalTemperature = abnormalTemperature;
    }

    public boolean isAbnormalPulse() {
        return abnormalPulse;
    }

    public void setAbnormalPulse(boolean abnormalPulse) {
        this.abnormalPulse = abnormalPulse;
    }

    
    public boolean isAbnormal() {
        return abnormal;
    }

    public void setAbnormal(boolean abnormal) {
        this.abnormal = abnormal;
    }


    
    public EncounterHistory getEH() {
        return EH;
    }

    public void setEH(EncounterHistory EH) {
        this.EH = EH;
    }
    
}
