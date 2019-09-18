package pruebas;
/**
 *
 * @author alumno
 */
public class ProbandoString {

    public void probarCadenas(){
       /*
        String texto ="  Esto es una prueba para ver como trata java las cadenas.    ";
        String texto2="  Esto es una prueba para ver como trata java las cadenas.    ";
        System.out.println("Original: "+texto);
        System.out.println("¿Son iguales?: " +((texto.compareTo(texto2)==0) ? "SI": "NO"));
        
        if(texto.contains("prueba"))
            System.out.println("La cadena contiene lo buscado");
        else
            System.out.println("La cadena no contiene lo buscado");
        
        System.out.println("Prueba esta en la posicion: "+texto.indexOf("prueba"));
        System.out.println(texto.replace("o", "9"));
        System.out.println("Tamaño: "+texto.length());
        */


        StringAux stringAux = new StringAux("Esto es una prueba");
        String texto3 = "    Esto    es  una prueba      de  String";
       
        System.out.println(stringAux.quitaEspacios(texto3));
        System.out.println(stringAux.numeroPalabras(texto3));
        System.out.println(stringAux.getCadena().length());
        
        //System.out.println("Sin espacios al final: "+texto.trim());
    }
}
