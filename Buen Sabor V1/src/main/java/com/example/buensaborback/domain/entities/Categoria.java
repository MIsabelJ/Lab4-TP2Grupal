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
@ToString
@Builder
public class Categoria extends Base{

    private String denominacion;

    // RELACIONES

    // Articulos Insumos
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoria")
    @Builder.Default
    private Set<ArticuloInsumo> articuloInsumos = new HashSet<>();

    // Articulos Manufacturados
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoria")
    @Builder.Default
    private Set<ArticuloManufacturado> articuloManufacturados = new HashSet<>();

    // Recursividad en categorías (categoría y subcategoría)
    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    private Categoria categoriaPadre;

    @OneToMany(mappedBy = "categoriaPadre", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private Set<Categoria> subcategorias = new HashSet<>(); //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA

    // Sucursales
    @ManyToMany(mappedBy = "categorias")
    @Builder.Default //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    private Set<Sucursal> sucursales = new HashSet<>();
}
