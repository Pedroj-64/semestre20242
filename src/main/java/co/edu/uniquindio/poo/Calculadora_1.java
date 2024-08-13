package co.edu.uniquindio.poo;

import java.util.Scanner;

//Documentacion de linea
/**
 * Documentacion de bloque
 */
//crear metodo para para generar mensajes y para ingresar
public class Calculadora_1 {

    @SuppressWarnings("resource")
    /**
     * 
     * @param num1
     * @param num2
     * @return
     */

    public static double sumar(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    /**
     * 
     * @param num1
     * @param num2
     * @return
     */
    public static double restar(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    /**
     * 
     * @param num1
     * @param num2
     * @return
     */
    public static double multiplicar(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    /**
     * 
     * @param num1
     * @param num2
     * @return
     */
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No es posible usar el 0 en ninguna operación");
        }
        double result = num1 / num2;
        return result;
    }

    /**
     * 
     * @param opcion
     * @param numA
     * @param numB
     */
    public static void calculadora(int opcion, double numA, double numB) {

        switch (opcion) {
            case 1:
                System.out.println(sumar(numA, numB));

                break;
            case 2:
                System.out.println(restar(numA, numB));

                break;
            case 3:
                System.out.println(multiplicar(numA, numB));

                break;

            case 4:
                System.out.println(dividir(numA, numB));

                break;

            default:
                break;
        }
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println(
                "Por favor ingrese qué operación desea hacer: \n 1. Suma \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
        int opcion = entrada.nextInt();
        System.out.println("Ingrese el numero 1:");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        calculadora(opcion, a, b);
    }
}
