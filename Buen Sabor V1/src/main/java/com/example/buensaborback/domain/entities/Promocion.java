package com.example.buensaborback.domain.entities;

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
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
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
            inverseJoinColumns = @JoinColumn(name = "articuloManufacturado_id")) // SE AGREGA EL JOIN TABLE PARA QUE JPA CREE LA TABLA INTERMEDIA EN UNA RELACION MANY TO MANY
    @Builder.Default // SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    private Set<ArticuloManufacturado> articuloManufacturados = new HashSet<>();

    // Articulos Insumos
    @ManyToMany
    @JoinTable(name = "promocion_articuloInsumo",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articuloInsumo_id"))
    private Set<ArticuloInsumo> articulosInsumos;

}
