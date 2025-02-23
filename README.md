# Jerarquía de Clases: Vehículos

## Descripción
Crea una jerarquía de clases para representar diferentes tipos de vehículos. Cada vehículo tiene características comunes como la marca, el modelo y la capacidad de combustible, pero cada tipo tiene sus propias características y comportamientos.

## Clases a Implementar

### 1. Clase Base: `Vehiculo`
- **Propiedades Comunes:**
  - `marca` (String)
  - `modelo` (String)
  - `capacidadCombustible` (Int)
- **Métodos:**
  - `mostrarInformacion()`: Imprime la información del vehículo.
  - `calcularAutonomia()`: Retorna un valor `Int` (suponiendo que cada litro de combustible permite recorrer 10 km).

### 2. Clase Derivada: `Automovil` (hereda de `Vehiculo`)
- **Propiedad Específica:**
  - `tipo` (String), por ejemplo: "Sedán", "SUV", "Deportivo", etc.
- **Método Sobrescrito:**
  - `calcularAutonomia()`: Un automóvil puede recorrer 100 km más que el cálculo realizado en su clase base.

### 3. Clase Derivada: `Motocicleta` (hereda de `Vehiculo`)
- **Propiedad Específica:**
  - `cilindrada` (Int)
- **Método Sobrescrito:**
  - `calcularAutonomia()`: Una motocicleta puede recorrer 40 km menos que el cálculo realizado en su clase base.
