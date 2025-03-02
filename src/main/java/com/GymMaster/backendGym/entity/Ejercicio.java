package com.GymMaster.backendGym.entity;

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

    @Column(name ="nombre", nullable = false, unique = true, length = 100)
    private String nombre;
}
