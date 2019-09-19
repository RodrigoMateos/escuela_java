/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import org.junit.Test;
import poo.Autobus;
import poo.Coche;
import poo.CocheRally;
import poo.Moto;
import poo.Pelota;
import poo.Rodable;
import poo.TipoCarburante;
import poo.TipoColor;
import poo.Vehiculo;

/**
 *
 * @author alumno
 */
public class AbstractEInterfaceTest {
    
    @Test
    public void abstractos() {
        /*
        Vehiculo moto = new Moto();
        System.out.println("------ MOTO ------\nTiene una capacidad de "+moto.getCapacidad()+" Litros\nEl moto esta "+(moto.isArrancado() ? " arrancado":" parado"));
        moto.abrirPuertas();
        moto.dameRuedas();
        moto.arrancar();
        System.out.println("El moto esta "+(moto.isArrancado() ? " arrancado":" parado"));

        Vehiculo bus = new Autobus();
        System.out.println("------ BUS ------\nTiene una capacidad de "+bus.getCapacidad()+" Litros\nEl bus esta "+(bus.isArrancado() ? " arrancado":" parado"));
        bus.abrirPuertas();
        bus.dameRuedas();
        bus.arrancar();
        System.out.println("El bus esta "+(bus.isArrancado() ? " arrancado":" parado"));

        Vehiculo coche = new Coche("FIAT");
        System.out.println("------ COCHE ------\nTiene una capacidad de "+coche.getCapacidad()+" Litros\nEl coche esta "+(coche.isArrancado() ? " arrancado":" parado"));
        coche.abrirPuertas();
        coche.dameRuedas();
        coche.arrancar();
        System.out.println("El coche esta "+(coche.isArrancado() ? " arrancado":" parado"));
        
        Vehiculo cocheRally = new CocheRally("SUBARU");
        System.out.println("------ COCHE RALLY ------\nTiene una capacidad de "+cocheRally.getCapacidad()+" Litros\nEl coche de Rally esta "+(cocheRally.isArrancado() ? " arrancado":" parado"));
        cocheRally.abrirPuertas();
        cocheRally.dameRuedas();
        cocheRally.arrancar();
        System.out.println("El cochede Rally esta "+(cocheRally.isArrancado() ? " arrancado":" parado"));
        */
    }
    
    @Test
    public void interfaces(){
    
        System.out.println("------------------------INTERFACES----------------------------------------");
        Coche coche = new Coche("BMW", TipoCarburante.GASOLINA, TipoColor.AZUL);
        coche.setArrancado(true);
        coche.echarCarburante(50);
        coche.moverse();
        
        Pelota p = new Pelota();
        p.moverse();
        
        ArrayList<Rodable> cosasQueRuedan = new ArrayList<Rodable>();
        cosasQueRuedan.add(p);
        cosasQueRuedan.add(coche);
        cosasQueRuedan.add(new Moto());
       
        for(Rodable r:cosasQueRuedan){
            System.out.println(">> Rodando "+r.toString());
            System.out.println("Ruedas: "+r.getNumRuedas());
            r.moverse();
        }
    }
}
