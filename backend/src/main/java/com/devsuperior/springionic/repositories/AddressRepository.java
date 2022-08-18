package com.devsuperior.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.springionic.entities.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
