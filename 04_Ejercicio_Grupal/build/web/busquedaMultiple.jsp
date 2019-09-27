<%-- 
    Document   : resultados_busq
    Created on : 26-sep-2019, 15:55:55
    Author     : alumno
--%>

<%@page import="java.util.List"%>
<%@page import="com.sinensia.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo MVC con JSP y Servlet</title>
    </head>
    <body>
        <h1>Ejemplo MVC con JSP y Servlet</h1>
        <% List<Persona> personas = (List<Persona>) session.getAttribute("resultadoBusqMultiple"); %>
        <% if (personas.isEmpty()) {%>
            <span style="color: red">
                No se han encontrado personas
            </span>        
        <% } else { 
                int i=0;%>
        <h2>Lista Personas</h2>      
           
            
        <table border='1' width="50%" align="center">
            <tr>
                <th></th>
                <th>Nombre</th>
                <th>Edad</th>
                <th>Correo</th>
            </tr>
            <%for(Persona pers:personas){%> 
            <tr>
                <td align="center">Usuario <%=i++%></td>
                <td align="center"><%= pers.getNombre()%></td>
                <td align="center"><%= pers.getEdad()%></td>
                <td align="center"><%=pers.getCorreo()%></td>
            </tr>
            <%}%>
        </table>
        <%}%>
    </body>
</html>
