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
@Builder
public class Categoria extends Base{

    private String denominacion;

    // RELACIONES

    // Articulos Insumos
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoria")
    private Set<ArticuloInsumo> articuloInsumos;

    // Articulos Manufacturados
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoria")
    private Set<ArticuloManufacturado> articuloManufacturados;

    // Recursividad en categorías (categoría y subcategoría)
    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    private Categoria categoriaPadre;

    @OneToMany(mappedBy = "categoriaPadre", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Categoria> subcategorias;

    // Sucursales
    @ManyToMany(mappedBy = "categorias")
    @ToString.Exclude
    private Set<Sucursal> sucursales;
}
