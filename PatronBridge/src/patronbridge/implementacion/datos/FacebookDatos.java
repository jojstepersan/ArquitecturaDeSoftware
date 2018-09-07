/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.implementacion.datos;

import patronbridge.implementacion.datos.Datos;

/**
 *
 * @author SBUILDERS
 */
public class FacebookDatos extends Datos {

    @Override
    public void prestarServicio() {
        System.out.println("Prestar servicio de datos Facebook por valor: " + getPrecio());
    }

}
