package com.devsuperior.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.springionic.entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
