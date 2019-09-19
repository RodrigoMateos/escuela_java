package poo;


/**
 *
 * @author alumno
 */
public class CocheRally extends Coche{
    
    private float rozamiento;
    
    public CocheRally(String marca){
        super(marca);
        setCapacidad(100);
        capacidadDeposito=getCapacidad();
        this.rozamiento=2.5f;      
    }
    
    public CocheRally(String marca, TipoCarburante carburante, TipoColor color, float rozamiento){
        super(marca,carburante,color);
        this.rozamiento=rozamiento;
    }

    public CocheRally(String marca, TipoCarburante carburante, String color, float rozamiento){
        super(marca,carburante,color);
        this.rozamiento=rozamiento;
    }    
    
    public float getRozamiento() {
        return rozamiento;
    }

    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }
    
    public void derrapar(){
        System.out.println("Acabo de derrapar");
        super.explosionCilindro();
    }
    
    
        
    //SOBRE ESCRITURA DE METODOS
    @Override
    public void acelerar(){
        System.out.println("------------------------------- \n Acelerando como una bestia parda");
        if(isArrancado()){
            setNivDeposito(getNivDeposito() - 0.5);
            explosionCilindro();
        }
        System.out.println(getNivDeposito());

    }
    
    @Override
    public void abrirPuertas() {
        System.out.println("Abriendo puertas del coche de Rally");
    }    
}
