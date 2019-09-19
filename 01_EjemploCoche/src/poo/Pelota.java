package poo;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 *
 * @author alumno
 */
public class Pelota implements Rodable{

    @Override
    public int getNumRuedas() {
        return 1;
    }

    @Override
    public void moverse() {
        System.out.println("Bota y rueda");
    }


}
