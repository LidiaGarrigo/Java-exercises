package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");

        String cadena = new String(teclado.nextLine());
        teclado.close();

        boolean minuscula = cadena.substring(0).startsWith("a");
        boolean mayuscula = cadena.substring(0).startsWith("A");

        if (cadena.length() < 5) {
            System.out.println("El tamaño de la cadena introducida tiene menos de 5 caracteres.");

            if (minuscula) {
                System.out.println("Y la primera letra es 'a' minúscula.");
            }
            if (mayuscula) {
                System.out.println("Y la primera letra es 'A' mayúscula.");
            }
            if (!minuscula && !mayuscula) {
                System.out.println("La primera letra no empieza por 'a' ni minúscula ni mayúscula.");
            }
        }
        if (cadena.length() > 5 && cadena.length() < 15) {
            System.out.println("El tamaño de la cadena introducida tiene entre 5 y 15 caracteres.");

            if (minuscula) {
                System.out.println("Y la primera letra es 'a' minúscula.");
            }
            if (mayuscula) {
                System.out.println("Y la primera letra es 'A' mayúscula.");
            }
            if (!minuscula && !mayuscula) {
                System.out.println("La primera letra no empieza por 'a' ni minúscula ni mayúscula.");
            }
        }
        if (cadena.length() > 15) {
            System.out.println("El tamaño de la cadena introducida tiene más de 15 caracteres.");

            if (minuscula) {
                System.out.println("Y la primera letra es 'a' minúscula.");
            }
            if (mayuscula) {
                System.out.println("Y la primera letra es 'A' mayúscula.");
            }
            if (!minuscula && !mayuscula) {
                System.out.println("La primera letra no empieza por 'a' ni minúscula ni mayúscula.");
            }
        }

    }
}
