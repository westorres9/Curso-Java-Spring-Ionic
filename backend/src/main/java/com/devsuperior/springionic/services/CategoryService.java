package com.devsuperior.springionic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.springionic.dto.CategoryDTO;
import com.devsuperior.springionic.entities.Category;
import com.devsuperior.springionic.repositories.CategoryRepository;
import com.devsuperior.springionic.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public Page<CategoryDTO> findAll(Pageable pageable) {
        Page<Category> page = repository.findAll(pageable);
        return page.map(x -> new CategoryDTO(x));
    }
    
    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id) {
    	Optional<Category> obj = repository.findById(id);
    	Category entity = obj.orElseThrow(() -> new ResourceNotFoundException("Resource not Found"));
    	return new CategoryDTO(entity);
    }
    
    

}
