/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinesia.controladores;

import com.sinesia.modelo.Persona;
import com.sinesia.modelo.logica.ServicioPersona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
public class ControladorPersonasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        //String edad = request.getParameter("edad");

        Persona p = ServicioPersona.getInstancia().getPersona(nombre);
        
        request.getSession().setAttribute("resultadoBusq", p);
        request.getRequestDispatcher("resultadosBusqueda.jsp").forward(request, response);
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
           
        
        try {
            
            Persona p = ServicioPersona.getInstancia().addPersonas(nombre,edad);  
            if (p == null) {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("exito.jsp").forward(request, response);
            }
        } catch (NumberFormatException ex) {
            request.getSession().setAttribute("mensajeError", ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (IllegalArgumentException ex) {
            request.getSession().setAttribute("mensajeError", ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (IOException ex) {
            request.getSession().setAttribute("mensajeError", ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
