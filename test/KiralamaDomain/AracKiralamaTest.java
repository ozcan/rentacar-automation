package KiralamaDomain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import KiralamaDomain.Arac;
import KiralamaDomain.AracSahibi;
import KiralamaDomain.Musteri;
import KiralamaDomain.Register;
import KiralamaDomain.Servis;
import KiralamaDomain.Sube;
import static KiralamaUI.Main.register;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozcan
 */
public class AracKiralamaTest {
    private Register register;
    private Musteri musteri;
    private Arac arac;
    private Sube sube;
  
    public AracKiralamaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        PersonelKatalog personelKatalog = new PersonelKatalog();
        AracKatalog aracKatalog = new AracKatalog();
        MusteriKatalog musteriKatalog = new MusteriKatalog();
        SubeKatalog subeKatalog = new SubeKatalog();
        AracKiralamaKatalog aracKiralamaKatalog = new AracKiralamaKatalog();
        AracSahibiKatalog aracSahibiKatalog = new AracSahibiKatalog();
        ServisKatalog servisKatalog = new ServisKatalog();
    
        this.register = new Register(aracKatalog, personelKatalog, musteriKatalog, subeKatalog, aracKiralamaKatalog, aracSahibiKatalog, servisKatalog);
        
        this.sube = new Sube("1", "Canakkale");
        subeKatalog.put(sube);
        this.musteri = new Musteri("serdar", "Serdar", "Basmaci", "123456");
        musteriKatalog.put(this.musteri);
        this.arac = new Arac("1", "Hyundai", "i20", "80", "34 GH 123", "1" , "1");
        aracKatalog.put(this.arac);
    }
    
    
    
    
    @After
    public void tearDown() {
    }

    /**
     * Test of aracKiralamaBaslat method, of class Register.
     */
    @Test
    public void testAracKiralama() {
        System.out.println("Arac kiralama testi");
        this.register.aracKiralamaBaslat();
        
        System.out.println("Musteri secililiyor.");
        this.register.musteriSec(musteri);
        
        System.out.println("Tarih ve sube seciliyor.");
        ArrayList<Arac> araclar = this.register.tarihVeSubeSec("22.10.2010", "25.10.2010",this.sube, this.sube);
        
        System.out.println("Donen arac kontrol ediliyor.");
        assertEquals(araclar.size(), 1);
        assertEquals(araclar.get(0), this.arac);
        
        System.out.println("Arac seciliyor. ");
        String ucret = this.register.aracSec(this.arac.getAracID());
        System.out.println("Ucret kontrol ediliyor. ");
        assertEquals(ucret, "240");
        
        System.out.println("Ucret odeniyor. ");
        Boolean cevap = register.odemeYap("2200111","11", "2020", "555"); 
        assertEquals(cevap, true);
        
        System.out.println("Kiralama islemi tamamlaniyor. ");
        this.register.aracKiralamaBitir();
        
        assertEquals(this.register.aracKiralamaKatalog.getAracKiralamaler().size(), 1);
        System.out.println("Arac kiralama islemi basarili. ");
    }
}