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
    private ClientDTO dto;

    public RequestEngine(WebClient webClient, ClientDTO dto) {
        this.dto = dto;
        this.webClient = webClient;
    }


    public Mono<ClientDTO>RequestGet(){
        return webClient.get()
                .uri(dto.getUrl())
                .retrieve()
                .bodyToMono(ClientDTO.class);
    }

    

}
