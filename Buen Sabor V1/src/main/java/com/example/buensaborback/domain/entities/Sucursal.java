package com.example.buensaborback.domain.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
//@Builder
public class Sucursal extends Base{

    private String nombre;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de apertura en formato HH:mm:ss")
    private LocalTime horarioApertura;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de cierre en formato HH:mm:ss")
    private LocalTime horarioCierre;

    // RELACIONES

    // Domicilio
    @OneToOne
    private Domicilio domicilio;

    // Empresa
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

//    // Categorias
//    @ManyToMany
//    @JoinTable(name = "sucursal_categoria",
//            joinColumns = @JoinColumn(name = "sucursal_id"),
//            inverseJoinColumns = @JoinColumn(name = "categoria_id"))
//    private Set<Categoria> categorias;
//
//    // Promociones
//    @OneToMany(cascade =  CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sucursal")
//    private Set<Promocion> promociones;
}
