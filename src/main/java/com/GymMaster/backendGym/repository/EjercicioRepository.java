package com.GymMaster.backendGym.repository;

import com.GymMaster.backendGym.entity.Ejercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface EjercicioRepository extends JpaRepository <Ejercicio, Long> {
    @Transactional
    @Query(value = "INSERT INTO ejercicio (nombre) VALUES (:nombre) RETURNING id_ejercicio, nombre", nativeQuery = true)
    Ejercicio insertarEjercicio(@Param("nombre") String nombre);
}
