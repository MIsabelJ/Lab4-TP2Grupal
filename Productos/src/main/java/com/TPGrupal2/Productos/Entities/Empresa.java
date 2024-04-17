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
public class Empresa extends Base{
    private String nombre;
    private String razonSocial;
    private int cuil;
    @OneToMany
    private List<Sucursal> sucursales;
}
