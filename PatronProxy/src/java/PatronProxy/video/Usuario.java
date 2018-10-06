/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronProxy.video;

import java.io.File;

/**
 *
 * @author jojstepersan
 */
public class Usuario {
    
    File read = new File("C:/Users/david/Desktop/arquitectura/Arquitectura de Software/PatronProxy/web/media/videos");
    String[] videos = read.list();
    
    int[] idVideo;
    public Usuario(){
        
    }

    public String[] getVideos() {
        
        return videos;
    }
    
    
}
