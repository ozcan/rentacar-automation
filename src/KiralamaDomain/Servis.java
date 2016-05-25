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
public class Servis {
    private String servisID;
    private String servisAdi;

    public Servis(String servisID, String servisAdi) {
        this.servisID = servisID;
        this.servisAdi = servisAdi;
    }

    public String getServisID() {
        return servisID;
    }

    public void setServisID(String servisID) {
        this.servisID = servisID;
    }

    public String getServisAdi() {
        return servisAdi;
    }

    public void setServisAdi(String servisAdi) {
        this.servisAdi = servisAdi;
    }

    @Override
    public String toString() {
        return this.servisAdi;
    }
    
}
