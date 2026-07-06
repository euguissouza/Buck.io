package com.api.buckio.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.buckio.DTO.CollectionDTO;
import com.api.buckio.Entities.Collection;
import com.api.buckio.Repository.CollectionRepository;
import com.api.buckio.Service.CollectionService;

@RestController
@RequestMapping("/apiCollection")
public class CollectionController {
    
    private CollectionService service;
    private CollectionRepository repository;

    public CollectionController(CollectionService service, CollectionRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @PostMapping("/post")
    public Collection newCollection(CollectionDTO dto){
        Collection collection = service.CreateCollection(dto);
        return collection;
    }


    @GetMapping("/get")
    public ResponseEntity<List<Collection>> findCollection(){
        List<Collection> find = repository.findAll();
        return ResponseEntity.ok(find);
    }

}
