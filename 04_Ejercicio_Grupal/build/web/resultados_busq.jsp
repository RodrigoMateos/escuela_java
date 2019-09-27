<%-- 
    Document   : resultados_busq
    Created on : 26-sep-2019, 15:55:55
    Author     : alumno
--%>

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
        <h2>Usuario</h2>
        <% Persona pers = (Persona) session.getAttribute("resultadoBusq"); %>
        <% if (pers != null) { %>
        <h2>BUSCAR Y MODIFICAR</h2>
        <form name='form1' method='post' action='./personas.do'>            
            <label for="nombre">Nombre: </label>
            <input type='text' name='nombre' id="nombre" value="<%= pers.getNombre() %>"/>
            <label for="edad">Edad </label>
            <input type='number' name='edad' id="edad" value="<%= pers.getEdad()%>"/>
            <label for="correo">Usuario </label>
            <input type='email' name='correo' id="correo" value="<%=pers.getCorreo()%>"/>
            <label for="pass">Contraseña </label>
            <input type='password' name='pass' id="pass" value="<%= pers.getPassword()%>"/>
            <input type='hidden' name='persona' id='persona' value='<%= pers.toString()%>'/>
            <input type='submit' name="boton" value='Modificar'/>
            <input type='submit' name="boton" value='Eliminar'/>	
        </form>
        <% } else { %>            
                <span style="color: red">
                    No se han encontrado personas
                </span>
        <% } %>
    </body>
</html>
