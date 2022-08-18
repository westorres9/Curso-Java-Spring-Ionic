package com.devsuperior.springionic.dto;

import com.devsuperior.springionic.entities.County;

public class CountyDTO {
	
	private Long id;
	private String name;
	
	
	public CountyDTO() {
	}

	public CountyDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CountyDTO(County entity) {
		this.id = entity.getId();
		this.name = entity.getName();
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
	
	
	

}
