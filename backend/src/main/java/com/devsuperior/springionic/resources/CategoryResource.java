package com.devsuperior.springionic.resources;

import com.devsuperior.springionic.entities.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public List<Category> listar() {
        Category category1 = new Category(1L, "computadores");
        Category category2 = new Category(2L, "escritorio");

        List<Category> categories = new ArrayList<>();
        categories.add(category1);
        categories.add(category2);
        return  categories;
    }

}
