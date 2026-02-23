package com.pajasoft.lib

import kotlin.math.sin

// EJERCICIO 4: Bucle for con rangos
// ========================================
// Imprime la tabla de multiplicar del 7 (del 1 al 10).
//
// Salida esperada:
// 7 x 1 = 7
// 7 x 2 = 14
// 7 x 3 = 21
// ...
// 7 x 10 = 70

fun main() {
    val numero = 7

    // TODO: Usa un for con el rango 1..10 e imprime cada linea
    for (i in 1..10) {
        // Imprime: "$numero x $i = ${numero * i}"
        println("$numero * $i = ${numero * i}")

    }
}

