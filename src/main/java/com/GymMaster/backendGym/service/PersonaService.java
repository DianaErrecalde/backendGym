package com.GymMaster.backendGym.service;

import com.GymMaster.backendGym.repository.PersonaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    private PersonaRepository personaRepo;

    public PersonaService(PersonaRepository personaRepo){
        this.personaRepo = personaRepo;
    }

}
