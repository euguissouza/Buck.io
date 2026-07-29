package com.api.buckio.Entities;

import com.api.buckio.Enum.RequestMode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "ClientTB")
public class Client {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private RequestMode requestMode;
    private String url;
    private String Body;
    private String response;


    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public RequestMode getRequestMode() {
        return requestMode;
    }
    public String getUrl() {
        return url;
    }
    public String getBody() {
        return Body;
    }
    public String getResponse() {
        return response;
    }

    
    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", requestMode=" + requestMode + ", url=" + url + ", Body="
                + Body + ", response=" + response + "]";
    }


    
    

    
}
