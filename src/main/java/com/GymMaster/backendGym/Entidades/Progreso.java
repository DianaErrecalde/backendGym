package com.GymMaster.backendGym.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="progresos")
@AllArgsConstructor
@NoArgsConstructor

public class Progreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_progreso;

    @Column(name ="pesoPersona", nullable = false , unique = true, length = 50)
    private String pesoPersona;

    @Column (name="Series" )
    private int series;

    @Column (name ="repeticiones" )
    private int repeticiones;

    @Column (name = "duracion")
    private int duracion;

    @Column (name = "peso")
    private int peso;
}
