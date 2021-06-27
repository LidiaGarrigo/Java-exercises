package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        int i;

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Dime un número[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        System.out.println(
                "Vale, ya tenemos sus 6 números, ahora introduza otro número para ver si coincide con los introducidos anteriormente: ");
        int numeroFinal = sc.nextInt();

        for (i = 0; i < numeros.length; i++) {
            if (numeroFinal == numeros[i]) {
                System.out.println("El número introducido SÍ coincide con los 6 números anteriores.");
            }
        }
    }
}
