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
public class Venta {
    
    private int valorVenta;
    private String numeroVenta;

    public Venta(int valorVenta, String numeroVenta) {
        this.valorVenta = valorVenta;
        this.numeroVenta = numeroVenta;
    }

    
    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
    
    
}
