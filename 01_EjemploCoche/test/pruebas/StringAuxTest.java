/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class StringAuxTest {

     @Test
     public void pruebaQuitarEspacios() {
     
         StringAux cadena = new StringAux("");
         StringAux cadena2 = new StringAux("    En  un  lugar de la        mancha");

         System.out.println("Prueba");
         String texto1=cadena.quitaEspacios("    En  un  lugar de la        mancha");
         
         String texto2="En un lugar de la mancha";
         String texto3=cadena2.quitaEspacios();

         assertEquals(texto1,texto2);
         assertEquals(texto3,texto2);
         

     }
     
     public void pruebaContarPalabras(){
         
         StringAux cadena = new StringAux("");
         StringAux cadena2 = new StringAux("    En  un  lugar de la        mancha");
         StringAux c = new StringAux("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
         int long1=cadena.numeroPalabras("     ");

         assertEquals(cadena2.numeroPalabras(),6);
         assertEquals(c.numeroPalabras(),1);
         assertEquals(cadena.numeroPalabras("    En  un  lugar de la        mancha"),6);
         assertEquals(long1,0);
       
     }
}
