package com.api.buckio.Service;

import org.springframework.stereotype.Service;

import com.api.buckio.DTO.ClientDTO;
import com.api.buckio.Entities.Client;
import com.api.buckio.Mappers.ClientMapper;
import com.api.buckio.Repository.ClientRepository;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    private ClientRepository repository;
    private RequestEngine engine;
    private ClientMapper mapper;


    public ClientService(ClientRepository repository, RequestEngine engine, ClientMapper mapper) {
        this.repository = repository;
        this.engine = engine;
        this.mapper = mapper;
    }

    
    public Client CreateClient(ClientDTO dto){
        Client client = new Client();
        mapper.toEntity(dto);
        return repository.save(client);
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
