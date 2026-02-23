package com.pajasoft.lib

// EJERCICIO 3: Expresion when
// ========================================
// Dada una lista de numeros del 1 al 7, convierte cada uno al nombre
// del dia de la semana usando "when".
// Si el numero no esta en el rango 1-7, imprime "Dia no valido".
//
// 1 = Lunes, 2 = Martes, 3 = Miercoles, 4 = Jueves,
// 5 = Viernes, 6 = Sabado, 7 = Domingo
//
// Salida esperada:
// 1 -> Lunes
// 4 -> Jueves
// 7 -> Domingo
// 9 -> Dia no valido

fun main() {
    val dias = listOf(1, 4, 7, 9, 3, 6)

    for (d in dias) {
        val nombre = when (d) {
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            // TODO: Completa los dias restantes (4-7) y el else
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sabado"
            7 -> "Domingo"
            else -> "Dia no valido"
        }

        println("$d -> $nombre")
    }
}
