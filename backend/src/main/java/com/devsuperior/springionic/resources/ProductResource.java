package com.devsuperior.springionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.springionic.dto.ProductDTO;
import com.devsuperior.springionic.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
    @GetMapping
    public ResponseEntity<Page<ProductDTO>> findAll(Pageable pageable) {
    	Page<ProductDTO> page = service.findAll(pageable);
    	return ResponseEntity.ok().body(page);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
    	ProductDTO dto = service.findById(id);
    	return ResponseEntity.ok().body(dto);
    }

}