package Herencia.presentacion;

import Herencia.modelo.Circulo;
import Herencia.modelo.Figura;
import Herencia.modelo.Rectangulo;

public class Main {


    public static void main(String[] args) {
        Circulo c = new Circulo(3,31,11);
        Rectangulo r = new Rectangulo(4,5, 29,9);
        Figura f = new Figura(30,10);

        System.out.println(c.posicion());
        System.out.println(r.posicion());
        System.out.println(f.posicion());
    }
}
