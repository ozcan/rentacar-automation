/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiralamaUI;
import KiralamaDomain.Arac;
import KiralamaDomain.Sistem;
import KiralamaDomain.Register;
import KiralamaDomain.Personel;
import KiralamaDomain.Musteri;
import KiralamaDomain.Sube;
import KiralamaDomain.AracKiralama;
import KiralamaDomain.AracSahibi;
import KiralamaDomain.Servis;

/**
 *
 * @author ozcan
 */
public class Main {
    public static Sistem sistem = new KiralamaDomain.Sistem();
    public static Register register = sistem.register;

    public static AracSahibi loggedAracSahibi;
    public static Personel loggedPersonel;
    
    public static void main(String args[]) {
        register.personelKatalog.put(new Personel("1", "Ahmet", "Yilmaz", "1"));
        register.personelKatalog.put(new Personel("2", "Serdar", "Basmaci", "123456"));
        register.personelKatalog.put(new Personel("3", "Ozcan", "Esen", "123456"));
        
        register.musteriKatalog.put(new Musteri("serdar", "Serdar", "Basmaci", "123456"));
        
        register.subeKatalog.put(new Sube("1", "Canakkale"));
        register.subeKatalog.put(new Sube("2", "Biga"));
        register.subeKatalog.put(new Sube("3", "Ankara"));
        register.subeKatalog.put(new Sube("4", "Diyarbakir"));
        register.subeKatalog.put(new Sube("5", "Istanbul Ataturk Havalimani"));
        
        register.aracSahibiKatalog.put(new AracSahibi("1", "ahmet", "karakas", "1"));
        
        register.aracKatalog.put(new Arac("1", "Hyundai", "i20", "80", "34 GH 123", "1" , "1"));
        register.aracKatalog.put(new Arac("2", "Toyota", "Corolla", "120", "17 CH 784", "1", "1"));
        
        register.servisKatalog.put(new Servis("1", "Canakkale Renault Servisi"));
        register.servisKatalog.put(new Servis("2", "Mais Otomativ"));
        register.servisKatalog.put(new Servis("3", "Kaportaci Recep Usta"));
        
        
        register.aracKiralamaKatalog.put(
                new AracKiralama(
                        "1", 
                        register.musteriKatalog.get("serdar"), 
                        register.personelKatalog.get("3"), 
                        register.aracKatalog.get("2"), 
                        register.subeKatalog.get("1"), 
                        register.subeKatalog.get("1"),
                        "20.05.2016", 
                        "25.05.2016", 
                        "300", 
                        true
                ));
        
        //register.aracKiralamaBaslat(null);
        //for (Arac arac : register.uygunAraclariListele("21.05.2016", "23.05.2016", register.subeKatalog.get("1"), register.subeKatalog.get("1"))) {
        //    System.out.println(arac.getMarka() + " " + arac.getModel());
        //}
        new AnaEkran().setVisible(true);
    }
}
