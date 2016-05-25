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

public class AracKiralamaKatalog {

    private ArrayList<AracKiralama> kiralamalar = new ArrayList<>();

    public void put(AracKiralama kiralama) {
        kiralamalar.add(kiralama);
    }

    public AracKiralama get(String kiralamaID) {
        AracKiralama a = null;
        for (int i = 0; i < kiralamalar.size(); i++) {
            a = kiralamalar.get(i);
            if (a.getKiralamaID().equals(kiralamaID)) {
                return a;
            }
        }
        return a;
    }

    public ArrayList<AracKiralama> getAracKiralamaler() {
        return kiralamalar;
    }

    public void setAracKiralamaler(ArrayList<AracKiralama> kiralamalar) {
        this.kiralamalar = kiralamalar;
    }

    public ArrayList<AracKiralama> getKiralamalarByArac(Arac arac) {
        ArrayList<AracKiralama> sonuc = new ArrayList<>();
        AracKiralama kiralama = null;
        for (int i = 0; i < kiralamalar.size(); i++) {
            kiralama = kiralamalar.get(i);
            if (kiralama.getArac().getAracID().equals(arac.getAracID())) {
                sonuc.add(kiralama);
            }
        }
        return sonuc;
    }
}