package Abstracta1.modelo;

public abstract class Planta {

    abstract public void regar(int cantidad,int tiempo);

    public void crecer(){
        System.out.println("La planta ha crecido!");
    }
}
