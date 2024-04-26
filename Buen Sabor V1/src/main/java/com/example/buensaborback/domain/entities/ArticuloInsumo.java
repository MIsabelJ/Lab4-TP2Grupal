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
public class ArticuloInsumo extends Base{

    private String denominacion;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    // RELACIONES

    // Unidad de medida
    @ManyToOne
    @JoinColumn(name = "unidadMedida_id")
    private UnidadMedida unidadMedida;

    // Categoria
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    // Imagen
    @OneToOne
    private Imagen imagen;

    // Promociones
    @ManyToMany(mappedBy = "articulosInsumos")
    @Builder.Default // SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    private Set<Promocion> estaEnPromociones = new HashSet<>();

    // Articulos Manufacturados
    @ManyToMany(mappedBy = "articulosInsumos")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<ArticuloManufacturado> articuloManufacturados = new HashSet<>();
}
