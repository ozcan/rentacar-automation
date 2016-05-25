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

public class PersonelKatalog {

    private ArrayList<Personel> personeller = new ArrayList<>();

    public void put(Personel personel) {
        personeller.add(personel);
    }

    public Personel get(String personelID) {
        Personel a = null;
        for (int i = 0; i < personeller.size(); i++) {
            a = personeller.get(i);
            if (a.getPersonelID().equals(personelID)) {
                return a;
            }
        }
        return null;
    }

    public ArrayList<Personel> getPersoneller() {
        return personeller;
    }

    public void setPersoneller(ArrayList<Personel> personeller) {
        this.personeller = personeller;
    }

}