package com.api.buckio.Entities;

import jakarta.persistence.*;


@Entity
@Table(name = "CollectionTB")

public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JoinColumn(name = "client_id")
    @ManyToOne(cascade = CascadeType.MERGE)
    private Client client;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        return "Collection [id=" + id + ", name=" + name + ", client=" + client + "]";
    }



    
    

}
