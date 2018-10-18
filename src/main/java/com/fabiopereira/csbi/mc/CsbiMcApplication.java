package com.fabiopereira.csbi.mc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fabiopereira.csbi.mc.domain.Categoria;
import com.fabiopereira.csbi.mc.repository.CategoriaRepository;

@SpringBootApplication
public class CsbiMcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository catRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CsbiMcApplication.class, args);
	}

	//Populate for test
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria("Informatica");
		Categoria cat2 = new Categoria("Escritorio");
		catRepository.saveAll(Arrays.asList(cat1, cat2));
	}
}
