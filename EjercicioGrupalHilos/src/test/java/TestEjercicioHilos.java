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
import java.util.Date;
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

        long tInicial, t1, t2, t3,t4, tTotal;

        tInicial = new Date().getTime();
        
        pr1.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
        t1 = (new Date().getTime() - tInicial);
        System.out.println("El tiempo de pr1 : " + t1);

        pr2.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
        t2 = (new Date().getTime() - tInicial);
        System.out.println("El tiempo de pr2 : " + t2);
        

        pr3.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
        t3 = (new Date().getTime() - tInicial);
        System.out.println("El tiempo de pr3 : " + t3);
        
        pr4.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
        
        t4 = (new Date().getTime() - tInicial);
        System.out.println("El tiempo de pr4 : " + t4);
        
        
        tTotal= t1 + t2 + t3 + t4;
        System.out.println("-------------------------------------------------------------------------");
        
        
        Thread hilo1 = new Thread() {

            @Override
            public void run() {
                pr1.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");

            }
        };

        Thread hilo2 = new Thread() {
            @Override
            public void run() {
                pr2.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
            }

        };

        Thread hilo3 = new Thread() {
            @Override
            public void run() {
                pr3.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
            }
        };

        Thread hilo4 = new Thread() {
            @Override
            public void run() {
                pr4.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");

            }
        };

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }
}
