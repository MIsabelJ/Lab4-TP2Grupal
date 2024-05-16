package com.example.buensaborback.presentation.rest.Base;

import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.entities.Base;
import com.example.buensaborback.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class BaseControllerImp<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    @Autowired
    protected BaseRepository<E,ID> baseRepository;

    @Override
    public E create(E request){
        var newEntity = baseRepository.save(request);
        return newEntity;
    }

    @Override
    public E getById(ID id){
        var entity = baseRepository.getById(id);
        return entity;
    }

    @Override
    public List<E> getAll(){
        var entities = baseRepository.getAll();
        return entities;
    }

    @Override
    public void deleteById(ID id){
        var entity = getById(id);
        baseRepository.delete(entity);
    }

    @Override
    public E update(E request, ID id){
        var optionalEntity = baseRepository.findById((ID) request.getId());
        if (optionalEntity.isEmpty()){
            throw new RuntimeException("No se encontro una entidad con el id " + request.getId());
        }
        var newEntity = baseRepository.save(request);
        return newEntity;
    }

}
