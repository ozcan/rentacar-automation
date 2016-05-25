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
import java.util.ArrayList;

public class ServisKatalog {

    private ArrayList<Servis> servisler = new ArrayList<>();

    public void put(Servis servis) {
        servisler.add(servis);
    }

    public Servis get(String servisID) {
        Servis a = null;
        for (int i = 0; i < servisler.size(); i++) {
            a = servisler.get(i);
            if (a.getServisID().equals(servisID)) {
                return a;
            }
        }
        return null;
    }

    public ArrayList<Servis> getServisler() {
        return servisler;
    }

    public void setServisler(ArrayList<Servis> servisler) {
        this.servisler = servisler;
    }

}