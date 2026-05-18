"""
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
"""

#palabras a comparar (perro/perro, amor/roma, ropa/paro)
palabra1 = "ropa"
palabra2 = "paro"

#sin son exactamente iguales NO cuenta como un anagrama
if palabra1 == palabra2:
    print("No es un anagrama")
else:
    
    #ordenamos las letras
    letras1 = sorted(palabra1)
    letras2 = sorted(palabra2)


    #comparamos las listas ordenadas
    if letras1 == letras2:
        print("Si es un anagrama")
    else:
        print("No es un anagrama")
