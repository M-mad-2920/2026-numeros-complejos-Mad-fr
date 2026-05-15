package org.example

class Complejo(private var real: Double=0.0, private var imaginario: Double=0.0) {
    fun inicializar(real: Double, imaginario:Double){
        this.real=real
        this.imaginario=imaginario
    }
    fun mostrar(){
        println (this.toString())
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
     fun restar(otro: Complejo): Complejo {
        return Complejo(
            real - otro.real,
            imaginario - otro.imaginario
        )
    }
    fun multiplicar(otro: Complejo): Complejo {
        val nuevoReal = (this.real * otro.real) - (this.imaginario * otro.imaginario)
        val nuevoImaginario = (this.real * otro.imaginario) + (this.imaginario * otro.real)
        return Complejo(nuevoReal, nuevoImaginario)
    }
    fun dividir(otro: Complejo): Complejo {
        val denominador = (otro.real * otro.real) + (otro.imaginario * otro.imaginario)
        val nuevoReal = ((this.real * otro.real) + (this.imaginario * otro.imaginario)) / denominador
        val nuevoImaginario = ((this.imaginario * otro.real) - (this.real * otro.imaginario)) / denominador
        return Complejo(nuevoReal, nuevoImaginario)
    }
}

fun main() {
    val c1 = Complejo(3.0, 4.0)
    val c2 = Complejo(1.0, 2.0)

    println("Suma:")
    val suma = c1.sumar(c2)
    suma.mostrar()

    println("Resta:")
    val resta = c1.restar(c2)
    resta.mostrar()

    println("Multiplicación:")
    val producto = c1.multiplicar(c2)
    producto.mostrar()

    println("División:")
    val cociente = c1.dividir(c2)
    cociente.mostrar()
}