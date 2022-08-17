package com.devsuperior.springionic.services;

import com.devsuperior.springionic.entities.Category;
import com.devsuperior.springionic.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public Page<Category> findAll(Pageable pageable) {
        Page<Category> page = repository.findAll(pageable);
        return page;
    }

}
