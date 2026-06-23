package com.api.buckio.Service;



import org.springframework.stereotype.Service;

import com.api.buckio.DTO.CollectionDTO;
import com.api.buckio.Entities.Collection;
import com.api.buckio.Repository.CollectionRepository;

@Service
public class CollectionService {

    private CollectionRepository repository;

    public CollectionService(CollectionRepository repository) {
        this.repository = repository;
    }

    public Collection CreateCollection(CollectionDTO dto){
        Collection collection = new Collection();
        collection.setName(dto.getName());
        collection.setClient(dto.getClient());
        return repository.save(collection);
        
    }

}
