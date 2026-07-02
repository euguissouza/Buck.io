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
  
    private final WebClient webClient;

    public RequestEngine(WebClient.Builder builder) {
        this.webClient = builder.build();
    }

    public void PostRequest(ClientDTO dto){
        Mono<Client> created = webClient.post().uri(dto.getUrl())
        .contentType(MediaType.APPLICATION_JSON).bodyValue(dto.getBody())
        .retrieve().bodyToMono(Client.class);
    }
    

}
