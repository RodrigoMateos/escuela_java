/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import EjercicioHilos.HiloFicheroV1;
import EjercicioHilos.HiloFicherov2;
import EjercicioHilos.HiloFicherov3;
import EjercicioHilos.HiloFicherov4;
import Threads.HiloFichero;
import EjercicioHilos.HiloFicheroEjer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class FicherosTest {
    
    public FicherosTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /*
    @Test
    public void generacionFicheroAleatorio() {
        HiloCrearFichero.crearFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
    }
    */
    @Test
    public void leerFicheroAleatorio() {
        //HiloFichero.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
          
        HiloFicheroEjer prueba1 = new HiloFicheroV1();
        HiloFicheroEjer prueba2 = new HiloFicherov2();
        HiloFicheroEjer prueba3 = new HiloFicherov3();
        HiloFicheroEjer prueba4 = new HiloFicherov4();

        
        
        prueba4.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
    }
}
