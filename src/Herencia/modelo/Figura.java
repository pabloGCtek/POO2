package Herencia.modelo;

public class Figura {
    public int coordenadaX;
    public int coordenadaY;

    public Figura(int x,int y){
        this.coordenadaY=y;
        this.coordenadaX=x;
    }

    public String posicion(){
        return ("La coordenada es "+coordenadaX+"," +coordenadaY);
    }
}
