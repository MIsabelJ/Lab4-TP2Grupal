package com.example.buensaborback.business.service.Base;
import com.example.buensaborback.domain.entities.Base;
import com.example.buensaborback.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public abstract class BaseServiceImp<E extends Base,ID extends Serializable> implements BaseService<E, ID> {


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
    @Override
    public Set<E> getAllById(List<ID> listId){
        Set<E> entityList = new HashSet<>();
        for (int i = 0; i < listId.size(); i++){
                var actualEntity = baseRepository.getById(listId.get(i));
                if (actualEntity != null){
                    entityList.add(actualEntity);
                }
        }
        return entityList;
    }
}
