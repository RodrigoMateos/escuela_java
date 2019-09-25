package pruebas;
/**
 *
 * @author alumno
 */

public class StringAux{

    private String cadena;
    
    public StringAux(String cadena){
        this.cadena=cadena;
    }
    
    public String getCadena(){
        return cadena;
    }
    
    public String quitaEspacios(){
        return quitaEspacios(getCadena());
    }
    
    public int numeroPalabras(){
        return numeroPalabras(getCadena());
    }
    
    public String quitaEspacios(String cadena){
        String c="";
        for(String s:(cadena.trim().split(" ")))
            if(!s.isEmpty())
               c=c+s+" ";
        return c.trim();
    }
    
    public int numeroPalabras(String cadena){
        return quitaEspacios(cadena).split(" ").length;
    }
    
    //----------OTRAS FORMAS------------
    public String quitaEspacios2(String cadena){
        String resultado="";
        cadena=cadena.trim();
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i) != ' ')
                resultado += cadena.charAt(i);
            else if(i<cadena.length()-1)
                if(cadena.charAt(i+1) != ' ')
                    resultado += ' ';
        }
        return resultado;
    }
    
    public String quitaEspacios3(String cadena){
        cadena=cadena.trim();
        while(cadena.contains("  "))
            cadena=cadena.replace("  ", " ");
        return cadena;
    }
    
    public String quitaEspacios4(String cadena){
        return cadena.trim().replaceAll(" +", " ");
    }    
    //--------------------------------
        
}
