package com.calificacionservice.services;

import com.calificacionservice.entities.Calificacion;

import java.util.List;

public interface CalificacionService {
    Calificacion create(Calificacion calificacion);

    List<Calificacion> getCalificaciones();

    List<Calificacion> getCalificacionesByUsuarioId(String usuarioId);

    List<Calificacion> getCalificacionesByHotelId(String hotelId);
}
