package pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import EjercicioHilos.HiloFicheroEjer;
import EjercicioHilos.HiloFicheroV1;
import EjercicioHilos.HiloFicherov2;
import EjercicioHilos.HiloFicherov3;
import EjercicioHilos.HiloFicherov4;
import Threads.HiloFichero;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestEjercicioHilos {
    
    public TestEjercicioHilos() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
   public void probarEjercicio() {
       
       HiloFicheroEjer pr1 = new HiloFicheroV1();
       HiloFicheroEjer pr2 = new HiloFicherov2();
       HiloFicheroEjer pr3 = new HiloFicherov3();
       HiloFicheroEjer pr4 = new HiloFicherov4();
       
       //pr1.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
       //pr2.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
       //pr3.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
       pr4.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
       
   }
}
