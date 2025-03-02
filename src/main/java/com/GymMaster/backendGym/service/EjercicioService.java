package com.GymMaster.backendGym.service;

import com.GymMaster.backendGym.entity.Ejercicio;
import com.GymMaster.backendGym.repository.EjercicioRepository;
import com.GymMaster.backendGym.request.NuevoEjercicio;
import org.springframework.stereotype.Service;

@Service
public class EjercicioService {
    private EjercicioRepository ejercicioRepo;

    public EjercicioService(EjercicioRepository ejercicioRepo) {
        this.ejercicioRepo = ejercicioRepo;
    }

    public Ejercicio crearNuevo (NuevoEjercicio nuevo){
        Ejercicio ejercicio = new Ejercicio();
        ejercicio.setNombre(nuevo.getNombre());
        return this.ejercicioRepo.save(ejercicio);
    }
}
