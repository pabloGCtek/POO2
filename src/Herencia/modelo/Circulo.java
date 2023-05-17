package Herencia.modelo;

public class Circulo extends Figura{
    public double radio;

    public Circulo(double rad,int x, int y){
        super(x,y);
        this.radio =rad;
    }
}
