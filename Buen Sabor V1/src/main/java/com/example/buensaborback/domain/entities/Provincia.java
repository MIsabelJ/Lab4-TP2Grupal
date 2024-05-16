package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
//@Builder
public class Provincia extends Base{

    private String nombre;

    // RELACIONES

    // Pais
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

}
