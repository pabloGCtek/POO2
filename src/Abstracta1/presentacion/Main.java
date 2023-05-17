package Abstracta1.presentacion;

import Abstracta1.modelo.Cactus;
import Abstracta1.modelo.Planta;
import Abstracta1.modelo.PlantaTorpical;

public class Main {
    public static void main(String[] args) {
        Planta tropical = new PlantaTorpical();
        Planta aloe = new Cactus();
        tropical.regar(10,21);
        aloe.regar(1,1);
        tropical.crecer();
        aloe.crecer();
    }
}
