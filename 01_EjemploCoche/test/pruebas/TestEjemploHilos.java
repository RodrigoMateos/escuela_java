/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestEjemploHilos {
    
    public TestEjemploHilos() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    public class ProcesoA extends Thread{

        @Override
        public void run() {
            //super.run(); //To change body of generated methods, choose Tools | Templates.
            mostrarLista();
        }
        
        public void mostrarLista(){
            for(int j=0;j<200;j++){
                System.out.println("Proceso A: "+j);
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestEjemploHilos.class.getName()).log(Level.SEVERE, null, ex);
                }            
            }
        }
    }
       
    @Test
    public void probandoClasesConNombre() throws InterruptedException {
        ProcesoA pA = new ProcesoA();
        Thread pB = new Thread(){
            @Override
            public void run() {
                for(int j=0;j<200;j++){
                    System.out.println("Proceso B: "+j);
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestEjemploHilos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }            
        };
        
        pA.start();
        pB.start();
        pA.join();
        pB.join();
        
    }
}
