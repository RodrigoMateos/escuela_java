<%-- 
    Document   : exito
    Created on : 26-sep-2019, 13:40:39
    Author     : alumno
--%>

<%@page import="com.sinensia.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exito - Registro guardado</title>
    </head>
    <body>
        <h1>Exito - Registro guardado</h1>
        <% Persona pers = (Persona) session.getAttribute("resultadoBusq"); %>
        <% if (pers != null) { %>
        <form name='form1' method='post' action='./personas.do'>            
            <label for="nombre">Nombre: </label>
            <input type='text' readonly="readonly" name='nombre' id="nombre" value="<%= pers.getNombre() %>"/>
            <label for="edad">Edad </label>
            <input type='number' readonly="readonly" name='edad' id="edad" value="<%= pers.getEdad()%>"/>
            <label for="correo">Usuario </label>
            <input type='email' readonly="readonly" name='correo' id="correo" value="<%=pers.getCorreo()%>"/>
            <label for="pass">Contraseña </label>
            <input type='password' readonly="readonly" name='pass' id="pass" value="<%= pers.getPassword()%>"/>
            <a href="index.jsp">Inicio</a>
        </form>
        <% } else { %>            
                <span style="color: red">
                    No se han encontrado personas
                </span>
        <% } %>
    </body>
</html>
