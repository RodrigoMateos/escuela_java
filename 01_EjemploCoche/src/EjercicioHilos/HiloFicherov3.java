package EjercicioHilos;

import Threads.HiloFichero;
import java.io.File;
import java.util.Scanner;
import pruebas.StringAux;

/**
 *
 * @author alumno
 */
public class HiloFicherov3 extends HiloFicheroEjer{
    
    public HiloFicherov3(){}
    
@Override
    public void leerFicheroEjem(String ruta){
        File fichero = new File(ruta);
        Scanner s = null;
        try{
            s = new Scanner(fichero);
            while(s.hasNextLine()){
                String linea = s.nextLine();
                StringAux stAux = new StringAux(linea);
                
                System.out.println(stAux.quitaEspacios3(linea));
            }
            
        }catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        } finally {
            try {
                if(s != null)
                    s.close();
            } catch (Exception ex) {
            }
        }
    }
}
