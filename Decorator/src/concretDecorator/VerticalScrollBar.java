/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretDecorator;

import ventana.Window;

/**
 *
 * @author jojstepersan
 */
public class VerticalScrollBar extends ComponentesDecorator {

    public VerticalScrollBar(Window ventana) {
        this.ventana = ventana;
    }

    @Override
    public String show() {
        return this.ventana.show() + " con VerticalScrollBar";
    }

}
