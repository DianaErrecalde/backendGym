package com.GymMaster.backendGym.repository;

import com.GymMaster.backendGym.entity.Progreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgresoRepository extends JpaRepository <Progreso, Long> {
}
