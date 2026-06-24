package com.api.buckio.Service;

import org.springframework.stereotype.Service;

import com.api.buckio.DTO.ClientDTO;
import com.api.buckio.Entities.Client;
import com.api.buckio.Repository.ClientRepository;

@Service
public class ClientService {

    private ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    
    public Client CreateClient(ClientDTO dto){
        Client client = new Client();
        client.setName(dto.getName());
        client.setRequestMode(dto.getRequestMode());
        client.setBody(dto.getBody());
        client.setUrl(dto.getUrl());

        return repository.save(client);
    }
}
