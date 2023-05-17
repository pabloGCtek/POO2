package Herencia2.presentacion;

import Herencia2.modelo.Avion;
import Herencia2.modelo.Coche;
import Herencia2.modelo.Tren;
import Herencia2.modelo.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo(1,1);
        Coche c = new Coche(150,"trasera",1300,2.5);
        Avion av = new Avion(100,300000,30);
        Tren tr = new Tren(1.51, "AVE", 2000000,300);
    }
}
