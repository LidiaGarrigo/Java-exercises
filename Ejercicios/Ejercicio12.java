package Ejercicios;

/**
 *
 * @author lidiags
 */
public class Ejercicio12 {

    public static void main(String[] args) { // método main

        int variable = funcion_multiplicar(3);
        // declaramos la variable, almacenamos la función y la llamamos con el valor a
        // multiplicar

        System.out.println("El número inicial multiplicado por 2 es: " + variable);
        // muestra por pantalla el contenido de la variable
    }

    // para funciones y metodos:
    public static int funcion_multiplicar(int numero) { // recibe el número por parámetro

        return numero * 2; // devuelve el numero multiplicado por 2
    }
}
