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

public class MusteriKatalog {

    private ArrayList<Musteri> musteriler = new ArrayList<>();

    public void put(Musteri musteri) {
        musteriler.add(musteri);
    }

    public Musteri get(String musteriID) {
        Musteri a = null;
        for (int i = 0; i < musteriler.size(); i++) {
            a = musteriler.get(i);
            if (a.getMusteriID().equals(musteriID)) {
                return a;
            }
        }
        return a;
    }

    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(ArrayList<Musteri> musteriler) {
        this.musteriler = musteriler;
    }

}