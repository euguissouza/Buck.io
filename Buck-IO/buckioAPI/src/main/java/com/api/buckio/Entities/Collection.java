package com.api.buckio.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CollectionTB")
@Getter
@Setter
@ToString
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JoinColumn(name = "client_id")
    @ManyToOne(cascade = CascadeType.MERGE)
    private Client client;

}
