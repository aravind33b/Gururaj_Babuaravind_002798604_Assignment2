/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aravind
 */
public class Person extends Address{

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getPatientToDoctor() {
        return mapName;
    }
    
    public void setPatientToDoctor(String Name) {
        this.mapName = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public void setEmail(String Email)
    {
        this.Email = Email;
    }
    
    public String getRole() {
        return Role;
    }

    public void setRole(String Role)
    {
        this.Role = Role;
    }
    
    public char[] getPassword() {
        return Password;
    }

    public void setPassword(char Password[])
    {
        this.Password = Password;
    }
    
    public String getLicense() {
        return License;
    }

    public void setLicense(String License)
    {
        this.License = License;
    }
    
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    @Override
    public String toString()
    {
        return Name;
    }
    protected String Name;
    protected int age;
    protected String Gender;
    protected String Email;
    protected String Role;
    protected String License;
    protected char Password[];
    protected String mapName;
}
