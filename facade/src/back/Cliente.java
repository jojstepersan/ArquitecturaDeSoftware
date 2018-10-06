/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

/**
 *
 * @author jojstepersan
 */
public class Cliente {

    private String nombreCliente;
    private int numeroCliente;

    public Cliente(String nombreCliente, int numeroCliente) {
        this.nombreCliente = nombreCliente;
        this.numeroCliente = numeroCliente;
    }

    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

}
