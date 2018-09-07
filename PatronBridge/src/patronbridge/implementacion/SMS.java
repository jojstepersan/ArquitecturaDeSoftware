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
public class SMS implements Servicio {

    private int precio;

    @Override
    public void prestarServicio() {
        System.out.println("Prestara servioc de Mensajeria por valor: "+precio);
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

}
