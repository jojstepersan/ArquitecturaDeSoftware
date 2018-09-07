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
public class PlanBasico extends Plan {

    public PlanBasico(List<Servicio> servicio) {
        super(servicio);
    }

    @Override
    public int facturar() {
        System.out.print("facturar plan basico: ");
        facturar = 0;
        servicios.forEach(s -> facturar += s.getPrecio());
        System.out.println("$" + facturar);
        return facturar;
    }

}
