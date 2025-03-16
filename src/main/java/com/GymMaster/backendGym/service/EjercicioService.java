package com.GymMaster.backendGym.service;

import com.GymMaster.backendGym.entity.Ejercicio;
import com.GymMaster.backendGym.repository.EjercicioRepository;
import com.GymMaster.backendGym.request.NuevoEjercicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjercicioService {
    private EjercicioRepository ejercicioRepo;

    public EjercicioService(EjercicioRepository ejercicioRepo) {
        this.ejercicioRepo = ejercicioRepo;
    }

    public Ejercicio crearNuevo (NuevoEjercicio nuevo){
        this.ejercicioRepo.insertarEjercicio(nuevo.getNombre());
        return this.buscarPorNombre(nuevo.getNombre());
    }

    public Ejercicio buscarPorNombre(String nombre){
        return this.ejercicioRepo.buscarPorNombre(nombre);
    }

    public List<Ejercicio> buscarTodos(){
        return this.ejercicioRepo.listarTodos();
    }

    public Ejercicio cambiarEstadoPorNombre(String nombre, boolean enDesuso){
        this.ejercicioRepo.cambiarEstadoPorNombre(nombre, enDesuso);
        return this.buscarPorNombre(nombre);
    }
}
