package com.GymMaster.backendGym.repository;

import com.GymMaster.backendGym.entity.Rutina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RutinaRepository extends JpaRepository <Rutina, Long> {
}
