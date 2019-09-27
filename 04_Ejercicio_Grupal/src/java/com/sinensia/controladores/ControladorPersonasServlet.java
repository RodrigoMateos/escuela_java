/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.controladores;

import com.sinensia.modelo.Persona;
import com.sinensia.modelo.logica.ServicioPersona;
import java.io.IOException;
import java.util.List;
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre"); // name del INPUT
        String correo = request.getParameter("correo"); 
        String metodo = request.getParameter("metodo"); 
        if(metodo.equalsIgnoreCase("multiple")){
            List<Persona> personas = ServicioPersona.getInstancia().damePersonas(nombre);
            request.getSession().setAttribute("resultadoBusqMultiple", personas);
            request.getRequestDispatcher("busquedaMultiple.jsp").forward(request, response);              
        }else{
            Persona p = ServicioPersona.getInstancia().getPersona(nombre, correo);         
            request.getSession().setAttribute("resultadoBusq", p);
            request.getRequestDispatcher("resultados_busq.jsp").forward(request, response);
        }   
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // request.getSession().setMaxInactiveInterval(60);
        String nombre = request.getParameter("nombre"); // name del INPUT
        String edad = request.getParameter("edad"); 
        String correo = request.getParameter("correo"); 
        String password = request.getParameter("pass"); 
        String persona = request.getParameter("persona");
                
        String btnEliminar = request.getParameter("boton");
        boolean eliminarPers;
        try {
            Persona p = new Persona();

            if( persona.equals(""))
                p = ServicioPersona.getInstancia().addPersonas(nombre, edad, correo, password);																			
            else{
                if (btnEliminar.equalsIgnoreCase("eliminar")) {
                    eliminarPers = ServicioPersona.getInstancia().deletePersonas(nombre, edad, correo, password);
                    request.getRequestDispatcher("usuarioEliminado.jsp").forward(request, response);
                } else {
                    p = ServicioPersona.getInstancia().modificarPersonas(nombre, edad, correo, password, persona);
                    request.getRequestDispatcher("exito.jsp").forward(request, response);
                }
            }
            request.getSession().setAttribute("resultadoBusq",p);            

            if (p == null) {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            } else {
                 request.getRequestDispatcher("exito.jsp").forward(request, response);          
            }
		  
        } catch (NumberFormatException ex) {
            request.getSession().setAttribute("mensajeError", "Error numérico: " + ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (IllegalArgumentException ex) {
            request.getSession().setAttribute("mensajeError", "Error en campos: " + ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);            
        } catch (Exception ex) {
            request.getSession().setAttribute("mensajeError", "Error genérico: " + ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);            
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
