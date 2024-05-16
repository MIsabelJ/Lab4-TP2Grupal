package com.example.buensaborback.domain.dtos.ArticuloDto;

import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaDto;
import com.example.buensaborback.domain.dtos.ImagenDto.ImagenDto;
import com.example.buensaborback.domain.dtos.UnidadMedidaDto.UnidadMedidaDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloCreateDto {
    private ImagenDto imagen;

    private Long idUnidadMedida;

    private Long Categoria;
}
