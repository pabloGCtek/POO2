package ej5.modelo;

public class Tabla {
    public int num;
    public Tabla(int num){
        this.num = num;
    }
    public void mustraTabla(){
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+num+" = "+num*i);
        }
    }
}
