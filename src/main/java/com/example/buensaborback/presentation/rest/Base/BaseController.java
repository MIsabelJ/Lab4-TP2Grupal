package com.example.buensaborback.presentation.rest.Base;

import com.example.buensaborback.domain.dtos.BaseDto;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseController <D extends BaseDto, DC, DE, ID extends Serializable>{
    ResponseEntity<D> getById(ID id);
    ResponseEntity<List<D>> getAll();
    ResponseEntity<D> create(DC entity);
    ResponseEntity<D> edit(DE entity, ID id);
    ResponseEntity<?> deleteById(ID id);
}
