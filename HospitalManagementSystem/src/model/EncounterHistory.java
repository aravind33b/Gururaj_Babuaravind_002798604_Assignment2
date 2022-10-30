/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Subhash
 */
public class EncounterHistory {
    private ArrayList <Encounter> EncounterHistory;

    public ArrayList<Encounter> getEncounterHistory() {
        return EncounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }

    public EncounterHistory() {
        this.EncounterHistory = new ArrayList <Encounter>();
    }
    
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        EncounterHistory.add(newEncounter);
        return newEncounter;
    }
    public void deleteEncounter(Encounter E)
    {
        EncounterHistory.remove(E);
    }
}
