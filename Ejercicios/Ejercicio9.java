package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[6][6];

        /* matriz[0][0]= 13; */ matriz[0][0] = 1;
        /* matriz[1][1]= 65; */ matriz[1][1] = 1;
        /* matriz[2][2]= 11; */ matriz[2][2] = 1;
        /* matriz[3][3]= 35; */ matriz[3][3] = 1;
        /* matriz[4][4]= 11; */ matriz[4][4] = 1;
        /* matriz[5][5]= 3; */ matriz[5][5] = 1;
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (x == y) {
                    continue;
                } else {
                    System.out.print("Introduzca el elemento [" + x + "," + y + "]: ");
                    matriz[x][y] = teclado.nextInt();
                    teclado.close();
                    if (matriz[x][y] < 0)
                        matriz[x][y] = 0;
                }
            }
        }
        for (int x = 0; x < matriz.length; x++) {
            System.out.println();
            for (int y = 0; y < matriz.length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1)
                    System.out.print("\t");
            }
        }
        System.out.println();
        System.out.println("Esta es la diagonal inicial de la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }
    }
}
