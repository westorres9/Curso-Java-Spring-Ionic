package com.devsuperior.springionic.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.springionic.entities.Category;
import com.devsuperior.springionic.entities.Product;

public class CategoryDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
    private String name;
    
    private List<ProductDTO> products = new ArrayList<>();
    
    public CategoryDTO() {
    }

	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
	public CategoryDTO(Category entity, List<Product> products) {
		this(entity);
		products.forEach(prod -> this.products.add(new ProductDTO(prod)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}
    
    

}
