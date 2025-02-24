package com.GymMaster.backendGym.Repositories;

import com.GymMaster.backendGym.Entidades.Rutina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RutinaRepository extends JpaRepository <Rutina, Long> {

    List<Rutina> findByName(String nombre);
}
