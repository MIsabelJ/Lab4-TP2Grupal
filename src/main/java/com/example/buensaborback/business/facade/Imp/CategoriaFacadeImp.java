package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.facade.CategoriaFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.mapper.CategoriaMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.business.service.CategoriaService;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaCreateDto;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaFacadeImp extends BaseFacadeImp<Categoria, CategoriaDto, CategoriaCreateDto, CategoriaCreateDto, Long> implements CategoriaFacade {
    public CategoriaFacadeImp(BaseService<Categoria, Long> baseService, BaseMapper<Categoria, CategoriaDto, CategoriaCreateDto, CategoriaCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    CategoriaMapper categoriaMapper;

    @Autowired
    CategoriaService categoriaService;

    @Override
    public CategoriaDto addSucursal(Long idCategoria, Long idSucursal) {
        return categoriaMapper.toDTO(categoriaService.addSucursal(idCategoria, idSucursal));
    }

}
