package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class ArticuloInsumo extends Articulo{

    private String denominacion;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    // Promociones
    @ManyToMany(mappedBy = "articulosInsumos")
    private Set<Promocion> estaEnPromociones;

    // Articulos Manufacturados
    @ManyToMany(mappedBy = "articulosInsumos")
    private Set<ArticuloManufacturado> articuloManufacturados;

    @Builder
    public ArticuloInsumo(Imagen imagen, UnidadMedida unidadMedida, Categoria categoria, String denominacion, Double precioCompra, Double precioVenta, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar, Set<Promocion> estaEnPromociones, Set<ArticuloManufacturado> articuloManufacturados) {
        super(imagen, unidadMedida, categoria);
        this.denominacion = denominacion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
        this.estaEnPromociones = estaEnPromociones;
        this.articuloManufacturados = articuloManufacturados;
    }
}
