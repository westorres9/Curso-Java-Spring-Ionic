package com.devsuperior.springionic.dto;

import com.devsuperior.springionic.entities.City;

public class CityDTO {
	
	private Long id;
	private String name;
	private CountyDTO county;
	
	public CityDTO() {
	}
	
	public CityDTO(Long id, String name, CountyDTO county) {
		this.id = id;
		this.name = name;
		this.county = county;
	}
	
	public CityDTO(City entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.county = new CountyDTO(entity.getCounty());
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

	public CountyDTO getCounty() {
		return county;
	}

	public void setCounty(CountyDTO county) {
		this.county = county;
	}
	
	
	
	

}
