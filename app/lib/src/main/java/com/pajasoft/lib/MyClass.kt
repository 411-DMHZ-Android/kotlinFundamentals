package com.pajasoft.lib
/* 1. Crea un programa, que tenga un precio de comida y un porcentaje de propina.
      e imprimir cuanto es el total a pagar
 */
// String Interpolation
//QUE ES UN HILO: Es el espacio donde corre en tu programa
fun main() {
    println("Hola mundo")
    // 1.
    val price : Double = 150.0
    val percentage : Double = 0.10
    val tip: Double = price * percentage
    val total : Double = price + tip
    println("El costo de la comida es: $$total")

    /*El portero de la discoteca. Verifica que una persona pueda entrar en la disco.
        solo so es mayor de edad
    */
//    println("Pon una edad")
    val input = readlnOrNull()
    val age = input?.toIntOrNull()  //Si input es nulo
//    if( age == null){
//        println("El numero que pusiste pa, no es un numero entero, insertalo bien!!")
//    }
//    else if (age >18){
//        println("Eres mayor de edad, pasale a la discoteca")
//    }
//    else{
//        println("No puedes pasar pai")
//    }

    //RANGOS!!!!!!
    for(i in 1..10) {
        print(i)
    }

    //Ciclo for al reves
    for(i in 10 downTo 2){
        println(i)
    }
    for(i in 100 downTo 0 step 10) {
        println(i)
    }

    //Utilizar when en lugar de if else
    when (age){
        null-> println("El numero que pusiste pa, no es un numero entero, insertalo bien!!")
        in 18..Integer.MAX_VALUE-> println("Entrale") //Integer.MAX_VALUE para poner infinito
        else -> println("No puedes pasar pai")
    }

    var counter : Int=12
    while(counter < 20){
        println("El econtador es menor que 20")
        counter++
    }
    //Do while --> primero ejecuta el bloque de codigo y despues evalua la condicion
    //Operadores logicos: && ||
    //Operadores arimetico: + - * / %
    do {
        println("El contado vale menos de 30")
        counter++
    }
        while (counter < 30 )
    //Determinar si un número ingresado por el usuario es un número primo
}