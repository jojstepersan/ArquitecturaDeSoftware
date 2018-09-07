/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.implementacion.datos;

import patronbridge.implementacion.Servicio;

/**
 *
 * @author SBUILDERS
 */
public abstract class Datos implements Servicio {

    private int precio;

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

}
