package com.axeldesarrolador.concesionaria_baic.persistence;

import com.axeldesarrolador.concesionaria_baic.logica.Automovil;
import com.axeldesarrolador.concesionaria_baic.logica.Vehiculo;
import com.axeldesarrolador.concesionaria_baic.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;



public class ControladoraPersistencia {

    VehiculoJpaController vehiculoJPA = new VehiculoJpaController();

    // Traer todos los registros sin distinción
    public List<Vehiculo> traerVehiculos() {
        return vehiculoJPA.findVehiculoEntities();
    }

    // Filtrar por tipo usando una consulta JPA (Query)
    public List<Vehiculo> traerPorTipo(String tipo) {
        EntityManager em = vehiculoJPA.getEntityManager();
        try {
            // JPA filtra automáticamente por la clase hija (Automovil o Camioneta)
            if (tipo.equals("Automovil")) {
                return em.createQuery("SELECT a FROM Automovil a", Vehiculo.class).getResultList();
            } else {
                return em.createQuery("SELECT c FROM Camioneta c", Vehiculo.class).getResultList();
            }
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public void crearVehiculo(Vehiculo vehiculo) {

        vehiculoJPA.create(vehiculo);

    }

    public void borrarVehiculo(int idVehiculo) {

        try {
            vehiculoJPA.destroy(idVehiculo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void editarVehiculo(Vehiculo vehiculo) {

        try {
            vehiculoJPA.edit(vehiculo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   public Vehiculo traerVehiculo(int idVehiculo) {
    // Usamos findVehiculo para que JPA busque el registro por su ID
    return vehiculoJPA.findVehiculo(idVehiculo);
}
}
