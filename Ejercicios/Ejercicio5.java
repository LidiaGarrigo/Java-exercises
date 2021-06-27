package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */

public class Ejercicio5 {
    public static void main(String[] arg) {

        int i;
        int[] numeros = new int[5];

        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < numeros.length; i++) {
            System.out.printf("Introduzca el número %d: ", i + 1);
            numeros[i] = teclado.nextInt();
            teclado.close();
        }
        
        int[] elemento2 = new int[2];
        for (i = 1; i < elemento2.length; i++) {
            System.out.println("Este es el elemento 2 introducido: " + numeros[i]);
        }
        int[] elemento5 = new int[5];
        for (i = 4; i < elemento5.length; i++) {
            System.out.println("Este es el elemento 5 introducido: " + numeros[i]);
        }
    }
}
