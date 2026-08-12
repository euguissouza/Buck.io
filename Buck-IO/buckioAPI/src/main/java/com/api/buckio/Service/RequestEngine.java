package com.api.buckio.Service;


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
        Client clientBanco = repositoryClient.findById(client.getId())
        .orElseThrow(() -> new RuntimeException("Client not found"));
        return webClient.get()
                .uri(clientBanco.getUrl())
                .retrieve()
                .bodyToMono(String.class)
                .map(res -> {
                    clientBanco.setResponse(res);
                    return repositoryClient.save(clientBanco);
                });
                

    }

}
