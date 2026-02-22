package com.axeldesarrolador.concesionaria_baic.logica;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Camioneta")
public class Camioneta extends Vehiculo {

    public Camioneta() {
    }

    public Camioneta(int id, String tipo, String color, String motor, String modelo, String opcion_compra, int cantidad_puertas, int cantidad_disponible, String pantalla_tactil, String camara_trasera) {
        super(id, tipo, color, motor, modelo, opcion_compra, cantidad_puertas, cantidad_disponible, pantalla_tactil, camara_trasera);
    }

}
