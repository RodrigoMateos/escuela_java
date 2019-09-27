package com.sinesia.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HolaServlet extends HttpServlet{
    
    private String propiedad;
    private static int contador;
    
    public HolaServlet(){
        super();
        contador++;
        propiedad="Valor "+contador;
    }

    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
        
        String ruta = peticion.getContextPath();
        //Indiciamos de que tipo va a ser la respuesta
        respuesta.setContentType("text/html;charset-UTF-8");
        
        //Construir el HTML de respuesta
        try(PrintWriter salida = respuesta.getWriter()){
            salida.println("<html>");
            salida.println("<head><title>HTML creado desde Servlet</title></head>");
            salida.println("<body>");
            salida.println("<h1>HTML creado desde JAVA Servlet "+propiedad+"</h1>");
            salida.println("<p>Ruta: "+ ruta+" </p>");
            salida.println("<ul>");
            for(int i=0;i<5;i++)
                salida.println("<li>Numero: "+i+"</li>");
            salida.println("</ul>");
            salida.println("</body>");
            salida.println("</html>");
        }
    }
    
    
    
}