package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author lidiags
 */
public class Ejercicio4 {
    public static void main(String[] args)
    {
        int i;
        int[] numeros = new int[5];

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<numeros.length; i++){
            
            System.out.printf("Introduzca el número %d: ", i+1);
            numeros[i] = teclado.nextInt();
            teclado.close();
        }
        
        System.out.println("Los números introducidos son: "); 
        
        for(i=0; i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
    }
    
}
