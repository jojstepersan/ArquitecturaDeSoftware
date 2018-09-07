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
public abstract class Plan {

    protected List<Servicio> servicios;
    protected String nombrePlan;
    protected int facturar;
    public Plan(List<Servicio> servicio) {
        this.servicios = servicio;
    }

    public List<Servicio> getServicio() {
        return servicios;
    }

    public void setServicio(List<Servicio> servicio) {
        this.servicios = servicio;
    }

    public void mostrarListaServicios() {
        System.out.printf("Nombre del plan: $s\nLISTA DE SERVICIOS: ", nombrePlan);
        servicios.forEach(s -> System.out.println(s));
    }

    public void addServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public void removeServicio(Servicio servicio) {
        servicios.remove(servicio);
    }
        
    public abstract int facturar();
}
