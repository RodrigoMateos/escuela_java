<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Ejemplo MVC con JSP y Servlet</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>Añadir Persona</h2>
        <form name='form1' method='post' action='./personas.do'>
            <table border='1'>
                <tr>
                    <td>Nombre: </td>
                    <td><input type='text' id='nombre' name='nombre'/></td>
                </tr>
                <tr>
                    <td>Edad: </td>
                    <td><input type='number' id='edad' name='edad'/></td>
                </tr>
            </table>
            <input type='submit' value='Enviar'/>
        </form>    
        <h2>Buscar Persona</h2>
        <form name='buscar' method='get' action='./personas.do'>
            <table border='1'>
                <tr>
                    <td>Nombre: </td>
                    <td><input type='text' id='nombre' name='nombre'/></td>
                </tr>
            </table>
            <input type='submit' value='Enviar'/>
        </form>         
    </body>
</html>
