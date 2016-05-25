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
public class AracSahibi {
    private String aracSahibiID;
    private String aracSahibiName;
    private String aracSahibiSurname;
    private String aracSahibiPassword;

    public AracSahibi(String aracSahibiID, String aracSahibiName, String aracSahibiSurname, String aracSahibiPassword) {
        this.aracSahibiID = aracSahibiID;
        this.aracSahibiName = aracSahibiName;
        this.aracSahibiSurname = aracSahibiSurname;
        this.aracSahibiPassword = aracSahibiPassword;
    }

    public String getAracSahibiID() {
        return aracSahibiID;
    }

    public void setAracSahibiID(String aracSahibiID) {
        this.aracSahibiID = aracSahibiID;
    }

    public String getAracSahibiName() {
        return aracSahibiName;
    }

    public void setAracSahibiName(String aracSahibiName) {
        this.aracSahibiName = aracSahibiName;
    }

    public String getAracSahibiSurname() {
        return aracSahibiSurname;
    }

    public void setAracSahibiSurname(String aracSahibiSurname) {
        this.aracSahibiSurname = aracSahibiSurname;
    }

    public String getAracSahibiPassword() {
        return aracSahibiPassword;
    }

    public void setAracSahibiPassword(String aracSahibiPassword) {
        this.aracSahibiPassword = aracSahibiPassword;
    }

    @Override
    public String toString() {
        return aracSahibiName + " " + aracSahibiSurname;
    }

    
    

}
