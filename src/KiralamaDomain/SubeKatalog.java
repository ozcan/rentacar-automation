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

public class SubeKatalog {

    private ArrayList<Sube> subeler = new ArrayList<>();

    public void put(Sube sube) {
        subeler.add(sube);
    }

    public Sube get(String subeID) {
        Sube a = null;
        for (int i = 0; i < subeler.size(); i++) {
            a = subeler.get(i);
            if (a.getSubeID().equals(subeID)) {
                return a;
            }
        }
        return null;
    }

    public ArrayList<Sube> getSubeler() {
        return subeler;
    }

    public void setSubeler(ArrayList<Sube> subeler) {
        this.subeler = subeler;
    }

}