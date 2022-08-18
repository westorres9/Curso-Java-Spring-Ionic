package com.devsuperior.springionic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.springionic.dto.ClientDTO;
import com.devsuperior.springionic.entities.Client;
import com.devsuperior.springionic.repositories.ClientRepository;
import com.devsuperior.springionic.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(Pageable pageable) {
		Page<Client> page = repository.findAll(pageable);
		return page.map(x -> new ClientDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Resource Not Found"));
		return new ClientDTO(entity);
	}
}
