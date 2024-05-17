package com.example.buensaborback.business.facade.Base;

import com.example.buensaborback.domain.dtos.BaseDto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public interface BaseFacade <D extends BaseDto,DC,DE, ID extends Serializable> {
    public D createNew(DC request);
    public D getById(Long id);
    public List<D> getAll();
    public void deleteById(Long id);
    public D update(DE request, Long id);
    public List<D> getAllById(List<ID> listId);
}
