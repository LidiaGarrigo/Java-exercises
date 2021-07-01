package Ejercicios;

/**
 *
 * @author lidiags
 */
public class Ejercicio19 {
    public static void main(String[] args) { //método main
        
        int array [] = new int [] {7, 8, 6, 3, 1, 4};
        
        float resultado = funcion_media(array); 
        //almacenamos la llamada de la función con un array como parámetro, en la variable resultado
        
        System.out.println("La media de los números del array es de: " + resultado);
        //El programa principal muestra la media por pantalla
    }
    //para funciones y métodos:
    public static float funcion_media(int array[]){ //función que recibe como parámetro un array con números
        float media = 0; //variable tipo float por los decimales
        
        for (int i = 0; i < array.length; i++) { //recorremos el array
            media += array[i]; //sumamos todos los números
        }
        return media/array.length; //devuelve la media de los números que tiene el array
    }
}
