package com.api.buckio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.buckio.Entities.Collection;

public interface CollectionRepository extends JpaRepository<Collection,Long > {

}
