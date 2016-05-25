/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiralamaDomain;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author ozcan
 */
public class Register {
    public AracKatalog aracKatalog;
    public PersonelKatalog personelKatalog;
    public MusteriKatalog musteriKatalog;
    public SubeKatalog subeKatalog;
    public AracKiralamaKatalog aracKiralamaKatalog;
    public AracSahibiKatalog aracSahibiKatalog;
    public ServisKatalog servisKatalog;
    
    private AracKiralama ak;
    private AracEkleme ae;
    private ServiseGonderme sg;

    public Register(AracKatalog aracKatalog, PersonelKatalog personelKatalog, MusteriKatalog musteriKatalog, SubeKatalog subeKatalog, AracKiralamaKatalog aracKiralamaKatalog, AracSahibiKatalog aracSahibiKatalog, ServisKatalog servisKatalog) {
        this.aracKatalog = aracKatalog;
        this.personelKatalog = personelKatalog;
        this.musteriKatalog = musteriKatalog;
        this.subeKatalog = subeKatalog;
        this.aracKiralamaKatalog = aracKiralamaKatalog;
        this.aracSahibiKatalog = aracSahibiKatalog;
        this.servisKatalog = servisKatalog;
    }

    public void aracKiralamaBaslat() {
        this.ak = new AracKiralama();
    }
    
    public void musteriSec(Musteri musteri) {
        this.ak.setMusteri(musteri);
    }

    public ArrayList<Arac> tarihVeSubeSec(String baslangic, String bitis, Sube teslimAlinanSube, Sube teslimEdilecekSube) {
        this.ak.setBaslangicTarihi(baslangic);
        this.ak.setBitisTarihi(bitis);
        
        this.ak.setTeslimAlinanSube(teslimAlinanSube);
        this.ak.setTeslimEdilecekSube(teslimEdilecekSube);

        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd.MM.yyyy");
        DateTime dbaslangic = formatter.parseDateTime(baslangic);
        DateTime dbitis = formatter.parseDateTime(bitis);
        Interval istenenAralik = new Interval(dbaslangic, dbitis);
        
        ArrayList<Arac> uygunAraclar = new ArrayList();
        
        for (Arac arac: aracKatalog.getAraclarBySube(teslimAlinanSube)) {
            if (arac.isServisteMi()) {
                continue;
            }
            ArrayList<AracKiralama> aracinKiralamalari = aracKiralamaKatalog.getKiralamalarByArac(arac);
            
            Boolean cakismaVar = false;
            
            for (AracKiralama kiralama : aracinKiralamalari) {
                DateTime kbaslangic = formatter.parseDateTime(kiralama.getBaslangicTarihi());
                DateTime kbitis = formatter.parseDateTime(kiralama.getBitisTarihi());

                Interval kiralamaAraligi = new Interval(kbaslangic, kbitis);
                if (kiralamaAraligi.contains(dbaslangic) || kiralamaAraligi.contains(dbitis) || istenenAralik.contains(kbaslangic) || istenenAralik.contains(kbitis)) {
                    cakismaVar = true;
                    break;
                }
 
            }
            
            if (!cakismaVar) {
                uygunAraclar.add(arac);
            }
        }
        
        return uygunAraclar;
    }
    
    public String aracSec(String aracID) {
        this.ak.setArac(aracKatalog.get(aracID));
        return this.ak.ucretHesapla();
    }
    
    public boolean odemeYap(String kartNo, String sonKullanmaAy, String sonKullanmaYil, String cvv) {
        if (KiralamaBackend.BankaSistemi.CreditCardTransaction(this.ak.getMusteri().toString(), kartNo, sonKullanmaAy, sonKullanmaYil, cvv)) {
            this.ak.setOdemeOnay(true);
        }
        return this.ak.getOdemeOnay();
    }
    
    public void aracKiralamaBitir() {
        aracKiralamaKatalog.put(this.ak);
        this.ak = null;
    }
        
    
    public void aracKiralamaIptal() {
        this.ak = null;
    }
    
    public void aracEklemeBaslat() {
        this.ae = new AracEkleme();
    }
    
    public void aracSahibiTanimla(AracSahibi aracSahibi) {
        this.ae.setAracSahibi(aracSahibi);
    }
    
    public void aracEklemeIptal() {
        this.ae = null;
    }
    
    public void aracBilgileriGir(Sube sube, String marka, String model, String plaka, String ucret) { 
        Arac yeniArac = new Arac(plaka, marka, model, ucret, plaka, sube.getSubeID(), this.ae.getAracSahibi().getAracSahibiID());
        this.ae.setArac(yeniArac);
    }
    
    public void aracEklemeBitir() {
        this.aracKatalog.put(this.ae.getArac());
        this.ae = null;
    }
    
    public void serviseGondermeBaslat() {
        this.sg = new ServiseGonderme();
    }
    
    public void servisSec(Servis servis) {
        this.sg.setServis(servis);
    }
    
    public ArrayList<Arac> servisIcinSubeSec(Sube sube) {
        return this.aracKatalog.getAraclarBySube(sube);
    }
    
    public void servisIcinAracSec(String aracID) {
        this.sg.setArac(this.aracKatalog.get(aracID));
    }
    
    public void serviseGondermeBitir() {
        this.sg.getArac().setServisteMi(true);
        this.sg = null;
    }
    
    public void serviseGondermeIptal() {
        this.sg = null;
    }

}
