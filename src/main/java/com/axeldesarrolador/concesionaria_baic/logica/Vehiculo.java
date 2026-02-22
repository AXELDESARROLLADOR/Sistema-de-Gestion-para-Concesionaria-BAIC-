package com.axeldesarrolador.concesionaria_baic.logica;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_vehiculo")
public abstract class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected int id;
    private String tipo;
    private String color;
    private String motor;
    private String modelo; 
    private String opcion_compra;
    private int cantidad_puertas;
    private int cantidad_disponible;  
    private String pantalla_tactil;    
    private String camara_trasera;
    
    public Vehiculo() {
    }

    public Vehiculo(int id, String tipo, String color, String motor, String modelo, String opcion_compra, int cantidad_puertas, int cantidad_disponible, String pantalla_tactil, String camara_trasera) {
        this.id = id;
        this.tipo = tipo;
        this.color = color;
        this.motor = motor;
        this.modelo = modelo;
        this.opcion_compra = opcion_compra;
        this.cantidad_puertas = cantidad_puertas;
        this.cantidad_disponible = cantidad_disponible;
        this.pantalla_tactil = pantalla_tactil;
        this.camara_trasera = camara_trasera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOpcion_compra() {
        return opcion_compra;
    }

    public void setOpcion_compra(String opcion_compra) {
        this.opcion_compra = opcion_compra;
    }

    public int getCantidad_puertas() {
        return cantidad_puertas;
    }

    public void setCantidad_puertas(int cantidad_puertas) {
        this.cantidad_puertas = cantidad_puertas;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public String getPantalla_tactil() {
        return pantalla_tactil;
    }

    public void setPantalla_tactil(String pantalla_tactil) {
        this.pantalla_tactil = pantalla_tactil;
    }

    public String getCamara_trasera() {
        return camara_trasera;
    }

    public void setCamara_trasera(String camara_trasera) {
        this.camara_trasera = camara_trasera;
    }

   
    
    
    
    
}
