package com.api.buckio.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.api.buckio.DTO.ClientDTO;
import com.api.buckio.Entities.Client;

@Mapper(componentModel =  "spring")
public interface ClientMapper {

    @Mapping(target = "id", ignore = true)
    Client toEntity(ClientDTO dto);
}
