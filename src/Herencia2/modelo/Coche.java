package Herencia2.modelo;

public class Coche extends Vehiculo{
    public double potencia;
    public String traccion;

    public Coche(double pot, String trac,double peso, double largo) {
        super(peso, largo);
        this.potencia = pot;
        this.traccion = trac;
    }
}
