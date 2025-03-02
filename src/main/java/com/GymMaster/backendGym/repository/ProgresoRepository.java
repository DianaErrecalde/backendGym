package com.GymMaster.backendGym.repository;

import com.GymMaster.backendGym.entity.Progreso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgresoRepository extends JpaRepository <Progreso, Long> {
}
