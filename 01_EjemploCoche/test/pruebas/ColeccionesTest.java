/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import poo.Coche;
import poo.TipoCarburante;
import poo.TipoColor;

/**
 *
 * @author alumno
 */
public class ColeccionesTest {

    @Test
    public void arrays() {
    
        Coche[] coches = new Coche[5];
        coches[0]=new Coche("SEAT",TipoCarburante.DIESEL, TipoColor.AZUL);
        coches[1]=new Coche("OPEL",TipoCarburante.GASOLINA, TipoColor.BLANCO);
        coches[2]=new Coche("TOYOTA",TipoCarburante.HIBRIDO, TipoColor.ROJO);
        coches[3]=new Coche("TESLA",TipoCarburante.ELECTRICO, TipoColor.NEGRO);
        coches[4]=new Coche("RENAULT",TipoCarburante.GASOLINA, TipoColor.AZUL);       
        
        Coche[] coches2 = {coches[2], coches[1], new Coche("SEAT", TipoCarburante.GASOLINA, TipoColor.ROJO), coches[3]};
        
        //Array NO generico
        List array = new ArrayList();
        array.add(true);
        array.add("prueba");
        array.add(430);
        
        for(Object o:array)
            System.out.println("OBJ: "+o);
        
        //Array generico
        List<Coche> cocheDinamico = new ArrayList<>();
        for(Coche c:coches)
            cocheDinamico.add(c);
        
        cocheDinamico.forEach((coche) -> {
            System.out.println(" -> "+coche.toString());
        });
        
        cocheDinamico.forEach(ColeccionesTest::mostrarCoche);
        
    }
   
    public static void mostrarCoche(Coche c){
        System.out.println("Coche: "+c.toString());
    }
}
