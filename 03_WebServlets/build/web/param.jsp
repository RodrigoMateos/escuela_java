<%@include file="head.jsp" %>
<html>
    <%=head("Inicio")%>
    <body>
        <%@include file="header.jsp" %>
        <h1>Datos</h1>
        <!--
        <p>Te llamas <%out.println(request.getParameter("nombre"));%></p>
        <p>Tienes <%out.println(request.getParameter("edad"));%> años</p>
        <p>Tu usuario es <%out.println(request.getParameter("user"));%></p>
        <p>Tu contraseña es <%out.println(request.getParameter("pass"));%></p>
        -->
        <ul>
        <%  for (int i = 0; i < 10; i++) { %>
        
            <li class="tipo-letra-tam-<%= i %>">Numero  <% out.println( "" + i ); %>  </li>
            
        <% } %>
        </ul>
        
    </body>
</html>
