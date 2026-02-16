package com.pajasoft.lib

//Tipos de clases -->
//Principios de POO --> Herencia, Polimorfismo, Encapsulamiento, Abstracción

//(val name : String, val age: Int) ---> Es un constructor
class Person(val name : String, val age: Int){
    fun sayHello(){
        println("Hola soy $name y tengo $age")
    }
}


/*Metodos en Kotlin
 --> Se definen con una palabla clase FUN,
 --> Para regresar un dato se utiliza : Tipo de Dato
 */

//Abstracción --> Modelas solo lo IMPORTANTE
//Una clase abstract --> No pueden instanciar objetos
abstract class Shape{ //Se pueden pasar valores
    abstract fun calculateArea() : Double
}

//Herencia --> Circle utiliza la clase abstraccion de Shape
class Circle(val radius : Double) : Shape(){
    override fun calculateArea(): Double {
        return  radius * radius * Math.PI
    }
}

class Square (val side : Double) : Shape(){
    override fun calculateArea(): Double {
        return  side * side
    }
}

//Que es una interfaz grafica --> Es un contrato , le dice a una lase que es lo que tiene que hacer y se compromete a eso
interface Ave{
    fun fly()
    fun poop()
    fun peep()
    fun codito()
}

final class Eagle : Ave { //final --> Significa que otra clase no puede heredar, es la unica
    override fun fly() { //Metodos implementados
        TODO("Not yet implemented")
    }

    override fun poop() {
        TODO("Not yet implemented")
    }

    override fun peep() {
        TODO("Not yet implemented")
    }

    override fun codito() {
        TODO("Not yet implemented")
    }
}

open class Aniaml (val name : String){ //se puede Implementar un metodo por defecto, tambien si se pueden distanciar
    open fun makeSOund(){
        println("$name esta haciendo un sonido")
    }
}

class Dog : Aniaml(name = "Max"){

}

class Cat(val catName : String) : Aniaml(name = catName){
    fun trepar(stairs : Int, place : String){ //argumentos
        println("$name trepo $stairs escalones en $place")
    }
}

fun main(){
    val persona = Person(name ="Juan Francisco", age = 28) //No se puede cambiar el orden de los datos
    val persona2 = Person(age = 28 ,name ="Juan Francisco") //Se4 puede cambiar el orden de los datos
    val aniaml = Aniaml (name = "Animal generico")
    val cat = Cat (catName = "Coco")
    cat.trepar(stairs = 3, place = "La Salle")

    persona.sayHello()
    persona2.sayHello()
    println("El nombre de la persona 1 es ${persona.name}")

    val square1 = Square(side = 34.5)
    val square2 = Square(side = 12.3)
    val circle = Circle(radius = 10.0)
    val shapes = listOf<Shape>(square1,square2,circle) //Polimorfismo --> Cuando varios objetos de distintas clases, derivadas de una superclase común (la clase padre)
    for (shape in shapes){
        println(shape.calculateArea())
    }
}