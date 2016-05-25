/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiralamaDomain;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author ozcan
 */
public class AracKiralama {
    private String kiralamaID;
    private Musteri musteri;
    private Personel personel;
    private Arac arac;

    private Sube teslimAlinanSube;
    private Sube teslimEdilecekSube;
    
    private String baslangicTarihi;
    private String bitisTarihi;
    
    private String toplamUcret;
    private Boolean odemeOnay;

    public AracKiralama(String kiralamaID, Musteri musteri, Personel personel, Arac arac, Sube teslimAlinanSube, Sube teslimEdilecekSube, String baslangicTarihi, String bitisTarihi, String toplamUcret, Boolean odemeOnaylandiMi) {
        this.kiralamaID = kiralamaID;
        this.musteri = musteri;
        this.personel = personel;
        this.arac = arac;
        this.teslimAlinanSube = teslimAlinanSube;
        this.teslimEdilecekSube = teslimEdilecekSube;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.toplamUcret = toplamUcret;
        this.odemeOnay = odemeOnaylandiMi;
    }
    
    public AracKiralama() {
        this.kiralamaID = Integer.toString(this.hashCode());
    }

    public String ucretHesapla() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd.MM.yyyy");
        DateTime dbaslangic = formatter.parseDateTime(this.baslangicTarihi);
        DateTime dbitis = formatter.parseDateTime(this.bitisTarihi);
        
        int gun = Days.daysBetween(dbaslangic.withTimeAtStartOfDay(), dbitis.withTimeAtStartOfDay()).getDays();
        this.toplamUcret = String.valueOf(Integer.parseInt(this.arac.getKiraBedeli()) * gun);
        return this.toplamUcret;
    }

    public String getKiralamaID() {
        
        return kiralamaID;
    }

    public void setKiralamaID(String kiralamaID) {
        this.kiralamaID = kiralamaID;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }

    public Sube getTeslimAlinanSube() {
        return teslimAlinanSube;
    }

    public void setTeslimAlinanSube(Sube teslimAlinanSube) {
        this.teslimAlinanSube = teslimAlinanSube;
    }

    public Sube getTeslimEdilecekSube() {
        return teslimEdilecekSube;
    }

    public void setTeslimEdilecekSube(Sube teslimEdilecekSube) {
        this.teslimEdilecekSube = teslimEdilecekSube;
    }

    public String getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(String baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public String getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(String bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public String getToplamUcret() {
        return toplamUcret;
    }

    public void setToplamUcret(String toplamUcret) {
        this.toplamUcret = toplamUcret;
    }

    public Boolean getOdemeOnay() {
        return odemeOnay;
    }

    public void setOdemeOnay(Boolean odemeOnay) {
        this.odemeOnay = odemeOnay;
    }



}
