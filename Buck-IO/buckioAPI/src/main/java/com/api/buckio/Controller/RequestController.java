package com.api.buckio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.buckio.Entities.Client;
import com.api.buckio.Service.RequestEngine;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/requests")
public class RequestController {
    private RequestEngine engine;


    public RequestController(RequestEngine engine){
        this.engine =  engine;
    }


    @GetMapping("/get/{id}")
    public Mono<Client> requestParam(@PathVariable Long id, Client client){
        return engine.RequestGet(client);
    }

}
