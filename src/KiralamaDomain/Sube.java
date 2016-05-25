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
public class Sube {
    private String subeID;
    private String subeAdi;

    public Sube(String subeID, String subeAdi) {
        this.subeID = subeID;
        this.subeAdi = subeAdi;
    }

    public String getSubeID() {
        return subeID;
    }

    public void setSubeID(String subeID) {
        this.subeID = subeID;
    }

    public String getSubeAdi() {
        return subeAdi;
    }

    public void setSubeAdi(String subeAdi) {
        this.subeAdi = subeAdi;
    }

    @Override
    public String toString() {
        return this.subeAdi;
    }
    
}
