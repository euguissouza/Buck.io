package com.api.buckio.Entities;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.api.buckio.Enum.RequestMode;

import jakarta.persistence.Column;
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

    @JdbcTypeCode(SqlTypes.JSON)
    private Object Body;

    @Column(length = 3000)
    private String response;


    
    
    
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

    public RequestMode getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(RequestMode requestMode) {
        this.requestMode = requestMode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public Object getBody() {
        return Body;
    }

    public void setBody(Object body) {
        Body = body;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }


    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", requestMode=" + requestMode + ", url=" + url + ", Body="
                + Body + ", response=" + response + "]";
    }


    
    

    
}
