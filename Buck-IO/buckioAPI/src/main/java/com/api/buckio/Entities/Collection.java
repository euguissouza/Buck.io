package com.api.buckio.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CollectionTB")
@Getter
@Setter
@ToString
public class Collection {

    private Long id;
    private String name;

    @JoinColumn(name = "client_id")
    private Client client;

}
