package com.example.buensaborback.domain.dtos.EmpresaDto;

import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpresaDto extends BaseDto {
    private String nombre;
    private String razonSocial;
    private Long cuil;
}
