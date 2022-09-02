package com.gml.nttdata.daos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gml.nttdata.entities.Client;

@Repository
public interface ClientDao extends CrudRepository<Client, Long>{
    Optional<Client> findByDocumenTypeAndDocumentNumber(Character documentType, Integer documentNumber);
}
