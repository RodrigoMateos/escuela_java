/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Test;
import static org.junit.Assert.*;
import poo.Coche;
import poo.Pelota;
import poo.TipoCarburante;
import poo.TipoColor;

/**
 *
 * @author alumno
 */
public class ColeccionesTest {
/*
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
    */
    //@Test
    public void sets(){
        HashSet<Pelota> pelotas = new HashSet<>();
        Pelota p=new Pelota();
        pelotas.add(p);
        pelotas.add(new Pelota());
        pelotas.add(new Pelota());
        pelotas.add(p);

        
        System.out.println("El numero de pelotas que hay es: "+pelotas.size());
        assertEquals(pelotas.size(), 3);
    }
    
    //@Test
    public void maps(){
        
        HashMap<String, Boolean> coloresCalidos = new HashMap<>();
        
        coloresCalidos.put("Blanco", Boolean.FALSE);
        coloresCalidos.put("Amarillo", true);
        coloresCalidos.put("Rojo", true);
        coloresCalidos.put("Azul", false);

        if(coloresCalidos.get("Azul"))
            System.out.println("Azul es un color calido");
        else
            System.out.println("Azul no es un color calido");

        if(coloresCalidos.get("Amarillo"))
            System.out.println("Amarillo es un color calido");
        else
            System.out.println("Amarillo no es un color calido");        
        //coloresCalidos.remove("Blanco");
        
        System.out.println("---NORMAL----");        
        for(Map.Entry<String,Boolean> valor:coloresCalidos.entrySet()){
            System.out.println("Clave: "+valor.getKey() + "\n   valor: "+valor.getValue());
        }
        
        System.out.println("----CON LAMBDA----");        
        coloresCalidos.forEach((clave,valor) ->{
            System.out.println("Clave: "+clave+ "\n   valor: "+valor);
        });
        
        
    }
    
    @Test
    public void trees(){
    
        TreeMap<String,Coche> arbol = new TreeMap<>();
        Coche coche1=new Coche("OPEL");
        Coche coche2=new Coche("RENAULT");
        Coche coche3=new Coche("FIAT");
        Coche coche4=new Coche("SEAT");

        arbol.put("2281KNN", coche1);
        arbol.put("1640CRB", coche2);
        arbol.put("M8010LZ", coche3);
        arbol.put("M3287N", coche4);

        for(Map.Entry<String,Coche> elem:arbol.entrySet())
            System.out.println("Coche: "+elem.getValue().getMarca()+" Matricula: "+elem.getKey());
        
        System.out.println("-------");
        arbol.forEach((clave,valor) -> {
            System.out.println("Coche: "+valor.getMarca()+" Matricula: "+clave);
        });
        

    }
}
