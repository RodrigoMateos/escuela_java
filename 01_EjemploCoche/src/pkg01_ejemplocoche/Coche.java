package pkg01_ejemplocoche;

public class Coche { // hereda de Object
    
    public static final int CAPACIDAD_DEPOSITO = 60;
    

    
    private final byte numRuedas;   // Valor constante por el final
    private String marca;
    private TipoCarburante carburante;
    private double nivDeposito;
    private boolean arrancado;
    private TipoColor color;


    public Coche(String marca, TipoCarburante carburante, String color) {
        this.numRuedas = 4;
        this.marca = marca;
        this.carburante=carburante;
//        this.color=dameColor(color);
//        this.color = TipoColor.valueOf(color.toUpperCase());
        this.color=Enum.valueOf(TipoColor.class, color.toUpperCase());
    }
    
    public Coche(String marca, TipoCarburante carburante, TipoColor color) {
        this.numRuedas = 4;
        this.marca = marca;
        this.carburante=carburante;
        this.color=color;
    }
    
    public double getNivelDep() {
        return nivDeposito;
    }

    public byte getNumRuedas() {
        return numRuedas;
    }
    
    
    public void echarCarburante(double cantidad) {
        if (cantidad > 0)
            this.nivDeposito += cantidad;
        
        if (nivDeposito > CAPACIDAD_DEPOSITO)
            nivDeposito = CAPACIDAD_DEPOSITO;
    }
    
    public void acelerar() {
        if (arrancado)  nivDeposito -= 0.1;
    }
    
    public void vaciarDeposito() {
        // float nivelDeposito = 2;
        this.nivDeposito = 3;
        System.out.println("Deposito vaciado de " + this.toString()
                /*+ "\n   Nivel: " + nivelDeposito*/ );  
    }
    public String toString() {
        return "Coche " + marca +" color "+this.color.toString()+" nivel " + nivDeposito;
    }
    public void mostrar() {
        System.out.println(this.toString()); 
    }

    public String getMarca() {
        return marca;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public double getNivDeposito() {
        return nivDeposito;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
    public String getMarca (String marca){
        return marca;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void setNivDeposito(double nivDeposito) {
        this.nivDeposito = nivDeposito;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public TipoCarburante getCarburante() {
        return carburante;
    }

    public void setCarburante(TipoCarburante carburante) {
        this.carburante = carburante;
    }
    
    

    private TipoColor dameColor(String color) {
        if(color.equalsIgnoreCase("rojo"))
            return TipoColor.ROJO;
        else if(color.equalsIgnoreCase("verde"))
            return TipoColor.VERDE;
        else if(color.equalsIgnoreCase("plata"))
            return TipoColor.PLATA;
        else if(color.equalsIgnoreCase("azul"))
            return TipoColor.AZUL;
        else if(color.equalsIgnoreCase("blanco"))
            return TipoColor.BLANCO;
        else if(color.equalsIgnoreCase("negro"))
            return TipoColor.NEGRO;    
        else
            return null;
        
    }
    
}
