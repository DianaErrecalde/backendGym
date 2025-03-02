package com.GymMaster.backendGym.controller;

import com.GymMaster.backendGym.entity.Ejercicio;
import com.GymMaster.backendGym.request.NuevoEjercicio;
import com.GymMaster.backendGym.service.EjercicioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ejercicios")
public class EjercicioController {
    private EjercicioService ejercicioService;

    public EjercicioController (EjercicioService ejercicioService){
        this.ejercicioService = ejercicioService;
    }

    @PostMapping
    public ResponseEntity <?> nuevoEjercicio(@RequestBody NuevoEjercicio nuevo){
        Ejercicio insertado = this.ejercicioService.crearNuevo(nuevo);
        return new ResponseEntity<>(insertado, HttpStatus.OK);
    }
}
