package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.CategoriaFacadeImp;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaCreateDto;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Categoria")
@CrossOrigin("*")
public class CategoriaController extends BaseControllerImp<Categoria, CategoriaDto, CategoriaCreateDto, CategoriaCreateDto, Long, CategoriaFacadeImp> {
    public CategoriaController(CategoriaFacadeImp facade) {
        super(facade);
    }
}
