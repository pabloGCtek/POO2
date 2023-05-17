package Abstracta1.modelo;

public class PlantaTorpical extends Planta{

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Se ha regado la planta tropical con "+cantidad+" agua para "+tiempo+" tiempo");
    }
}
