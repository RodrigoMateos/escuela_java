package poo;
/**
 *
 * @author alumno
 */
public class Moto extends Vehiculo implements Rodable{

    private String marca, modelo, matricula;
    private TipoColor color;
    private int ruedas, capacidad;
    
    public Moto(){
        setCapacidad(40);
        setRuedas(2);
    }
    
    public Moto(String marca, String modelo, TipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        setCapacidad(40);
        setRuedas(2);
    }

    public Moto(String marca, String modelo, TipoColor color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula=matricula;
        setCapacidad(40);
        setRuedas(2);
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }
    
    
    
    @Override
    public void abrirPuertas() {
        System.out.println("Las motos no tienen puertas....");
    }

    @Override
    public String toString() {
        return "Moto es un vehiculo de "+getRuedas();
    }

    @Override
    public void dameRuedas() {
        System.out.println("Todos las motos tienen "+getRuedas()+ " ruedas.");
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
            System.out.println("La moto es un vehiculo rodable");
    }

    
}
