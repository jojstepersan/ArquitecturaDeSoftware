/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back.ventas;

/**
 *
 * @author jojstepersan
 */
public class Oportunidad {

    private Venta venta;
    
    private String oportunidad;

    public Oportunidad(Venta venta, String oportunidad) {
        this.venta = venta;
        this.oportunidad = oportunidad;
    }


    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public String getOportunidad() {
        return oportunidad;
    }

    public void setOportunidad(String oportunidad) {
        this.oportunidad = oportunidad;
    }

    
    
}
