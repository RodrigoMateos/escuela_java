<%-- 
    Document   : register
    Created on : 01-oct-2019, 15:59:21
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register (Create)</title>
    </head>
    <body>
        <h1>Register (Create)</h1>
        <form name="form1" action="users.do" method="post">
            <label for="email">Email: </label>
            <input id="email" name="email" type="email"
                   size="50" maxlength="250" required="required"/><br/>
            <label for="password">Password: </label>
            <input id="password" name="password" type="password" 
                   size="50" maxlength="50" required="required"/><br/>
            <label for="name">Name: </label>
            <input id="name" name="name" type="text"
                   size="50" maxlength="50" required="required"/><br/>
            <label for="age">Age: </label>
            <input id="age" name="age" type="number"
                   size="10" maxlength="3" required="required" min="1" max="199"/><br/>            
            
            <input type="submit" value="Refister"/>
        </form>
    </body>
</html>
