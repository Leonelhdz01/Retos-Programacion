"""
* Escribe un programa que se encargue de comprobar si un número es o no primo.
* Hecho esto, imprime los números primos entre 1 y 100.
"""
# recorremos los num del 2 al 100
for i in range(2, 101):

    #asumimos que el numero es primo
    esPrimo = True

    #comprobamos divisores
    for j in range(2, i):

        #si la division es excata
        if i % j == 0:

            #entonces NO es primo
            esPrimo = False

    #si sigue siendo primo lo imprimimos
    if esPrimo:
        print(i)
