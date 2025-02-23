package org.example

fun main() {
    val auto = Automovil("Toyota", "Corolla", 50, "Turismo")
    val moto = Motocicleta("Honda", "H4", 32, 250)

    auto.mostrarInformacion()
    println("Autonomía: ${auto.calcularAutonomia()} km\n")

    moto.mostrarInformacion()
    println("Autonomía: ${moto.calcularAutonomia()} km")
}