/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.implementacion;

/**
 *
 * @author SBUILDERS
 */
public interface Servicio {

    void prestarServicio();
    
    void setPrecio(int precio);
    
    int getPrecio();
}
