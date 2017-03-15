<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CLIENTE JSP</title>
    </head>
    <body>
        <h1>Cliente Figuras!</h1>
              
        
        <form method="POST" action="index.jsp">
            
            <input type="text" name="cajaRadio" value="" />
            <input type="submit" value="Calcular" />
            
        </form>
        
        
            <%-- start web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
   <%
    try {
    figuras.FigurasGeo_Service service = new figuras.FigurasGeo_Service();
    figuras.FigurasGeo port = service.getFigurasGeoPort();
     // TODO initialize WS operation arguments here
    java.lang.Double radio = Double.valueOf(request.getParameter("cajaRadio"));
    // TODO process result here
    java.lang.Double result = port.volumen(radio);
        if(radio<=0)
        {
        out.println("El radio no puede ser menor o igual que 0");
       
        
        }else{
         out.println("El volumen de la esfera es..."+result);
        
        }
               
    //out.println("Result = "+result);
    } catch (Exception ex) {
    // TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        b service invocation --%><hr/>

    </body>
</html>
