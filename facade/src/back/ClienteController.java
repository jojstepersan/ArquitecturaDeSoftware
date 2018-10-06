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
import back.ventas.Oportunidad;
import back.ventas.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jojstepersan
 */
public class ClienteController {

    private final List<PQR> pqrList;
    private final List<Venta> ventas;
    private final List<Oportunidad> oportunidades;
    private Cliente cliente;

    public ClienteController(Cliente cliente) {
        pqrList = new ArrayList<>();
        ventas = new ArrayList<>();
        oportunidades = new ArrayList<>();
        this.cliente = cliente;
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

    public Venta crearVenta(int valorVenta, String numeroVenta) {
        Venta venta = new Venta(valorVenta, numeroVenta);
        ventas.add(venta);
        return venta;
    }

    public void crearOportunidad(String oportunidad, int valorVenta, String numeroVenta) {
        oportunidades.add(new Oportunidad(crearVenta(valorVenta, numeroVenta), oportunidad));
    }

    public void verHistoriaCredito() {
        System.out.printf("%d - %s:\n", cliente.getNumeroCliente(), cliente.getNombreCliente());
        ventas.forEach(venta -> System.out.println(venta.getNumeroVenta() + " " + venta.getValorVenta()));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
