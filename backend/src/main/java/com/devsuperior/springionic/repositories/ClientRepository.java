package com.devsuperior.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.springionic.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
