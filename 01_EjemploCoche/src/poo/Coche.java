package poo;

public class Coche extends Vehiculo implements Rodable{ // hereda de Object
    
    public int capacidadDeposito = 60;
    

    
    private final int numRuedas;   // Valor constante por el final
    private String marca;
    private TipoCarburante carburante;
    private double nivDeposito;
    private TipoColor color;

    public Coche(String marca){
        setRuedas(4);
        numRuedas=getRuedas();
        setCapacidad(60);
        capacidadDeposito=getCapacidad();
        this.marca=marca;
        this.color=TipoColor.BLANCO;
        this.carburante=TipoCarburante.GASOLINA;
        
    }
    
    public Coche(String marca, TipoCarburante carburante, String color) {
        setRuedas(4);
        numRuedas=getRuedas();
        setCapacidad(60);
        capacidadDeposito=getCapacidad();
        this.marca = marca;
        this.carburante=carburante;
//        this.color=dameColor(color);
//        this.color = TipoColor.valueOf(color.toUpperCase());
        this.color=Enum.valueOf(TipoColor.class, color.toUpperCase());
    }
    
    public Coche(String marca, TipoCarburante carburante, TipoColor color) {
        setRuedas(4);
        numRuedas=getRuedas();        
        setCapacidad(60);
        capacidadDeposito=getCapacidad();
        this.marca = marca;
        this.carburante=carburante;
        this.color=color;
    }
    
    public double getNivelDep() {
        return nivDeposito;
    }

    public void mostrar() {
        System.out.println(this.toString()); 
    }

    public String getMarca() {
        return marca;
    }

    public double getNivDeposito() {
        return nivDeposito;
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

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }
    
    public void echarCarburante(double cantidad) {
        if (cantidad > 0)
            this.nivDeposito += cantidad;
        
        if (nivDeposito > getCapacidadDeposito())
            nivDeposito = getCapacidadDeposito();
        System.out.println(this.nivDeposito);
    }
    
    public void acelerar() {
        if (isArrancado())  {
            nivDeposito -= 0.1;
            explosionCilindro();
        }
    }
    
    public void vaciarDeposito() {
        // float nivelDeposito = 2;
        this.nivDeposito = 3;
        System.out.println("Deposito vaciado de " + this.toString()
                /*+ "\n   Nivel: " + nivelDeposito*/ );  
    }
    
    @Override
    public String toString() {
        return "Coche " + marca +" color "+this.color.toString()+" nivel " + nivDeposito;
    }   

    
    protected void explosionCilindro(){
        System.out.println("Motor funcionando");
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

    @Override
    public void abrirPuertas() {
        System.out.println("Abriendo puertas del coche");
    }

    @Override
    public void dameRuedas() {
        setRuedas(4);
        System.out.println("Todos los coches tienen "+getRuedas()+ " ruedas.");
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
            System.out.println("El Coche es un vehiculo rodable");
    }
    
        
}
