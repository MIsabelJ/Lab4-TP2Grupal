package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class ArticuloManufacturado extends Articulo{

    private String denominacion;
    private String descripcion;
    private Double precioVenta;
    private Integer tiempoEstimadoMinutos;

    // Articulos Insumos
    @ManyToMany
    @JoinTable(name = "articuloManufacturado_articuloInsumo",
            joinColumns = @JoinColumn(name = "articuloManufacturado_id"),
            inverseJoinColumns = @JoinColumn(name = "articuloInsumo_id")) //SE AGREGA EL JOIN TABLE PARA QUE JPA CREE LA TABLA INTERMEDIA EN UNA RELACION MANY TO MANY

    private Set<ArticuloInsumo> articulosInsumos = new HashSet<>();

    // Promociones
    @ManyToMany(mappedBy = "articuloManufacturados")
    private Set<Promocion> estaEnPromociones;

 /*   @Builder
    public ArticuloManufacturado(Imagen imagen, UnidadMedida unidadMedida, Categoria categoria, String denominacion, String descripcion, Double precioVenta, Integer tiempoEstimadoMinutos, Set<ArticuloInsumo> articulosInsumos, Set<Promocion> estaEnPromociones) {
        super(imagen, unidadMedida, categoria);
        this.denominacion = denominacion;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.articulosInsumos = articulosInsumos;
        this.estaEnPromociones = estaEnPromociones;
    }*/
}
