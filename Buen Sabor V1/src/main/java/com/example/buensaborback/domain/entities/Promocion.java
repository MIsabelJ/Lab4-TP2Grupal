package com.example.buensaborback.domain.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Promocion extends Base {

    private String denominacion;
    @Schema(type = "string", format = "date", pattern = "dd/MM/yyyy", description = "Fecha de inicio en formato dd/MM/yyyy")
    private LocalDate fechaDesde;
    @Schema(type = "string", format = "date", pattern = "dd/MM/yyyy", description = "Fecha de fin en formato dd/MM/yyyy")
    private LocalDate fechaHasta;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de apertura en formato HH:mm:ss")
    private LocalTime horaDesde;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de cierre en formato HH:mm:ss")
    private LocalTime horaHasta;
    private Double descuento;

    // RELACIONES

    // Sucursal
    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

    // Articulos Manufacturados
    @ManyToMany
    @JoinTable(name = "promocion_articuloManufacturado",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articuloManufacturado_id"))
    private Set<ArticuloManufacturado> articuloManufacturados;

    // Articulos Insumos
    @ManyToMany
    @JoinTable(name = "promocion_articuloInsumo",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articuloInsumo_id"))
    private Set<ArticuloInsumo> articulosInsumos;

}
