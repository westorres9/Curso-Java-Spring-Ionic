package com.devsuperior.springionic.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.devsuperior.springionic.entities.enums.ClientType;
@Entity
@Table(name = "tb_client")
public class Client implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String identNumber;
	private Integer type;
	
	@ElementCollection
	@CollectionTable(name = "tb_phones")
	private Set<String> phones = new HashSet<>();
	
	@OneToMany(mappedBy = "client")
	private List<Address> addresses = new ArrayList<>();
	
	public Client() {
	}

	public Client(Long id, String name, String email, String identNumber, ClientType type) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.identNumber = identNumber;
		this.type = type.getCod();
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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	public void setType(ClientType type) {
		this.type = type.getCod();
	}

	public ClientType getType() {
		return ClientType.toEnum(type);
	}
	
	public Set<String> getPhones() {
		return phones;
	}
	
}
