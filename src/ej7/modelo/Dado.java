package ej7.modelo;

public class Dado {
    private int Min = 1;
    private int Max = 6;
    public Dado(){

    }
    public void tiraDado(){
        int num;
        num = Min + (int)(Math.random() * ((Max - Min) + 1));
        System.out.println("Ha salido un: "+num);
        switch (num){
            case 1:
                System.out.println("   \n * \n   ");
                break;
            case 2:
                System.out.println("*  \n   \n  *");
                break;
            case 3:
                System.out.println("*  \n * \n  *");
                break;
            case 4:
                System.out.println("* *\n   \n* *");
                break;
            case 5:
                System.out.println("* *\n * \n* *");
                break;
            default:
                System.out.println("* *\n* *\n* *");
                break;
        }

    }
}
