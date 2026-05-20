/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Ejercicio04 {

    public static void main(String[] args) {

        // recorremos los num del 2 al 100
        for (int i = 2; i <= 100; i++) {

            // asumimos que el num es primo
            boolean esPrimo = true;

            // comprobamos divisores
            for (int j = 2; j < i; j++) {

                // si la division es exacta
                if (i % j == 0) {

                    // entonces NO es primo
                    esPrimo = false;
                }
            }
            // si sigue siendo primo lo imprimimos
            if (esPrimo) {
                System.out.println(i);
            }

        }
    }

}
