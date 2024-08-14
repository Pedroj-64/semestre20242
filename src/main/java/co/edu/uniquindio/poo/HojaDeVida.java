package co.edu.uniquindio.poo;

import java.util.Scanner;

public class HojaDeVida {

    public static String[] datos(Scanner entrada) {
        System.out.println("ingrese por favor su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Por favor ingrese su tiempo disponible: ");
        String tiempo = entrada.nextLine();
        System.out.println("Ingrese experiencia laboral:");
        String experiencia = entrada.nextLine();
        System.out.println("Ingrese su aspiracion salarial:");
        String salario = entrada.nextLine();

        String datosString[] = new String[4];
        datosString[0] = nombre;
        datosString[1] = experiencia;
        datosString[2] = tiempo;
        datosString[3] = salario;

        return datosString;

    }

    public static int datosNumerico(Scanner entrada) {
        System.out.println("Por favor ingrese edad: ");
        int edad = entrada.nextInt();
        return edad;
    }

    public static String generarMensaje(String datosString[], int edad) {
        String mensaje = "Bienvenido su hoja de vida con los datos consignados seria asi:\n" + "Nombre:"
                + datosString[0] + "\nEdad=" + edad + "\nExperiencia laboral: " + datosString[1]
                + "\nTiempo disponible: "
                + datosString[2] + "\nSalario deseado: " + datosString[3];
        return mensaje;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] info = datos(entrada);
        int infoNum = datosNumerico(entrada);
        String mensaje = generarMensaje(info, infoNum);
        mostrarMensaje(mensaje);
        entrada.close();
    }
}
