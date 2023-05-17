package Herencia2.modelo;

public class Avion extends Vehiculo{
    public int pasajeros;
    public Avion(int pasajeros,double peso, double largo){
        super(peso,largo);
        this.pasajeros=pasajeros;
    }

    public void aterriza(){

    }
}
