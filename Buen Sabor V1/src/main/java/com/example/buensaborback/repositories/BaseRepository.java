package com.example.buensaborback.repositories;


import com.example.buensaborback.domain.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {

    @Override
    default E getById(ID id) {
        return findById(id).orElseThrow(() -> new RuntimeException("La entidad con el id " + id + " no se encuentra"));
    }

    default List<E> getAll(){
        var entities = findAll().stream().toList();
        return entities;
    }
}
