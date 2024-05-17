package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImp;
import com.example.buensaborback.business.service.CategoriaService;
import com.example.buensaborback.business.service.SucursalService;
import com.example.buensaborback.domain.entities.Categoria;
import com.example.buensaborback.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImp extends BaseServiceImp<Categoria,Long> implements CategoriaService {

    @Autowired
    SucursalService sucursalService;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria addSucursal(Long idCategoria, Long idSucursal) {
        Categoria categoria = categoriaRepository.findWithSucursalesById(idCategoria);
        categoria.getSucursales().add(sucursalService.getById(idSucursal));
        return categoria;
    }

}
