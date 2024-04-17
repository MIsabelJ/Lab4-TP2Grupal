package com.TPGrupal2.Productos.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSucursal;
    private String nombre;
    private LocalDate horarioApertura;
    private LocalDate horarioCierre;
    @OneToOne
    private Domicilio domicilio;
    @OneToMany
    private List<Categoria> categorias;
    @OneToMany
    private List<Promocion> promociones;
}
