package com.devsuperior.springionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.springionic.dto.ClientDTO;
import com.devsuperior.springionic.entities.Client;
import com.devsuperior.springionic.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;
	
    @GetMapping
    public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable) {
    	Page<ClientDTO> page = service.findAll(pageable);
    	return ResponseEntity.ok().body(page);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
    	ClientDTO dto = service.findById(id);
    	return ResponseEntity.ok().body(dto);
    }

}