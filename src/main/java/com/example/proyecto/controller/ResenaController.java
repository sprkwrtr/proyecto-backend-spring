package com.example.proyecto.controller;

import com.example.proyecto.entity.Resena;
import com.example.proyecto.repository.ResenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resenas")
public class ResenaController {

    @Autowired
    private ResenaRepository resenaRepository;

    @PostMapping
    public Resena guardarResena(@RequestBody Resena resena) {
        return resenaRepository.save(resena);
    }

    @GetMapping
    public List<Resena> obtenerResenas() {
        return resenaRepository.findAll();
    }
}