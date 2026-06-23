package com.api.buckio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.buckio.Entities.Client;

public interface ClientRepository extends JpaRepository<Long, Client> {

}
