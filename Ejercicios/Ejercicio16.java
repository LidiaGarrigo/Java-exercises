package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio16 {
    public static void main(String[] args) { //método main
        
        Scanner teclado = new Scanner(System.in); //activamos Scanner
        
        System.out.print("Introduzca un número: ");
        int numero = teclado.nextInt(); //almacenamos el número introducido
        teclado.close();
        
        if (esPar(numero)){
            System.out.println("El " + numero + " es par.");
        }
        else {
            System.out.println("El " + numero + " es impar.");
        }
    }
    
    //para funciones y métodos:
    
    public static boolean esPar(int numero){ //función que recibe un número por parámetro
        
            if((numero%2)==0){ 
                return true; //devuelve true si es par
            
        }
        return false; //devuelve false si es impar
    }
}
