package com.api.buckio.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.api.buckio.DTO.ClientDTO;
import com.api.buckio.Entities.Client;
import com.api.buckio.Repository.ClientRepository;
import com.api.buckio.Service.ClientService;

@RestController
@RequestMapping("/api/Clients")
public class ClientController {

    private ClientService service;
    private ClientRepository repository;

    public ClientController(ClientService service, ClientRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    

    @PostMapping("/post")
    public Client newClient(ClientDTO dto){
        Client client = service.CreateClient(dto);
        return client;
    }


    @GetMapping("/get")
    public ResponseEntity<List<Client>>findClient(){
        List<Client> find = repository.findAll();

        return ResponseEntity.ok(find);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Long id){
        service.DeleteClient(id);
    }


    



}
