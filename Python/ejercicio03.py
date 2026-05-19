"""
* Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
"""
# primeros numeros de Fibonacci
firstNumber = 0
secondNumber = 1

# Repetimos el proceso 50 veces
for i in range(50):

    #Imprimimos el numero actual de Fibonacci
    print(firstNumber)

    # calculamos el siguiente num
    newNumber = firstNumber + secondNumber

    # Movemos los valores
    firstNumber = secondNumber
    secondNumber = newNumber