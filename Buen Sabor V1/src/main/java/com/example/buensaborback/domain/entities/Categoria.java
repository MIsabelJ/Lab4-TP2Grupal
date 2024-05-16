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
//@Builder
public class Categoria extends Base{

    private String denominacion;

    // RELACIONES

    // Recursividad en categorías (categoría y subcategoría)
    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    private Categoria categoriaPadre;

    @OneToMany(mappedBy = "categoriaPadre", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Categoria> subcategorias;

    // Sucursales
    @ManyToMany
    @JoinTable(name = "sucursal_categoria",
            joinColumns = @JoinColumn(name = "categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursal_id"))
    @ToString.Exclude
    private Set<Sucursal> sucursales;
}
