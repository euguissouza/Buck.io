package com.api.buckio.DTO;

import com.api.buckio.Entities.Client;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CollectionDTO {
    private String name;
    private Client client;
}
