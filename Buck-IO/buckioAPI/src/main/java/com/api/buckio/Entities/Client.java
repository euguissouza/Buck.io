package com.api.buckio.Entities;

import com.api.buckio.Enum.RequestMode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ClientTB")
@Getter
@Setter
@ToString
public class Client {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private RequestMode requestMode;
    private String url;
    private String Body;

    
}
