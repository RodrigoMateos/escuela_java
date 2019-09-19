/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class GenericTest {

    @Test
    public void metodosGenericos() {
        ArrayList<Integer> list = new ArrayList<>();
        dobleAdd(list, 10);
        dobleAdd(list, 22);
        mostrarLista(list.toArray());
        
 //       System.out.println("Texto: "+list.toString());
        
        ArrayList<String> list2 = new ArrayList<>();
        dobleAdd(list2, "cadena 1");
        dobleAdd(list2, "string 2");
        mostrarLista(list2.toArray());
        ArrayList<Object> copia = toArrayList(list2.toArray());
        copia.forEach((s) -> {
            System.out.println("--------"+s+"--------");
//        System.out.println("Texto: "+list2.toString());
        });
    }
    
    
    public <E> ArrayList<E> toArrayList(E[] list){
        ArrayList<E> lista = new ArrayList<>();
        //        lista.addAll(Arrays.asList(list));
        for(E element : list)
            lista.add(element);
        return lista;
    }
    
    public static <E> void mostrarLista(E[] list){
        for(E elemento:list)
            System.out.print("["+elemento.toString()+"]");
        System.out.println("");
    }
    
    public static <E> void dobleAdd(ArrayList<E> lista, E valor){
        lista.add(valor);
        lista.add(valor);        
    }
    

}
