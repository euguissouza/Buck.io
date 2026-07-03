package com.api.buckio.ViewTerminal;

import java.util.List;
import java.util.Scanner;

import com.api.buckio.DTO.ClientDTO;
import com.api.buckio.Entities.Client;
import com.api.buckio.Repository.ClientRepository;
import com.api.buckio.Service.RequestEngine;

public class TestComponentsViewer {
    Scanner scanner = new Scanner(System.in);

    private ClientRepository repository;    
    private RequestEngine engine;

    public TestComponentsViewer(ClientRepository repository, RequestEngine engine) {
        this.repository = repository;
        this.engine = engine;
    }




    public void Viewer(ClientDTO dto){
        List<Client> clients = repository.findAll();

        System.out.println("========BUCK.IO========");

        System.out.println("Selecione o Client: ");
        Long setInput = scanner.nextLong();
        
        for(Client novo : clients){
            if(setInput.equals(novo.getId())){  
            }else{
                System.out.println("Client não registrada!");
            };
        }

        System.out.println("Agora insira o json de requisição: ");
        dto.setBody(scanner.nextLine());
        engine.PostRequest(dto);


    }
 
}
