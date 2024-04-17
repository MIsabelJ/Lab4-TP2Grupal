package com.TPGrupal2.Productos.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Domicilio extends Base{
    private String calle;
    private int numero;
    private int cp;
    @ManyToOne
    private Localidad localidad;
}
