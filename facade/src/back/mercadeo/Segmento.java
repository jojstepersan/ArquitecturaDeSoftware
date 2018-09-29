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
public class Segmento {
    private String tipopoblacion;
    private String nombreSegmento;

    public Segmento(String tipopoblacion, String nombreSegmento) {
        this.tipopoblacion = tipopoblacion;
        this.nombreSegmento = nombreSegmento;
    }

    public String getTipopoblacion() {
        return tipopoblacion;
    }

    public void setTipopoblacion(String tipopoblacion) {
        this.tipopoblacion = tipopoblacion;
    }

    public String getNombreSegmento() {
        return nombreSegmento;
    }

    public void setNombreSegmento(String nombreSegmento) {
        this.nombreSegmento = nombreSegmento;
    }
    
}
