<%-- 
    Document   : error
    Created on : 26-sep-2019, 13:43:12
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro erroneo</title>
    </head>
    <body>
        <h1>Registro erroneo</h1>
        Error: <span style="color:red;">
            <%= session.getAttribute("mensajeError") %>
        </span>
    </body>
</html>
