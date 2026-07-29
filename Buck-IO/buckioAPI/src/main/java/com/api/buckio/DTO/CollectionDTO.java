package com.api.buckio.DTO;

import com.api.buckio.Entities.Client;



public class CollectionDTO {
    private String name;
    private Client client;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
  
    @Override
    public String toString() {
        return "CollectionDTO [name=" + name + ", client=" + client + "]";
    }

    





    

}
