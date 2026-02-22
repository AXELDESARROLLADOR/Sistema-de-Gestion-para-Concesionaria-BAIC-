package com.axeldesarrolador.concesionaria_baic.logica;

import static com.axeldesarrolador.concesionaria_baic.logica.Vehiculo_.tipo;
import com.axeldesarrolador.concesionaria_baic.persistence.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearVehiculo(String modelo, String color, String motor,
            int cantidad_disponible, int cantidad_puertas, String opcion_compra,
            String pantalla_tactil, String camara_trasera, String tipo) {

        Vehiculo vehiculo;

        if (tipo.equals("Automovil")) {
            vehiculo = new Automovil();
        } else {
            vehiculo = new Camioneta();
        }

        vehiculo.setModelo(modelo);
        vehiculo.setColor(color);
        vehiculo.setMotor(motor);
        vehiculo.setCantidad_disponible(cantidad_disponible);
        vehiculo.setCantidad_puertas(cantidad_puertas);
        vehiculo.setOpcion_compra(opcion_compra);
        vehiculo.setPantalla_tactil(pantalla_tactil);
        vehiculo.setCamara_trasera(camara_trasera);
        vehiculo.setTipo(tipo);

        controlPersis.crearVehiculo(vehiculo);

    }

    
    public void borrarVehiculo(int idVehiculo) {
        controlPersis.borrarVehiculo(idVehiculo);
    }

    
    public void editarVehiculo(Vehiculo vehiculo, String modelo, String color, String motor,
            int cantidad_disponible, int cantidad_puertas, String opcion_compra, String pantalla_tactil, String camara_trasera) {

        vehiculo.setModelo(modelo);
        vehiculo.setColor(color);
        vehiculo.setMotor(motor);
        vehiculo.setCantidad_disponible(cantidad_disponible);
        vehiculo.setCantidad_puertas(cantidad_puertas);
        vehiculo.setOpcion_compra(opcion_compra);
        vehiculo.setPantalla_tactil(pantalla_tactil);
        vehiculo.setCamara_trasera(camara_trasera);

        controlPersis.editarVehiculo(vehiculo);
    }

    
    public List<Vehiculo> traerVehiculos(String filtro) {
        if (filtro.equals("Todo")) {
            return controlPersis.traerVehiculos();
        } else {
            return controlPersis.traerPorTipo(filtro);
        }
    }

    
    public Vehiculo traerVehiculo(int idVehiculo) {

        return controlPersis.traerVehiculo(idVehiculo);

    }

}
