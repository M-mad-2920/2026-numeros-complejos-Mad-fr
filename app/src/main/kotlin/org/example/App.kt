package org.example

class Complejo {
    private var real: Int=0
    private var imaginario: Int=0
    fun inicializar(real: Int, imaginario:Int){
        this.real=real
        this.imaginario=imaginario
    }
    override fun toString(): String {
        return "(${real},${imaginario})"
    }
}

fun main() {
    var complejo: Complejo
    complejo=Complejo()
    complejo.inicializar(3,4)
    println("El número complejo es: ${complejo.toString()}")
    println("hola")
}
