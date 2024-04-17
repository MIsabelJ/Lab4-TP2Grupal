package com.TPGrupal2.Productos.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categoria extends Base{
    private String denominacion;
    @OneToMany
    private List<Categoria> subcategoria;
    @OneToMany
    private List<ArticuloManufacturado> articuloManufacturados;
}
