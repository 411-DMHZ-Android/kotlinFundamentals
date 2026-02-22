package com.pajasoft.lib

// EJERCICIO 1: Variables y Tipos de Datos
// ==========================================
// Declara las siguientes variables con los valores indicados:
// - nombre: "Carlos" (String)
// - edad: 21 (Int)
// - estatura: 1.78 (Double)
// - esEstudiante: true (Boolean)
//
// Imprime un mensaje que diga:
// "Me llamo Carlos, tengo 21 años, mido 1.78m y es true que soy estudiante."
// Usa string templates ($variable) para construir el mensaje.

fun main() {
    val nombre: String = "Carlos"
    val edad: Int = 21
    val estatura: Double = 1.78
    val esEstudiante: Boolean = true

    // TODO: Usa println con string templates para imprimir el mensaje
    println("Me llamo $nombre, tengo $edad años, mido $estatura y es $esEstudiante que soy estudiante.")
}