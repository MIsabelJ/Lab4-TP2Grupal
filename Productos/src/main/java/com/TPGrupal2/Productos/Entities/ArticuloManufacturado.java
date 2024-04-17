package com.TPGrupal2.Productos.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloManufacturado extends Base{
    private String denominacion;
    private String descripcion;
    private double precioVenta;
    private int tiempoEstimadoMinutos;
    @ManyToMany
    private List<Promocion> promociones;
    @OneToOne
    private Imagen imagen;
    @ManyToOne
    private UnidadMedida unidadMedida;

}
