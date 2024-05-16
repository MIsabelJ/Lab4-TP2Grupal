package com.example.buensaborback.domain.dtos.DomicilioDto;

import com.example.buensaborback.domain.entities.Localidad;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DomicilioCreateDto {
    private String calle;
    private Integer numero;
    private Integer cp;

    private Long idLocalidad;
}
