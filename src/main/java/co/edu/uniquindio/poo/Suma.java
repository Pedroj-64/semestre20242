package co.edu.uniquindio.poo;

public class Suma {
        public static void main(String[] args){
        final int num1=7;
        final int num2=8;

        int resultado=sumatoria(num1, num2);

        System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + resultado);
    }
     public static int sumatoria (int num1,int num2){
            
        int resultado=num1+num2;
        return resultado;

    }
}
