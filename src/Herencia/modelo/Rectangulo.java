package Herencia.modelo;

public class Rectangulo extends Figura {
    public double ancho;
    public double largo;

    public Rectangulo(double an, double lar, int x, int y){
        super(x,y);
        this.ancho = an;
        this.largo = lar;
    }
}
