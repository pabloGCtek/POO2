package Herencia2.modelo;

public class Barco extends Vehiculo{
    public double eslora;
    public boolean hundido;

    public Barco(double eslora,double peso, double largo){
    super(peso, largo);
    this.eslora = eslora;
    hundido = false;
    }

    public void seHunde(){
        hundido =true;
    }

}
