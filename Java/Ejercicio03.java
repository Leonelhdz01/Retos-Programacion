/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Ejercicio03 {

    public static void main(String[] args) {

        // primeros numeros de Fibonacci
        long firstNumber = 0;
        long secondNumber = 1;
        
        // Repetimos el proceso 50 veces
        for (int i = 0; i < 50; i++) {

            // Imprimimos el numero actual de Fibonacci
            System.out.println(firstNumber);

            // Calculamos el siguiente num sumando los dos anteriores
            long newNumber = firstNumber + secondNumber;

            //movemos los valores
            firstNumber = secondNumber;
            secondNumber = newNumber;

        }
    }
    
}
