package com.devsuperior.springionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.springionic.entities.Category;
import com.devsuperior.springionic.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
    @GetMapping
    public ResponseEntity<Page<Category>> findAll(Pageable pageable) {
    	Page<Category> page = service.findAll(pageable);
    	return ResponseEntity.ok().body(page);
    }

}
