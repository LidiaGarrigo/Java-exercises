package Ejercicios;

/**
 *
 * @author lidiags
 */
public class Ejercicio8 {

  public static void main(String[] args) {

    int[][] matriz = new int[3][3];

    matriz[0][0] = 1;
    matriz[0][1] = 1;
    matriz[0][2] = 1;

    matriz[1][0] = 2;
    matriz[1][1] = 2;
    matriz[1][2] = 2;

    matriz[2][0] = 3;
    matriz[2][1] = 3;
    matriz[2][2] = 3;

    System.out.println("Valor almacenado en la posición 0,0: " + matriz[0][0]);
    System.out.println("Valor almacenado en la posición 2,2: " + matriz[2][2]);
    System.out.println("Valor almacenado en la posición 1,2: " + matriz[1][2]);
  }
}