package com.example.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DespedidaController {

    @GetMapping("/adios")
    public String despedir() {
        return "Adiós, esta es la respuesta de mi segundo controlador.";
    }
}