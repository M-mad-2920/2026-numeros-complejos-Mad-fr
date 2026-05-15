package org.example

class Complejo(private var real: Int=0, private var imaginario: Int=0) {
    fun inicializar(real: Int, imaginario:Int){
        this.real=real
        this.imaginario=imaginario
    }
    fun mostrar(){
        println(this.toString())
    }
    override fun toString(): String {
        return "(${real},${imaginario})"
    }
    fun sumar(otro: Complejo): Complejo {
        return Complejo(
            real + otro.real,
            imaginario + otro.imaginario
        )
    }
}

fun main() {
    var complejo: Complejo
    complejo=Complejo()
    complejo.inicializar(3,4)
    println("El número complejo es: ${complejo.toString()}")
    println("hola")
    println("hola2.1")
    var c2: Complejo=Complejo(3,3)
    var c3: Complejo
    c3=complejo.sumar(c2)
    c3.mostrar()
}
