package com.api.buckio.Service;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.api.buckio.DTO.ClientDTO;
import com.api.buckio.Entities.Client;

import reactor.core.publisher.Mono;

@Service
public class RequestEngine {
  
    private  WebClient webClient;


    public RequestEngine(WebClient webClient) {
        this.webClient = webClient;

    }


    public Mono<ClientDTO>RequestGet(Client client){
        return webClient.get()
                .uri(client.getUrl())
                .retrieve()
                .bodyToMono(ClientDTO.class);
    }

    

}
