package poo;
/**
 *
 * @author alumno
 */
public abstract class Vehiculo {

    private String matricula;
    private int ruedas, capacidad;
    private boolean arrancado;
    
    public Vehiculo(){
        arrancado=false;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
    public abstract void abrirPuertas();
    
    public abstract void dameRuedas();
    
    public abstract void arrancar();
    
}
