package com.devsuperior.springionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.springionic.dto.CategoryDTO;
import com.devsuperior.springionic.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
    @GetMapping
    public ResponseEntity<Page<CategoryDTO>> findAll(Pageable pageable) {
    	Page<CategoryDTO> page = service.findAll(pageable);
    	return ResponseEntity.ok().body(page);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {
    	CategoryDTO dto = service.findById(id);
    	return ResponseEntity.ok().body(dto);
    }

}
