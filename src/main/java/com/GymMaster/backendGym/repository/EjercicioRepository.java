package com.GymMaster.backendGym.repository;

import com.GymMaster.backendGym.entity.Ejercicio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EjercicioRepository extends JpaRepository <Ejercicio, Long> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO ejercicios (nombre) VALUES (:nombre)", nativeQuery = true)
    void insertarEjercicio(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM ejercicios WHERE nombre = :nombre", nativeQuery = true)
    Ejercicio buscarPorNombre(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM ejercicios ORDER BY id_ejercicio", nativeQuery = true)
    List<Ejercicio> listarTodos();

    @Transactional
    @Modifying
    @Query(value = "UPDATE ejercicios SET en_desuso = :enDesuso WHERE nombre = :nombre", nativeQuery = true)
    void cambiarEstadoPorNombre(@Param("nombre") String nombre, @Param("enDesuso") boolean enDesuso);

}
