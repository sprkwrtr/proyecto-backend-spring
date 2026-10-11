package com.example.proyecto.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "videojuegos")
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVideojuego;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(length = 100)
    private String desarrollador;

    @Column(length = 50)
    private String genero;
}