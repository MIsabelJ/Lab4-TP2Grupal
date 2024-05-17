package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.ArticuloManufacturadoFacade;
import com.example.buensaborback.business.facade.Imp.ArticuloManufacturadoFacadeImp;
import com.example.buensaborback.business.service.Imp.ArticuloManufacturadoServiceImp;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoCreateDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articulo-manufacturado")
@CrossOrigin("*")
public class ArticuloManufacturadoController extends BaseControllerImp<ArticuloManufacturado, ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto, Long, ArticuloManufacturadoFacadeImp> {
    public ArticuloManufacturadoController(ArticuloManufacturadoFacadeImp facade) {
        super(facade);
    }

    @Autowired
    private ArticuloManufacturadoFacade articuloManufacturadoFacade;
    @PostMapping("/{idArticuloManufacturado}/insumos/{idArticuloInsumo}")
    public ResponseEntity<ArticuloManufacturadoDto> addArticuloInsumo(
            @PathVariable Long idArticuloManufacturado,
            @PathVariable Long idArticuloInsumo) {

        ArticuloManufacturadoDto updatedArticuloManufacturadoDto = articuloManufacturadoFacade.addArticuloInsumo(idArticuloManufacturado, idArticuloInsumo);
        return ResponseEntity.ok(updatedArticuloManufacturadoDto);
    }
    @PostMapping("/{idArticuloManufacturado}/articulo-insumo/{idPromocion}")
    public ResponseEntity<ArticuloManufacturadoDto> addPromocion(
            @PathVariable Long idArticuloManufacturado,
            @PathVariable Long idPromocion) {

        ArticuloManufacturadoDto updatedArticuloManufacturadoDto = articuloManufacturadoFacade.addPromocion(idArticuloManufacturado, idPromocion);
        return ResponseEntity.ok(updatedArticuloManufacturadoDto);
    }
}
