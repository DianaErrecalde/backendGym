package com.GymMaster.backendGym.repository;

import com.GymMaster.backendGym.entity.Ejercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjercicioRepository extends JpaRepository <Ejercicio, Long> {

}
