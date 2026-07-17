package com.api.buckio.Configuration;

import com.api.buckio.Repository.ClientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.api.buckio.Entities.Client;

@Configuration
public class WebClientConfiguration {

   private ClientRepository repository;

    public WebClientConfiguration(ClientRepository repository) {
        this.repository = repository;
    }

    @Bean
    public WebClient webClient(WebClient.Builder builder){
        return builder
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
        .build();
        
    }

}
