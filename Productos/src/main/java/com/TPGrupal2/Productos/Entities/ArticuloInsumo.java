package com.TPGrupal2.Productos.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ArticuloInsumo extends Base{

    private String denominacion;
    private double precioCompra;
    private double precioVenta;
    private int stockMaximo;
    private int stockActual;
    @ManyToMany
    private List<Promocion> promociones;
    @OneToOne
    private Imagen imagen;
    @ManyToOne
    private UnidadMedida unidadMedida;
}
