/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronProxy.video;

import java.util.HashMap;

/**
 *
 * @author jojstepersan
 */
public class VideoReal implements Video{
    
    HashMap<String,String> rutaVideo = new HashMap<String,String>();

    public VideoReal() {
        rutaVideo.put("gif1", "media/videos/vid/vid1.mp4");
        rutaVideo.put("gif2", "media/videos/vid/vid2.mp4");
        rutaVideo.put("gif3", "media/videos/vid/vid3.mp4");
    }    
    
    @Override
    public String obtenerRutaVideo(String gif) {
        return rutaVideo.get(gif);
    }
    
    
    
}
