<%-- 
    Document   : listUsers
    Created on : 01-oct-2019, 16:47:49
    Author     : alumno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="sinensia.modelo.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vista JSTL Operaciones CRUD</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Vista JSTL Operaciones CRUD</h1>
        <ul>
            <li><a href="register.jsp">Formulario</a></li>
            <li><a href="users.do">Lista de usuarios</a></li> <!-- Invocamos al controlador -->
        </ul>
        <form id="formLogin" action="users.do" method="get">
            Email: <input id="email" name="email" type="email" value="${cookie.email.value}"/>
            Password: <input id="password" name="password" type="password" value=""/>
            <input name="method" type="submit" value="Login"/>

        </form>
    </body>
</html>
