package KiralamaDomain;

public class Arac {

    private String aracID;
    private String marka;
    private String model;
    private String kiraBedeli;
    private String plaka;
    private String subeID;
    private String aracSahibiID;
    private boolean servisteMi;

    public boolean isServisteMi() {
        return servisteMi;
    }

    public void setServisteMi(boolean servisteMi) {
        this.servisteMi = servisteMi;
    }

    public Arac(String aracID, String marka, String model, String kiraBedeli, String plaka, String subeID, String aracSahibiID) {
        this.aracID = aracID;
        this.marka = marka;
        this.model = model;
        this.kiraBedeli = kiraBedeli;
        this.plaka = plaka;
        this.subeID = subeID;
        this.aracSahibiID = aracSahibiID;
        this.servisteMi = false;
    }

    public String getAracSahibiID() {
        return aracSahibiID;
    }

    public void setAracSahibiID(String aracSahibiID) {
        this.aracSahibiID = aracSahibiID;
    }

    public String getSubeID() {
        return subeID;
    }

    public void setSubeID(String subeID) {
        this.subeID = subeID;
    }

    
    public String getAracID() {
        return aracID;
    }

    public void setAracID(String aracID) {
        this.aracID = aracID;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKiraBedeli() {
        return kiraBedeli;
    }

    public void setKiraBedeli(String kiraBedeli) {
        this.kiraBedeli = kiraBedeli;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" + "aracID=" + aracID + ", marka=" + marka + ", model=" + model + ", kiraBedeli=" + kiraBedeli + ", plaka=" + plaka + ", subeID=" + subeID + '}';
    }

}
