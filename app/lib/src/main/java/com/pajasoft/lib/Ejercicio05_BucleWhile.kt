package com.pajasoft.lib

// EJERCICIO 5: Bucle while
// ========================================
// Dado un numero, calcula la suma de sus digitos usando while.
// Mientras el numero sea mayor a 0, extrae el ultimo digito con % 10
// y reduce el numero con / 10.
//
// Salida esperada:
// Suma de digitos de 12345: 15
// Suma de digitos de 9081: 18
// Suma de digitos de 100: 1

fun main() {
    val numeros = listOf(12345, 9081, 100)

    for (n in numeros) {
        var numero = n
        var suma = 0

        // TODO: Mientras numero > 0:
        // - suma el ultimo digito (numero % 10)
        // - reduce numero (numero / 10)
        while (numero > 0) {
            // Completa aqui
            val digito = numero % 10
            suma += digito
            numero /= 10
        }

        println("Suma de digitos de $n: $suma")
    }
}
