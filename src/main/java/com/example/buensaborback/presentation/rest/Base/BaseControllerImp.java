package com.example.buensaborback.presentation.rest.Base;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.entities.Base;
import com.example.buensaborback.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
@Controller
public abstract class BaseControllerImp<E extends Base,D extends BaseDto,DC, DE, ID extends Serializable, F extends BaseFacadeImp<E,D,DC,DE,ID>> implements BaseController<D,DC,DE,ID> {

    protected F facade;
    public BaseControllerImp(F facade){
        this.facade = facade;
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> getById(@PathVariable ID id){
        return ResponseEntity.ok(facade.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<D>> getAll() {
        return ResponseEntity.ok(facade.getAll());
    }

    @PostMapping()
    public ResponseEntity<D> create(@RequestBody DC entity){
        return ResponseEntity.ok(facade.createNew(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> edit(@RequestBody DE entity, @PathVariable ID id){
        return ResponseEntity.ok(facade.update(entity, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable ID id){
        facade.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
