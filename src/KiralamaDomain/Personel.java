/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiralamaDomain;

/**
 *
 * @author ozcan
 */
public class Personel {
    private String personelID;
    private String personelName;
    private String personelSurname;
    private String personelPassword;

    public Personel(String personelID, String personelName, String personelSurname, String personelPassword) {
        this.personelID = personelID;
        this.personelName = personelName;
        this.personelSurname = personelSurname;
        this.personelPassword = personelPassword;
    }

    public String getPersonelID() {
        return personelID;
    }

    public void setPersonelID(String personelID) {
        this.personelID = personelID;
    }

    public String getPersonelName() {
        return personelName;
    }

    public void setPersonelName(String personelName) {
        this.personelName = personelName;
    }

    public String getPersonelSurname() {
        return personelSurname;
    }

    public void setPersonelSurname(String personelSurname) {
        this.personelSurname = personelSurname;
    }

    public String getPersonelPassword() {
        return personelPassword;
    }

    public void setPersonelPassword(String personelPassword) {
        this.personelPassword = personelPassword;
    }
    
    @Override
    public String toString() {
        return this.personelName + " " + this.personelSurname;
    }
}
