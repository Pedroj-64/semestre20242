package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Factorial {

    public static int newFactorial(Scanner entrada){
        System.out.println("ingrese el numero del cual quiere saber su factorial");
        int facto=entrada.nextInt();
        return facto;

    }
    public static int calcularFactorial(int facto) {
        int resultado = 1;
        for (int i = facto; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
    public static String generarMensaje(int num1, int resultado) {
        String mensaje = "El resultado de tu factorial del numero " + num1 +  " es de: " + resultado;
        return mensaje;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int factorial=newFactorial(entrada);
        int resultado=calcularFactorial(factorial);
        String mensaje=generarMensaje(factorial, resultado);
        mostrarMensaje(mensaje);
        entrada.close();
    }

}
