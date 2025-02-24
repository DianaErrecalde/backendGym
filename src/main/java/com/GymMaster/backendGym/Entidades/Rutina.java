package com.GymMaster.backendGym.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "rutinas")
@AllArgsConstructor
@NoArgsConstructor

public class Rutina {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id_rutina;
}
