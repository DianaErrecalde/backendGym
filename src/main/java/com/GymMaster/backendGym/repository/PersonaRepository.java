package com.GymMaster.backendGym.repository;

import com.GymMaster.backendGym.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
