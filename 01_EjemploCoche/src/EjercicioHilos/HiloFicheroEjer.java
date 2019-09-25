package EjercicioHilos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author alumno
 */
public abstract class HiloFicheroEjer {
    
    public HiloFicheroEjer(){};
    
    public void crearFicheroEjem(String ruta){
        String[] palabras = new String['Z'-'A'+1];
        Random r = new Random(new Date().getTime());
        
        for(char c = 'A'; c<'Z'; c++){
            String cadena="";
            int repetido = + 2+ Math.abs(r.nextInt()) % 8;//numero aleatorio entre 2 y 9
            for(int i=0;i<repetido;i++)
                cadena+= ""+c;
            palabras[c-'A']=cadena;
        }
        System.out.println(Arrays.toString(palabras));
        
        FileWriter fich = null;
        try{
            fich = new FileWriter(ruta, false);
            for(int i=0;i<200000;i++){
                if(r.nextInt(2)==0)
                    fich.write(palabras[r.nextInt(palabras.length)]);
                if(r.nextInt(2)==0)
                    for(int j=0;j<10;j++)
                        fich.write(" ");
                if(r.nextInt(12)==0)
                        fich.write("\n\r");
            }
        }catch(IOException e){
            System.err.println("Error de escritura: "+e.getMessage());
        }catch(Exception e){
            System.err.println("Otro error: "+e.getMessage());
        } finally {
            try {
                if(fich != null)
                    fich.close();
            } catch (IOException ex) {
            }
        }
    }

    public abstract void leerFicheroEjem(String ruta);
}

