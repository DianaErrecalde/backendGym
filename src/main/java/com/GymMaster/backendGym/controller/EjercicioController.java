package com.GymMaster.backendGym.controller;

import com.GymMaster.backendGym.entity.Ejercicio;
import com.GymMaster.backendGym.request.NuevoEjercicio;
import com.GymMaster.backendGym.service.EjercicioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{nombre}")
    public ResponseEntity <?> buscarPorNombre(@PathVariable String nombre){
        Ejercicio ejercicio = this.ejercicioService.buscarPorNombre(nombre);
        return new ResponseEntity<>(ejercicio, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity <?> buscarTodos(){
        List<Ejercicio> ejercicios = this.ejercicioService.buscarTodos();
        return new ResponseEntity<>(ejercicios, HttpStatus.OK);
    }

    @DeleteMapping("/{nombre}")
    public ResponseEntity <?> eliminarPorNombre(@PathVariable String nombre){
        Ejercicio ejercicio = this.ejercicioService.eliminarPorNombre(nombre);
        return new ResponseEntity<>(ejercicio,HttpStatus.OK);
    }

}
