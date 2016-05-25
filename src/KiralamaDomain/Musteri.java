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
public class Musteri {
    private String musteriID;
    private String musteriName;
    private String musteriSurname;
    private String musteriPassword;

    public Musteri(String musteriID, String musteriName, String musteriSurname, String musteriPassword) {
        this.musteriID = musteriID;
        this.musteriName = musteriName;
        this.musteriSurname = musteriSurname;
        this.musteriPassword = musteriPassword;
    }

    public String getMusteriID() {
        return musteriID;
    }

    public void setMusteriID(String musteriID) {
        this.musteriID = musteriID;
    }

    public String getMusteriName() {
        return musteriName;
    }

    public void setMusteriName(String musteriName) {
        this.musteriName = musteriName;
    }

    public String getMusteriSurname() {
        return musteriSurname;
    }

    public void setMusteriSurname(String musteriSurname) {
        this.musteriSurname = musteriSurname;
    }

    public String getMusteriPassword() {
        return musteriPassword;
    }

    public void setMusteriPassword(String musteriPassword) {
        this.musteriPassword = musteriPassword;
    }

    @Override
    public String toString() {
        return this.musteriName + " " + this.musteriSurname;
    }
    
    

}
