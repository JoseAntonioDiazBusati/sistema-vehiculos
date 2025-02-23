package org.example

class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, val cilindrada: Int): Vehiculo(marca, modelo, capacidadCombustible) {
    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Cilindrada: ${cilindrada}cc")
    }

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }
}