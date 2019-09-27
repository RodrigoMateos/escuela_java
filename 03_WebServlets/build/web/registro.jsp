<%@include file="head.jsp" %>
<html>
    <%=head("Inicio")%>
    <body>
        <%@include file="header.jsp" %>
        <div>TODO write content</div>
        <form name='form1' method='post' action='./param.jsp'>
            <table border='1'>
                <tr>
                    <td>Nombre: </td>
                    <td><input type='text' id='nombre' name='nombre'/></td>
                </tr>
                <tr>
                    <td>Edad: </td>
                    <td><input type='number' id='edad' name='edad'/></td>
                </tr>
                <tr>
                    <td>Usuario: </td>
                    <td><input type='text' id='user' name='user'/></td>
                    <td>Contraseña: </td>
                    <td><input type='password' id='pass' name='pass'/></td>
                </tr>
            </table>
            <input type='submit' value='Enviar'/>
        </form>    
    </body>
</html>

