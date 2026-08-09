package com.api.buckio.Service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.api.buckio.DTO.ClientDTO;
import com.api.buckio.Entities.Client;
import com.api.buckio.Repository.ClientRepository;

import reactor.core.publisher.Mono;

@Service
public class RequestEngine {
  
    private  WebClient webClient;
    private ClientRepository repositoryClient;


    public RequestEngine(WebClient webClient, ClientRepository repositoryClient) {
        this.webClient = webClient;
        this.repositoryClient = repositoryClient;

    }

    
    public Mono<ClientDTO>RequestGet(Client client){
        Client clientBanco = repositoryClient.findById(client.getId())
        .orElseThrow(() -> new RuntimeException("Url vazia"));
        return webClient.get()
                .uri(clientBanco.getUrl())
                .retrieve()
                .bodyToMono(ClientDTO.class);
    }

    

}
