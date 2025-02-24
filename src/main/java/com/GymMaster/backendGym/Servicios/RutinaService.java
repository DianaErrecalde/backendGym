package com.GymMaster.backendGym.Servicios;

import com.GymMaster.backendGym.Entidades.Rutina;
import com.GymMaster.backendGym.Repositories.RutinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RutinaService {

    private RutinaRepository rutinaRepo;

    public RutinaService(RutinaRepository rutinaRepo) {
        this.rutinaRepo = rutinaRepo;
    }

   /* public Rutina crearNuevo(Rutina nuevo) {
        if (nuevo.getNombre() == null || nuevo.getNombre().isEmpty() || nuevo.getNombre().isBlank()) {
            return null;
        }
        List<Rutina> encontrados = buscarPorNombre(nuevo.getNombre());
        if(encontrados.isEmpty() ) {
            Rutina nuevar = this.rutinaRepo.save(nuevo);
            return nuevar;
        }
        return null;
    }*/

    public List <Rutina> buscarPorNombre(String nombre) {
        return this.rutinaRepo.findByName(nombre);
    }
}