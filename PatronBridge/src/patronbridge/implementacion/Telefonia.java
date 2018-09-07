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
public class Telefonia implements Servicio {

    private int precio;
    private long numero;
    private static long consecutivo = 3100000;

    public Telefonia() {
        numero = consecutivo++;
    }

    @Override
    public void prestarServicio() {
        System.out.println("Prestar servicio de telefonia con el numero " + numero + " por el precio de: " + precio);
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

}
