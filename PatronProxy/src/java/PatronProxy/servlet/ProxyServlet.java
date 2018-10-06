/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronProxy.servlet;

import PatronProxy.video.Video;
import PatronProxy.video.VideoProxy;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jojstepersan
 */
@WebServlet(name="LoginServlet" , urlPatterns = {"/page/proxy"})
public class ProxyServlet extends HttpServlet {

   
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doPost(request,response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            {
        try{
            String action = request.getParameter("action");
            String idVideo = request.getParameter("idVideo");

            System.out.println("action="+action);
            System.out.println("idVideo="+idVideo);

            String url = null;

            if(action.equals("obtenerUrlVideo")){
                Video proxy = new VideoProxy();
                url = proxy.obtenerRutaVideo(idVideo);
            }

            response.setContentType("text/plain");
            PrintWriter salida = response.getWriter();

            salida.println(url);
            salida.close();
        }catch(Exception e){
            
        }
    }

   
   

}
