package com.guilherme.pitana.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.pitana.domain.Categoria;
import com.guilherme.pitana.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.getOne(id);
		return obj;
		
		
		
		
		
	}

}
