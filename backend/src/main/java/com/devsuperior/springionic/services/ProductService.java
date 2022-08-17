package com.devsuperior.springionic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.springionic.dto.ProductDTO;
import com.devsuperior.springionic.entities.Product;
import com.devsuperior.springionic.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ProductDTO> findAll(Pageable pageable) {
		Page<Product> page = repository.findAll(pageable);
		return page.map(x -> new ProductDTO(x));
	}
}
