package com.GymMaster.backendGym.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="personas")
@AllArgsConstructor
@NoArgsConstructor

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_persona;

}
