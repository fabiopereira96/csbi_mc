package com.fabiopereira.csbi.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiopereira.csbi.mc.domain.Categoria;
import com.fabiopereira.csbi.mc.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria find(Integer id) { 
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}
