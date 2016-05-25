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
class AracEkleme {
        private Arac arac;
        private AracSahibi aracSahibi;
 
    public AracEkleme() {

    }

    public AracEkleme(AracSahibi aracSahibi) {
        this.aracSahibi = aracSahibi;
    }

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }

    public AracSahibi getAracSahibi() {
        return aracSahibi;
    }

    public void setAracSahibi(AracSahibi aracSahibi) {
        this.aracSahibi = aracSahibi;
    }
    
}
