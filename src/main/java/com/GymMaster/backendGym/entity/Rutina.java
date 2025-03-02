package com.GymMaster.backendGym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "rutinas")
@AllArgsConstructor
@NoArgsConstructor

public class Rutina {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id_rutina;

        @Column (name = "fechaInicio", nullable = false)
        private LocalDate fechaInicio;
}
