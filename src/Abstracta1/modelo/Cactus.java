package Abstracta1.modelo;

public class Cactus extends Planta{

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Se ha regado el cactus con "+cantidad+" agua para "+tiempo+" tiempo");
    }
}
