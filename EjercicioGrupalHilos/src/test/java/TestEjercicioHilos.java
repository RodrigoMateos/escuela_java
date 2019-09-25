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
       Long t1h;
       
       pr1.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
       pr2.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
       pr3.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
       pr4.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
   
       
       Thread hilo1 = new Thread(){
           
           @Override
           public void run() {
                pr1.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
                
           }     
       };
       
       Thread hilo2 = new Thread(){
           @Override
           public void run() {
                pr1.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
           }   
           
       };
       
       Thread hilo3 = new Thread(){
           @Override
           public void run() {
                pr1.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");
           }          
       };

       Thread hilo4 = new Thread(){
           @Override
           public void run() {
                pr1.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploCoche\\texto.txt");

           }          
       };
       
       hilo1.start();
       hilo2.start();
       hilo3.start();
       hilo4.start();

   }
}
