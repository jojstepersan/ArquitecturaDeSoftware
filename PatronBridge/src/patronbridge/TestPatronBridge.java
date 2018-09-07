/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import patronbridge.abstraccion.Plan;
import patronbridge.abstraccion.PlanBasico;
import patronbridge.abstraccion.PlanPlus;
import patronbridge.implementacion.datos.FacebookDatos;
import patronbridge.implementacion.SMS;
import patronbridge.implementacion.Servicio;
import patronbridge.implementacion.Telefonia;
import patronbridge.implementacion.datos.WhatsappDatos;

/**
 *
 * @author SBUILDERS
 */
public class TestPatronBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        //servicios
        Servicio facebook = new FacebookDatos();
        Servicio whatsapp = new WhatsappDatos();
        Servicio telefonio = new Telefonia();
        Servicio sms = new SMS();
        facebook.setPrecio(5000);
        whatsapp.setPrecio(3000);
        telefonio.setPrecio(1000);
        sms.setPrecio(500);
        //plan basico
        Plan planBasico = new PlanBasico(new ArrayList<>());
        planBasico.setNombrePlan("Plan basico para primeros clientes");
        planBasico.addServicio(telefonio);
        planBasico.addServicio(whatsapp);
        
        planBasico.mostrarListaServicios();
        planBasico.facturar();
        System.out.println("------------------------------------------------------------------------------------------");
        //plan plus
        Plan planPlus=new PlanPlus(new ArrayList<>());
        planPlus.setNombrePlan("Plan Plus para clientes antiguos");
        planPlus.addServicio(telefonio);
        planPlus.addServicio(facebook);
        planPlus.addServicio(sms);
        planPlus.addServicio(whatsapp);
        
        planPlus.mostrarListaServicios();
        planPlus.facturar();
    }
    
}
