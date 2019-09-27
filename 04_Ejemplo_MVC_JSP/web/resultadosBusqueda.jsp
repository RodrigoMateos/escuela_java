<%-- 
    Document   : resultadosBusqueda
    Created on : 26-sep-2019, 15:55:58
    Author     : alumno
--%>

<%@page import="com.sinesia.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario buscado</title>
    </head>
    <body>
        <h2>Usuario buscado</h2>
        <%Persona p=(Persona)session.getAttribute("resultadoBusq");
        if(p != null){%>
        <label for="nombre">Nombre: </label>
        <input readonly="readonly"  value="<%=p.getNombre()%>"/><br/>
               
        <label for="nombre">Edad: </label>
        <input readonly="readonly"                
               value="<%=p.getEdad()
               %>"/><br/>
        <%} else{%>
            Error: <span style="color:red;">
                No se han encontrado personas
            </span>
        <%}%>
    </body>
</html>
