package com.GymMaster.backendGym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name="personas")
@AllArgsConstructor
@NoArgsConstructor

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_persona;

    @Column (name = "nombre", nullable = false, unique = true, length = 50)
    private String nombre;

    @Column (name = "apellido", nullable = false, unique = true, length = 50)
    private String apellido;

    @Column (name = "dni", nullable = false, unique = true, length = 8)
    private Integer dni;

    @Column (name = "fechaNac", nullable = false, unique = true, length = 50)
    private LocalDate fechaNac;

    @Column (name = "Email", nullable = false, unique = true, length = 100)
    private String email;

    @Column (name = "sexo", nullable = false, unique = true)
    private boolean sexo;

}
