<%-- 
    Document   : listUsers
    Created on : 01-oct-2019, 16:47:49
    Author     : alumno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="sinensia.modelo.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="userList" type="java.util.ArrayList<User>" scope="request"> <!-- request le indica cuanto va a durar la etiqueta -->
    <jsp:getProperty property="*" name="usersList"></jsp:getProperty>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>
        <%-- Corresponde a EL (Expresion Language) de JSTL 
            El bucle es un for chetao
        --%>

        <c:forEach items="${userList}" var="user"> <!-- El nombre del Bean -->
            <form action="users.do" method="post">
                <table>
                    <tr>
                        <td><input id="id" name="id" type="number" readonly="readonly" size="4" value="${user.id}"/></td>
                        <td><input id="email" name="email" type="text" value="${user.email}"/></td>
                        <td><input id="password" name="password" type="text" value="${user.password}"/></td>
                        <td><input id="name" name="name" type="text" value="${user.name}"/></td>
                        <td><input id="age" name="age" type="number" size="4" value="${user.age}"/></td>
                        <td><input name="method" type="submit" value="delete"/></td>
                        <td><input name="method" type="submit" value="modificar"/></td>
                    </tr>  
                </table>
            </form>
        </c:forEach>
    </body>
</html>
