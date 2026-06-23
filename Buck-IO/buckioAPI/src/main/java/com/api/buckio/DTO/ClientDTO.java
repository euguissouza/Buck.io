package com.api.buckio.DTO;

import com.api.buckio.Enum.RequestMode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {

    private String name;
    private RequestMode requestMode;
    private String url;
    private String Body;
}
