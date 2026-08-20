package com.api.buckio.DTO;

import com.api.buckio.Enum.RequestMode;


public class ClientDTO {

    private String name;
    private RequestMode requestMode;
    private String url;
    private Object Body;
    private String response;



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
        return "ClientDTO [name=" + name + ", requestMode=" + requestMode + ", url=" + url + ", Body=" + Body
                + ", response=" + response + "]";
    }

    

    
}
