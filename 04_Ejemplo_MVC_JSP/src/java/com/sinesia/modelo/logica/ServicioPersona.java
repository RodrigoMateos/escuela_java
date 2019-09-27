package com.sinesia.modelo.logica;

import com.sinesia.modelo.Persona;
import java.io.IOError;
import java.util.ArrayList;
import java.util.List;

/**
 * Sinleton porque solo vamos a tener un servicio para todas las personas
 * @author alumno
 */
public class ServicioPersona {
    // <editor-fold defaultstate="collapsed" desc="Codigo de generacion de singleton">
    //Codigo Singleton
    private static ServicioPersona instancia;
    
    private ServicioPersona() {
        personas= new ArrayList<>();
    }
    
    public static ServicioPersona getInstancia(){
        if(instancia==null)
            instancia= new ServicioPersona();
        return instancia;
    }// </editor-fold>
    
    private List<Persona> personas;
    
    public Persona addPersonas(String nombre, String edad) throws NumberFormatException, IOError, IllegalArgumentException{
        if(nombre.equals(""))
            throw new IllegalArgumentException("El nombre es vacio");
        else if(nombre.length()<2)
            throw new IllegalArgumentException("El nombre es demasiado corto");
        else if(edad == null || edad.equals(""))
            throw new NumberFormatException("La edad esta vacia");
        else {
            int intEdad=  Integer.parseInt(edad);
            if (intEdad > 12) {
                Persona p = new Persona(nombre, intEdad);
                personas.add(p);
                return p;
            } else
                throw new IllegalArgumentException("Los menores de 12 años no se pueden registrar");
        }
    }
    
    public Persona getPersona(String nombre){
        for(Persona p : personas)
            if(p.getNombre().equalsIgnoreCase(nombre))
                return p;
        return null;
    }
}
