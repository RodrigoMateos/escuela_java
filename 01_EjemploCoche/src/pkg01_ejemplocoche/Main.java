/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejemplocoche;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Empezando POO");
        Coche miCoche = new Coche("Kia", TipoCarburante.DIESEL, TipoColor.AZUL); // La instanciacion se hace con new
        
        Coche coche = new Coche("Opel", TipoCarburante.GASOLINA, "Blanco");
        
        miCoche.echarCarburante(30); // Empezamos con medio deposito
        
        System.out.println("Todos los coches tienen: " + Coche.CAPACIDAD_DEPOSITO);
        System.out.println("Coche creado: " + miCoche.getMarca());
        System.out.println("Nivel deposito: " + miCoche.getNivelDep() + " litros");
        System.out.println("Color: "+miCoche.getColor());
        
        
        System.out.println("Todos los coches tienen: " + Coche.CAPACIDAD_DEPOSITO);
        System.out.println("Coche creado: " + coche.getMarca());
        System.out.println("Carburante: "+coche.getCarburante());
        System.out.println("Color: "+coche.getColor());
         System.out.println(coche.toString());
        
        Coche otroCoche = miCoche; // new Coche();
        // otroCoche.marca = "Seat"; YA NO SE PUEDE
        System.out.println("Coche creado: " + otroCoche.getMarca());
        // vaciarDeposito(miCoche);
        miCoche.vaciarDeposito();
        System.out.println("Nivel deposito: " + otroCoche.getNivelDep() + " litros");
        
        miCoche.setArrancado(true);
        miCoche.echarCarburante(-2);
        for (int i = 0; i < 3; i++) 
            miCoche.acelerar();
        
        miCoche.mostrar();
    }    
}
