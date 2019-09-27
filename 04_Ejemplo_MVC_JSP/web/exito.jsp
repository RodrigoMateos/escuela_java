<%-- 
    Document   : exito
    Created on : 26-sep-2019, 13:40:24
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro guardado</title>
    </head>
    <body>
        <h1>Registro guardado</h1>
        <label for="nombre">Nombre: </label>
        <input readonly="readonly" value="<%= request.getParameter("nombre")%>"/><br/>
               
        <label for="nombre">Edad: </label>
        <input readonly="readonly" value="<%= request.getParameter("edad")%>"/>
    </body>
</html>
