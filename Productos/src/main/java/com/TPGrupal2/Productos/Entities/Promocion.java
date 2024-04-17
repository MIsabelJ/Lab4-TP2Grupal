package com.TPGrupal2.Productos.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Promocion extends Base{
    private String demonimacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private int descuento;
    @ManyToMany
    private List<ArticuloManufacturado> articulosManufacturados;
    @ManyToMany
    private List<ArticuloInsumo> articulosInsumos;
}
