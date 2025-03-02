package com.GymMaster.backendGym.service;

import com.GymMaster.backendGym.entity.Rutina;
import com.GymMaster.backendGym.repository.RutinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RutinaService {

    private RutinaRepository rutinaRepo;

    public RutinaService(RutinaRepository rutinaRepo) {
        this.rutinaRepo = rutinaRepo;
    }

}