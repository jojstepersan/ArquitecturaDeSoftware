
<%@ include file="/taglibs.jsp"%>
<%@page import="PatronProxy.video.Video"%>
<%@page import="java.util.ArrayList"%>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>

<%@page import="PatronProxy.video.VideoProxy" %>
<jsp:useBean id="usuario" class="PatronProxy.video.Usuario"/>


<fmt:setLocale value="es_CO" scope="application" />
<jsp:useBean id="now" class="java.util.Date" />

<!DOCTYPE html>
<html>
    <head>
        <style>
            h1{color:aquamarine}
            h2{color: linen}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patron Proxy</title>
    
    <h1> Patron Proxy </h1>
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="media/js/jquery-3.2.1.min.js"></script>

        <link rel="stylesheet" href="media/css/estilos.css">
    </head>
    <body>
        <%--
        <div id="contenedor" >
            <ul class="galeria">
                <c:forEach var="lista" items="${usuario.videos}">
                    <li class="galeria__item">
                        <video id="${lista}" width="300"  loop="" class="galeria__img" autoplay="">
                            <source src="media/videos/${lista}" type="video/mp4"/>
                        </video>
                    </li>
                </c:forEach>
            </ul>         
        </div>      
        --%>

        <ul class="galeria">
            <li class="galeria__item">
                <video id="gif1" class="galeria__img" width="300" onmouseover="Play(id)" onmouseout="Pause(id)">
                    <source src="media/videos/gif/gif1.mp4" type="video/mp4"/>
                </video>  />
            </li>
            <li class="galeria__item">
                <video src="media/videos/gif/gif2.mp4" class="galeria__img" id="gif2" width="300" onmouseover="Play(id)" onmouseout="Pause(id)"/>
            </li>
            <li class="galeria__item">
                <video src="media/videos/gif/gif3.mp4" class="galeria__img" id="gif3" width="300" onmouseover="Play(id)" onmouseout="Pause(id)"/>
            </li>
        </ul>

        <input type="hidden"  name="url_video" value=""/>

        <script type="text/javascript">

            /*function Cambiar() {
                document.location.href = "patience.jsp";
            }*/
            function Pause(v) {
                var video = document.getElementById(v);
                video.pause();
            }
            function Play(v) {
                var video = document.getElementById(v);
                if (video.paused) {
                    video.play();
                }
            }
            function alerta() {
            <%
                String ruta = (String) request.getAttribute("gif1");
            %>
                alerta(<%=ruta%>);
            }
        </script>


        <script type="text/javascript">
            $(".galeria__img").click(function (event) {

                var idVideo = event.target.id;

                $.ajax({
                    cache: false,
                    contentType: 'application/x-www-form-urlencoded; charset=iso-8859-1;',
                    type: 'post',
                    url: "${ctx}/page/proxy?action=obtenerUrlVideo&idVideo=" + idVideo,
                    dataType: "text",
                    error: function (jqXHR, textStatus, errorThrown) {
                        alert(jqXHR.statusText);
                    },
                    success: function (data) {
                        var modal = '<div class="modal" id="modal"><video src="' + data + '" class="modal__img" controls=""/><div class="modal__boton" id="modalBoton">X</div></div>';
                        $('body').append(modal);

                        $('#modalBoton').click(function () {
                            $('#modal').remove();
                        })
                    }
                });
            })



        </script> 


    </body>
</html>
