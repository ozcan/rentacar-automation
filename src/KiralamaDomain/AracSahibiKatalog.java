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

public class AracSahibiKatalog {

    private ArrayList<AracSahibi> aracSahipleri = new ArrayList<>();

    public void put(AracSahibi aracSahibi) {
        aracSahipleri.add(aracSahibi);
    }

    public AracSahibi get(String aracSahibiID) {
        AracSahibi a = null;
        for (int i = 0; i < aracSahipleri.size(); i++) {
            a = aracSahipleri.get(i);
            if (a.getAracSahibiID().equals(aracSahibiID)) {
                return a;
            }
        }
        return null;
    }

    public ArrayList<AracSahibi> getAracSahipleri() {
        return aracSahipleri;
    }

    public void setAracSahipleri(ArrayList<AracSahibi> aracSahipleri) {
        this.aracSahipleri = aracSahipleri;
    }

}