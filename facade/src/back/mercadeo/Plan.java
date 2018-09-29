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
public class Plan {

    private String nombrePlan;
    private String servicio;

    public Plan(String nombrePlan, String servicio) {
        this.nombrePlan = nombrePlan;
        this.servicio = servicio;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

}
