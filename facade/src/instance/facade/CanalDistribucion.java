/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instance.facade;

import back.Cliente;
import back.ClienteController;
import back.facade.ClienteFacade;

/**
 *
 * @author jojstepersan
 */
public class CanalDistribucion {
    
    public static void main(String[] args) {
        Cliente cliente=new Cliente("Jojstepernsa", 123456);
        ClienteController clienteController=new ClienteController(cliente);
        ClienteFacade clienteFacade=new ClienteFacade(clienteController);
        clienteFacade.crearOportunidad("compra de articulos importados de china", 100000000, "erda76a");
        clienteFacade.crearOportunidad("compra de articulos importados de USA", 132320000, "45s23432");
        clienteFacade.verHistoriaCredito();
    }
    
}
