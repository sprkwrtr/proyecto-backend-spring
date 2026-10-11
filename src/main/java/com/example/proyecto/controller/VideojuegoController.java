package com.example.proyecto.controller;

import com.example.proyecto.entity.Videojuego;
import com.example.proyecto.repository.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {

    @Autowired
    private VideojuegoRepository videojuegoRepository;

    // Método para CREAR y guardar un nuevo videojuego
    @PostMapping
    public Videojuego guardarVideojuego(@RequestBody Videojuego videojuego) {
        return videojuegoRepository.save(videojuego);
    }

    // Método para OBTENER todos los videojuegos del catálogo
    @GetMapping
    public List<Videojuego> obtenerVideojuegos() {
        return videojuegoRepository.findAll();
    }
}