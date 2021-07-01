package Ejercicios;
import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio15 {

    public static void main(String[] args) { //método main 
        int opcion = 0;
        Scanner teclado = new Scanner(System.in); //activamos Scanner
        
        while (opcion <= 3){
            
            Menu(); //llamamos al método Menu
            
            System.out.printf("\nIntroduzca la opción que desee realizar (1-3): ");
            opcion = teclado.nextInt();
            
            if (opcion == 1){
                System.out.println("Has seleccionado la opción 1.");
                System.out.println("Introduzca un número: ");
                int n1 = teclado.nextInt();
                System.out.println("Introduzca otro número: ");
                int n2 = teclado.nextInt();
                int sumar = funcion_suma(n1, n2);
                System.out.println("La suma de los dos números es: " + sumar);
            }
            else if(opcion == 2){
                System.out.println("Has seleccionado la opción 2.");
                System.out.println("Introduzca un número: ");
                int n1 = teclado.nextInt();
                System.out.println("Introduzca otro número: ");
                int n2 = teclado.nextInt();
                int restar = funcion_resta(n1, n2);
                System.out.println("La resta de los dos números es: " + restar);
            }
            else if(opcion == 3){
                System.out.println("Has seleccionado la opción 3.");
                System.out.println("Introduzca un número: ");
                int n1 = teclado.nextInt();
                System.out.println("Introduzca otro número: ");
                int n2 = teclado.nextInt();
                teclado.close();
                int multiplicar = funcion_multiplicar(n1, n2);
                System.out.println("La multiplicación de los dos números es: " + multiplicar);
            }
            else {
                System.out.println("Has seleccionado la opción Salir"); //finaliza el bucle while
            }
        }
  
    }
    //para funciones y métodos:
    
    public static void Menu() //método
    {
        System.out.printf("\n>>> MENÚ DE OPCIONES <<<");
        System.out.printf("\n1. Sumar ");
        System.out.printf("\n2. Restar ");
        System.out.printf("\n3. Multiplicar ");
    }
    
    public static int funcion_suma(int n1, int n2){ //función suma pasando dos números por parámetro
        
        int suma;
        suma = n1 + n2;
        return suma;
    }
    public static int funcion_resta(int n1, int n2){ //función resta pasando dos números por parámetro
        
        int resta;
        resta = n1 - n2;
        return resta;
    }
    public static int funcion_multiplicar(int n1, int n2){ //función multiplicar pasando dos números por parámetro
        
        int multiplicar;
        multiplicar = n1 * n2;
        return multiplicar;
    }
}
