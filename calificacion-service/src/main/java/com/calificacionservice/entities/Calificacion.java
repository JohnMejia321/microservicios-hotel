package com.calificacionservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "calificacion")
public class Calificacion {

    @Id
    private String calificacionId;


    private String usuarioId;


    private String hotelId;


    private int calificacion;


    private String observaciones;

}
