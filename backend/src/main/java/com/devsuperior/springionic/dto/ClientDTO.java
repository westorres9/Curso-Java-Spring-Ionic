package com.devsuperior.springionic.dto;

import java.io.Serializable;

import com.devsuperior.springionic.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	private String identNumber;
	private String phone;
	
	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String email, String identNumber, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.identNumber = identNumber;
		this.phone = phone;
	}
	
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.identNumber = entity.getIdentNumber();
		this.phone = entity.getPhone();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentNumber() {
		return identNumber;
	}

	public void setIdentNumber(String identNumber) {
		this.identNumber = identNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	

}
