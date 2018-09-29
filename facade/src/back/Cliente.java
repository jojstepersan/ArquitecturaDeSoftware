/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import back.servicios.PQR;
import back.servicios.Peticion;
import back.servicios.Queja;
import back.servicios.Reclamo;
import back.ventas.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jojstepersan
 */
public class Cliente {

    private List<PQR> pqrList;
    private List<Venta> ventas;

    public Cliente() {
        pqrList = new ArrayList<>();
        ventas=new ArrayList<>();
    }

    public void crearPQR(String mesaje, String tipo) {
        switch (tipo) {
            case "P":
                pqrList.add(new Peticion(mesaje));
                break;
            case "Q":
                pqrList.add(new Queja(mesaje));
                break;
            case "R":
                pqrList.add(new Reclamo(mesaje));
                break;
            default:
                System.out.println("este tipo no esta definido");
                break;
        }
    }

    public void crearVenta(int valorVenta,String numeroVenta){
    
    }
}
