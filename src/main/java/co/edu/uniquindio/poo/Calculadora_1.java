package co.edu.uniquindio.poo;

import java.util.Scanner;

//Documentacion de linea
/**
 * Documentacion de bloque
 */
// crear metodo para para generar mensajes y para ingresar
// Crear un proyecto en java (lo que desee), que solicite algo y tire algo
public class Calculadora_1 {

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

    public static int entradaScanner() {
        Scanner entrada = new Scanner(System.in);
        System.out.println(
                "Por favor ingrese qué operación desea hacer: \n 1. Suma \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
        int opcion = entrada.nextInt();
        return opcion;
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

    public static double entradaNumerica1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingresar el primer numero a operar:");
        double num1 = entrada.nextDouble();
        return num1;
    }

    public static double entradaNumerica2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingresar el segundo numero a operar:");
        double num2 = entrada.nextDouble();
        return num2;
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
    public static double calculadora(int opcion, double numA, double numB) {
        double result = 0;
        switch (opcion) {
            case 1:
                result = sumar(numA, numB);
                break;
            case 2:
                result = restar(numA, numB);
                break;
            case 3:
                result = multiplicar(numA, numB);
                break;
            case 4:
                result = dividir(numA, numB);
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }
        return result;
    }

    public static String generarMensaje(double num1, double num2, double resultado) {
        String mensaje = "El resultado de tu operacion entre el numero " + num1 + " y " + num2 + " es de: " + resultado;
        return mensaje;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion = entradaScanner();
        double num1 = entradaNumerica1();
        double num2 = entradaNumerica2();

        double calc = calculadora(opcion, num1, num2);
        String mensaje = generarMensaje(num1, num2, calc);
        mostrarMensaje(mensaje);

        entrada.close();
    }
}
