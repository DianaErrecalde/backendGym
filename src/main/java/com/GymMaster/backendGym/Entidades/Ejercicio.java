package com.GymMaster.backendGym.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="ejercicios")
@AllArgsConstructor
@NoArgsConstructor

public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ejercicio;
}
