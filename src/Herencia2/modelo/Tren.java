package Herencia2.modelo;

public class Tren extends Vehiculo {
    double anchoVia;
    String company;
    public Tren(double via, String company, double peso, double largo){
        super(peso, largo);
        this.anchoVia=via;
        this.company=company;
    }
}
