package poo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Autobus extends Vehiculo implements Rodable{

    
    public Autobus(){
        setCapacidad(200);
        setRuedas(8);
    }
    
    @Override
    public void abrirPuertas() {
        System.out.println("Abriendo puertas");
        int i=0;
        while(i<4){
            System.out.println("...");
            i++;
        }
        System.out.println("Puertas abiertas...");

    }

    @Override
    public void dameRuedas() {
        System.out.println("Todos los buses tienen "+getRuedas()+ " ruedas.");
    }

    @Override
    public void arrancar() {
        setArrancado(true);
    }

    @Override
    public int getNumRuedas() {
        return getRuedas();
    }

    @Override
    public void moverse() {
        if(getNumRuedas()>0)
            System.out.println("El Autobus es un vehiculo rodable");
    }

}
