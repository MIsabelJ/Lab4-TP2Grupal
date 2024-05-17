package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.entities.Base;
import org.mapstruct.MappingTarget;

import java.util.List;

public interface BaseMapper<E extends Base, D extends BaseDto, DC, DE>{
    public D toDTO (E source);
    public E toEntity (D source);
    public E toEntityCreate (DC source);
    public E toUpdate(@MappingTarget E entity, DE source );
    public List<D> toDTOsList(List<E> source);
}
