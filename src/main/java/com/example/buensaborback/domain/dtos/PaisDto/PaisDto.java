package com.example.buensaborback.domain.dtos.PaisDto;

import com.example.buensaborback.domain.dtos.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaisDto extends BaseDto {
    private String nombre;
}
