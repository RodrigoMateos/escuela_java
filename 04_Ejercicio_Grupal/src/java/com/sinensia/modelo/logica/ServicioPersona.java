/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Singleton porque sólo queremos un servicio por aplicación/servidor
 *
 * @author alumno
 */
public class ServicioPersona {

// <editor-fold defaultstate="collapsed" desc="Código patrón de diseño Singleton.">
    private static ServicioPersona instancia;

    private ServicioPersona() {
        personas = new ArrayList<>();
    }

    public static ServicioPersona getInstancia() {
        if (instancia == null) {
            instancia = new ServicioPersona();
        }
        return instancia;
    }// </editor-fold>

    private ArrayList<Persona> personas;

    public Persona addPersonas(String nombre, String edad, String correo, String password)
            throws NumberFormatException, IOException, IllegalArgumentException {

        if (nombre.equals("")) {
            throw new IllegalArgumentException("El nombre es vacío");
        } else if (nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre es demasiado corto");
        } else if (edad.equals("")) {
            throw new NumberFormatException("La edad está vacía");
        } else {
            int intEdad = Integer.parseInt(edad);
            if (intEdad <= 12) {
                throw new IllegalArgumentException("La edad debe ser mayor que 12");
            } else {
                Persona p = new Persona(nombre, intEdad, correo, password);
                personas.add(p);
                return p;
            }
        }
    }

    public Persona getPersona(String nombre) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
    
    public Persona getPersona(String nombre, String email) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre) && p.getCorreo().equalsIgnoreCase(email)) {
                return p;
            }
        }
        return null;
    }

    public Persona modificarPersonas(String nombre, String edad, String correo, String password, String id) {

        Persona p = null;
        int i = 0;
        for (Persona persona : personas) {
            if (persona.getNombre().equals(id)) {
                p = persona;
                break;
            }
            i++;
        }
        if (p != null) {
            p.setNombre(nombre);
            p.setEdad(Integer.parseInt(edad));
            p.setCorreo(correo);
            p.setPassword(password);
            personas.set(i, p);
        }
        return p;
    }
	
    public boolean deletePersonas(String nombre, String edad, String correo, String password)
        throws NumberFormatException, IOException, IllegalArgumentException {
            
        Persona perElim = null;
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                perElim = p;
            }
        }
        if (perElim == null) {
            return false;
        } else {
            personas.remove(perElim);
            return true;
        }
    }

    public List<Persona> damePersonas(String nombre) {
        List<Persona> pers = new ArrayList<>();
        for(Persona p:personas)								
            if(p.getNombre().equalsIgnoreCase(nombre))
                pers.add(p);							 
        return pers;
    }
}
