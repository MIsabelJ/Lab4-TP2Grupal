package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class ArticuloManufacturado extends Base{

    private String denominacion;
    private String descripcion;
    private Double precioVenta;
    private Integer tiempoEstimadoMinutos;

    // RELACIONES

    // Imagen
    @OneToOne
    private Imagen imagen;

    // Unidad de medida
    @ManyToOne
    @JoinColumn(name = "unidadMedida_id")
    private UnidadMedida unidadMedida;

    // Categoria
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    // Articulos Insumos
    @ManyToMany
    @JoinTable(name = "articuloManufacturado_articuloInsumo",
            joinColumns = @JoinColumn(name = "articuloManufacturado_id"),
            inverseJoinColumns = @JoinColumn(name = "articuloInsumo_id")) //SE AGREGA EL JOIN TABLE PARA QUE JPA CREE LA TABLA INTERMEDIA EN UNA RELACION MANY TO MANY
    @Builder.Default //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    private Set<ArticuloInsumo> articulosInsumos = new HashSet<>();

    // Promociones
    @ManyToMany(mappedBy = "articuloManufacturados")
    private Set<Promocion> estaEnPromociones;
}
