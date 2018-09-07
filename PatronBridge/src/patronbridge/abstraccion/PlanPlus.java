/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.abstraccion;

import java.util.List;
import patronbridge.implementacion.Servicio;

/**
 *
 * @author SBUILDERS
 */
public class PlanPlus extends Plan{
    
    public PlanPlus(List<Servicio> servicio) {
        super(servicio);
    }

      @Override
    public int facturar() {
        System.out.println("Facturar Plan Plus");
        facturar = 0;
        servicios.forEach(s -> facturar += s.getPrecio());
        return facturar;
    }
    
}
