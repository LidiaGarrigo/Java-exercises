package Ejercicios;

/**
 *
 * @author lidiags
 */
public class Ejercicio18 {
    public static void main(String[] args) { //método main

        String alumnos[][] = {{"Júlia", "Cristina", "María"}, //matriz con nombres de personas
            {"Jordi", "Natália", "Mireia"}, 
            {"Judit", "Núria", "Eduard"}};
        
        Boolean nombre = funcion_nombre(alumnos, "Carla"); //almacenamos la llamada de la función
        
        if (nombre == true){ //el programa principal indica si dicho nombre está dentro de la matriz
            System.out.println("El nombre introducido sí consta como alumno.");
        } else{
            System.out.println("El nombre introducido no consta como alumno.");
        }
    }
    //para funciones y métodos:
    public static boolean funcion_nombre(String matriz[][], String nombre){ 
                        //función que recibe por parámetro dos argumentos(una matriz, y un nombre)

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { // 2 for anidados para recorrer la matriz
               if(nombre == matriz[i][j]){
                   return true; //Si coincide el nombre devuelve true
               } else{
                  
               }
            }
        }
        return false; //Si no coincide el nombre devuelve false
    }
}
