package com.calificacionservice.repositories;

import com.calificacionservice.entities.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalificacionRepository extends JpaRepository<Calificacion,Long> {

    List<Calificacion> findByUsuarioId(String usuarioId);
    List<Calificacion> findByHotelId(String hotelId);
}
