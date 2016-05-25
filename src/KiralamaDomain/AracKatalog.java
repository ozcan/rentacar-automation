package KiralamaDomain;

import java.util.ArrayList;

public class AracKatalog {

    private ArrayList<Arac> araclar = new ArrayList<>();

    public void put(Arac arac) {
        araclar.add(arac);
    }

    public Arac get(String aracID) {
        Arac a = null;
        for (int i = 0; i < araclar.size(); i++) {
            a = araclar.get(i);
            if (a.getAracID().equals(aracID)) {
                return a;
            }
        }
        return a;
    }

    public ArrayList<Arac> getAraclar() {
        return araclar;
    }

    public void setAraclar(ArrayList<Arac> araclar) {
        this.araclar = araclar;
    }
    
    public ArrayList<Arac> getAraclarBySube(Sube sube) {
        ArrayList<Arac> sonuc = new ArrayList<>();
        Arac arac;
        for (int i = 0; i < araclar.size(); i++) {
            arac = araclar.get(i);
            if(arac.getSubeID().equals(sube.getSubeID())) {
                sonuc.add(arac);
            }
        }
        return sonuc;
    }
}