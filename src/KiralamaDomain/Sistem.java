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

public class Sistem {

    private PersonelKatalog personelKatalog = new PersonelKatalog();
    private AracKatalog aracKatalog = new AracKatalog();
    private MusteriKatalog musteriKatalog = new MusteriKatalog();
    private SubeKatalog subeKatalog = new SubeKatalog();
    private AracKiralamaKatalog aracKiralamaKatalog = new AracKiralamaKatalog();
    private AracSahibiKatalog aracSahibiKatalog = new AracSahibiKatalog();
    private ServisKatalog servisKatalog = new ServisKatalog();
    
    public Register register = new Register(aracKatalog, personelKatalog, musteriKatalog, subeKatalog, aracKiralamaKatalog, aracSahibiKatalog, servisKatalog);

}
