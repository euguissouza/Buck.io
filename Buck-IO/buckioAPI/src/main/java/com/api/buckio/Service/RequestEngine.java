package com.api.buckio.Service;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

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

    
    public Mono<Client>RequestGet(Client client){
        Client clientDb = repositoryClient.findById(client.getId())
        .orElseThrow(() -> new RuntimeException("Client not found"));
        
        return webClient.get()
                .uri(clientDb.getUrl())
                .retrieve()
                .bodyToMono(String.class)
                .map(res -> {
                    clientDb.setResponse(res);
                    return clientDb;
                });
    }

    public Mono<Client>RequestPost(Client client){
        Client clientDb = repositoryClient.findById(client.getId())
        .orElseThrow(() -> new RuntimeException("Client not found"));

        return webClient.post()
        .uri(clientDb.getUrl())
        .contentType(MediaType.APPLICATION_JSON)
        .bodyValue(clientDb.getBody())
        .retrieve().bodyToMono(String.class)
        .map(res -> {
            clientDb.setResponse(res);
            return clientDb;
        });
    }
}
