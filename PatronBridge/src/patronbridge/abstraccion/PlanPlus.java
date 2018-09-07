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
public class PlanPlus extends Plan {

    public PlanPlus(List<Servicio> servicio) {
        super(servicio);
    }

    @Override
    public int facturar() {
        System.out.print("Facturar Plan Plus con 10% de descuento: ");
        facturar = 0;
        servicios.forEach(s -> facturar += s.getPrecio());
        facturar = (int) (facturar - facturar * .1);
        System.out.println("$" + facturar);
        return facturar;
    }

}
