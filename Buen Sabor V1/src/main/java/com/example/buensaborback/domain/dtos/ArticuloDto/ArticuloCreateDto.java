package com.example.buensaborback.domain.dtos.ArticuloDto;

import com.example.buensaborback.domain.dtos.ImagenDto.ImagenCreateDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloCreateDto {
    private ImagenCreateDto imagen;

    private Long idUnidadMedida;

    private Long idCategoria;
}
