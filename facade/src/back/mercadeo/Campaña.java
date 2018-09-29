/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back.mercadeo;

/**
 *
 * @author jojstepersan
 */
public class Campaña {

    private String nombreCampaña;
    private String tipoCampaña;

    public Campaña(String nombreCampaña, String tipoCampaña) {
        this.nombreCampaña = nombreCampaña;
        this.tipoCampaña = tipoCampaña;
    }

    public String getNombreCampaña() {
        return nombreCampaña;
    }

    public void setNombreCampaña(String nombreCampaña) {
        this.nombreCampaña = nombreCampaña;
    }

    public String getTipoCampaña() {
        return tipoCampaña;
    }

    public void setTipoCampaña(String tipoCampaña) {
        this.tipoCampaña = tipoCampaña;
    }

}
