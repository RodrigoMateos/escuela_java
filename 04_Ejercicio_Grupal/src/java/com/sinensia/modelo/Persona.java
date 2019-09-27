/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo;

/** Esta clase es un POJO (Plain Old Java Object)
 *  Clases sin lógica, sin herencia (o poco de...)
 * Suelen corresponder a una ENTIDAD
 * @author alumno
 */
public class Persona {
    
    private String nombre, correo, password;
    private int edad;

    public Persona(){}
    
    public Persona(String nombre, int edad, String correo, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo=correo;
        this.password=password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}
