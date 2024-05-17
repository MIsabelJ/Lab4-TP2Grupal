package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.ArticuloManufacturadoService;
import com.example.buensaborback.business.service.Base.BaseServiceImp;
import com.example.buensaborback.business.service.PromocionService;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import com.example.buensaborback.repositories.ArticuloManufacturadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoServiceImp extends BaseServiceImp<ArticuloManufacturado,Long> implements ArticuloManufacturadoService {
    @Autowired
    PromocionService promocionService;
    @Autowired
    ArticuloManufacturadoRepository articuloManufacturadoRepository;

    @Override
    public ArticuloManufacturado addPromocion(Long idArticuloManufacturado, Long idSucursal){
        ArticuloManufacturado articuloManufacturado = articuloManufacturadoRepository.findWithPromocionesById(idArticuloManufacturado);
        articuloManufacturado.getEstaEnPromociones().add(promocionService.getById(idSucursal));
        return  articuloManufacturado;
    }

    @Override
    public ArticuloManufacturado addArticuloInsumo(Long idArticuloManufacturado, Long idArticuloInsumo){
        ArticuloManufacturado articuloManufacturado = articuloManufacturadoRepository.findWithArticuloInsumoById(idArticuloManufacturado);
        articuloManufacturado.getEstaEnPromociones().add(promocionService.getById(idArticuloInsumo));
        return  articuloManufacturado;
    }


}
