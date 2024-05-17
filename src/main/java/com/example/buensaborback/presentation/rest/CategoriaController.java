package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.CategoriaFacadeImp;
import com.example.buensaborback.business.service.Imp.CategoriaServiceImp;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaCreateDto;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController extends BaseControllerImp<Categoria, CategoriaDto, CategoriaCreateDto, CategoriaCreateDto, Long, CategoriaFacadeImp> {
    public CategoriaController(CategoriaFacadeImp facade) {
        super(facade);
    }

    @Autowired
    private CategoriaServiceImp categoriaService;

    @PostMapping("/{idCategoria}/sucursales/{idSucursal}")
    public ResponseEntity<Categoria> addSucursal(
            @PathVariable Long idCategoria,
            @PathVariable Long idSucursal) {

        Categoria updatedCategoria = categoriaService.addSucursal(idCategoria, idSucursal);
        return ResponseEntity.ok(updatedCategoria);
    }

}
