package co.edu.uniquindio.poo;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Por favor ingrese qué operación desea hacer: \n 1. Suma \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
        int opcion = entrada.nextInt();
        

        if (opcion >= 1 && opcion <= 4) {
            System.out.println("Por favor ingrese el primer número");
            num1 = entrada.nextDouble();

            System.out.println("Por favor ingrese el segundo número");
            num2 = entrada.nextDouble();


            
            if (opcion == 1) {
                resultado = sumar(num1, num2);
            } else if (opcion == 2) {
                resultado = restar(num1, num2);
            } else if (opcion == 3) {
                resultado = multiplicar(num1, num2);
            } else if (opcion == 4) {
                resultado = dividir(num1, num2);
            }

            System.out.println("El resultado de tu operación es: " + resultado);
        } else {
            System.out.println("Por favor ingrese un valor válido");
        }

        entrada.close();
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No es posible usar el 0 en ninguna operación");
        }
        return num1 / num2;
    }
}
