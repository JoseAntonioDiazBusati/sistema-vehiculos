package org.example

open class Vehiculo(
    val marca: String, val modelo: String, val capacidadCombustible: Int) {
    open fun mostrarInformacion() {
        println("Marca: $marca, Modelo: $modelo, Capacidad de Combustible: $capacidadCombustible L")
    }

    open fun calcularAutonomia(): Int {
        return capacidadCombustible * 10
    }
}