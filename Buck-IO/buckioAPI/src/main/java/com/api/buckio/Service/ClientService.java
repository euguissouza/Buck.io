package com.api.buckio.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.buckio.DTO.ClientDTO;
import com.api.buckio.Entities.Client;
import com.api.buckio.Repository.ClientRepository;

import reactor.core.publisher.Mono;

@Service
public class ClientService {

    private ClientRepository repository;
    private RequestEngine engine;



    public ClientService(ClientRepository repository, RequestEngine engine) {
        this.repository = repository;
        this.engine = engine;

    }

    @Transactional
    public Client CreateClient(ClientDTO dto){
        Client client = new Client();
        client.setName(dto.getName());
        client.setRequestMode(dto.getRequestMode());
        client.setUrl(dto.getUrl());
        repository.save(client);
        System.out.println(client);
        return client;
    }


    public void DeleteClient(Long id){
         repository.deleteById(id);
    }



    // Seleciona um client para o motor realizar a requisição!
    public Mono<ClientDTO> findClientId(Long id){
        Client client = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found!"));
        return engine.RequestGet(client);
    }

}
