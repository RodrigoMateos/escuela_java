<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC con JSP y Servlet</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Ejemplo MVC con JSP y Servlet</h1>
        <h2>A�adir persona</h2>
        <form name='form1' method='post' action='./personas.do'>            
            <table border='1'>
                <tr><td>Nombre:</td>  
                    <td><input type='text' name='nombre' id='nombre'/></td></tr>
                <tr><td>Edad:</td>  
                    <td><input type='number' name='edad' id='edad'/></td></tr>
                <tr><td>Correo:</td>  
                    <td><input type='email' name='correo' id='correo'/></td></tr>
                <tr><td>Password:</td>  
                    <td><input type='password' name='pass' id='pass'/></td></tr>       
            <input type='hidden' name='persona' id='persona' value='<%= ""%>'/>
            </table>
            <input type='submit' value='Enviar'/>             
        </form>
        <h2>Buscar persona</h2>
        <form name='formBusq' method='get' action='./personas.do'>            
            <table border='1'>
                <tr><td>Nombre:</td>  
                    <td><input type='text' name='nombre' id='nombre'/></td></tr>
                <tr><td>Correo:</td>  
                    <td><input type='email' name='correo' id='correo'/></td></tr>     
                <input type='hidden' name='metodo' id='persona' value='simple'/>
            </table> 
            <input type='submit' value='Buscar'/>
        </form>
        
        <h2>Buscar varias personas</h2>
        <form name='formBusqVarios' method='get' action='./personas.do'>            
            <table border='1'>
                <tr><td>Nombre:</td>  
                    <td><input type='text' name='nombre' id='nombre'/></td>
                    <td><input type='submit' value='Buscar'/>  </td></tr>    
                    <input type='hidden' name='metodo' id='persona' value='multiple'/>
            </table>                       
        </form>        
    </body>
</html>
