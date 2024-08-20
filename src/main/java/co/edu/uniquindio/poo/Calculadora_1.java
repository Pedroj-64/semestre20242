package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Calculadora_1 {

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static int entradaScanner(Scanner entrada) {
        System.out.println(
                "Por favor ingrese qué operación desea hacer: \n 1. Suma \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir");
        return entrada.nextInt();
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double entradaNumerica1(Scanner entrada) {
        System.out.println("Por favor ingresar el primer numero a operar:");
        return entrada.nextDouble();
    }

    public static double entradaNumerica2(Scanner entrada) {
        System.out.println("Por favor ingresar el segundo numero a operar:");
        return entrada.nextDouble();
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No es posible usar el 0 en ninguna operación");
        }
        return num1 / num2;
    }

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
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }
        return result;
    }

    public static String generarMensaje(double num1, double num2, double resultado) {
        return "El resultado de tu operacion entre el numero " + num1 + " y " + num2 + " es de: " + resultado;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean activo = true;

        while (activo) {
            int opcion = entradaScanner(entrada);

            if (opcion >=1 && opcion<=4) {
                double num1 = entradaNumerica1(entrada);
                double num2 = entradaNumerica2(entrada);

                double calc = calculadora(opcion, num1, num2);
                String mensaje = generarMensaje(num1, num2, calc);
                mostrarMensaje(mensaje);
            } 
            if(opcion==5) {
                activo = false;
                System.out.println("Saliendo del programa...");

            }
        }

        entrada.close();
    }
}
