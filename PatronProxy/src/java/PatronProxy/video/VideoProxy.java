/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronProxy.video;


/**
 *
 * @author jojstepersan
 */
public class VideoProxy implements Video {

    VideoReal videoReal = null;   

    public VideoProxy() {
    }   
    
    @Override
    public String obtenerRutaVideo(String gif){
        if (videoReal == null) {
            videoReal = new VideoReal();
        }
        return videoReal.obtenerRutaVideo(gif);
    }
        
}
