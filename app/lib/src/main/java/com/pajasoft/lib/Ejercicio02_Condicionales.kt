package com.pajasoft.lib

// EJERCICIO 2: Condicionales (if / else)
// ========================================
// Dada una lista de calificaciones, clasifica cada una e imprime su nivel:
//   - Reprobado (0-59)
//   - Suficiente (60-69)
//   - Bien (70-79)
//   - Notable (80-89)
//   - Excelente (90-100)
//
// Salida esperada:
// 45 -> Reprobado
// 72 -> Bien
// 91 -> Excelente
// 60 -> Suficiente
// 85 -> Notable

// mayor >
// menor >
fun main() {
    val calificaciones = listOf(45, 72, 91, 60, 85)

    for (cal in calificaciones) {
        val nivel = if (cal < 60) {
            "Reprobado"
        } else if (cal <= 70) {
            // TODO: Completa
            "Suficiente"
        } else if (cal <= 80) {
            // TODO: Completa
            "Bien"
        } else if (cal <= 90) {
            // TODO: Completa
            "Notable"
        } else if (cal <= 100){
            "Excelente"
        } else {
            // TODO: Completa
            "Ingrese una calificación"
        }

        println("$cal -> $nivel")
    }
}

