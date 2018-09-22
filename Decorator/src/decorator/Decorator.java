/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import concretDecorator.VerticalScrollBar;
import concretDecorator.HorizontalScrollBar;
import concretDecorator.ButtonsBar;
import ventana.MacWindow;
import ventana.LinuxWindow;
import ventana.WindowsWindow;
import ventana.Window;

/**
 *
 * @author jojstepersan
 */
public class Decorator {

    public static void main(String[] args) {
        
       //decorara la ventana de mac
        Window mac = new MacWindow();
        mac = new HorizontalScrollBar(mac);
        mac = new ButtonsBar(mac);
        mac = new VerticalScrollBar(mac);
        
        System.out.println(mac.show());
    
        //decorar ventana de windows
        Window windows = new WindowsWindow();
        windows = new VerticalScrollBar(windows);
        windows = new ButtonsBar(windows);
        windows = new HorizontalScrollBar(windows);
    
        System.out.println(windows.show());
        
        //decorar la ventana de linux
        Window linux = new LinuxWindow();
        linux = new VerticalScrollBar(linux);
        linux = new HorizontalScrollBar(linux);
        linux = new ButtonsBar(linux);
    
        System.out.println(linux.show());
        
        
    }

}
