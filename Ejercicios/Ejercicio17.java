package Ejercicios;

/**
 *
 * @author lidiags
 */
public class Ejercicio17 {
    public static void main(String[] args) { //método main
        
        int numero[] =  new int [6];
        numero[0] = -23;
        numero[1] = 14;
        numero[2] = 55;
        numero[3] = 74;
        numero[4] = -33;
        numero[5] = 8;
        
        int positivo = positivos(numero); //almacenamos la llamada de la función en una variable
        
        System.out.println("El numero de números positivos del array es de: " + positivo); 
    }
     //para funciones y métodos:
    
     public static int positivos(int array[]) { //función que recibe un array como parámetro

         int positivos = 0;

         for (int i=0; i<array.length; i++){

             if (array[i] >= 0){
                 positivos++; //se va sumando 1 por cada número positivo
                }
            }
         return positivos;  
    }
    
}
