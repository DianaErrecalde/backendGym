package com.GymMaster.backendGym.service;

import com.GymMaster.backendGym.repository.ProgresoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProgresoService {

    private ProgresoRepository progresoRepo;

    public ProgresoService(ProgresoRepository progresoRepo){
        this.progresoRepo = progresoRepo;
    }
}
