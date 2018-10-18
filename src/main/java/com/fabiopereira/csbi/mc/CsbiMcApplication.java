package com.fabiopereira.csbi.mc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fabiopereira.csbi.mc.domain.Categoria;
import com.fabiopereira.csbi.mc.domain.Produto;
import com.fabiopereira.csbi.mc.repository.CategoriaRepository;
import com.fabiopereira.csbi.mc.repository.ProdutoRepository;

@SpringBootApplication
public class CsbiMcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository catRepository;
	@Autowired
	private ProdutoRepository prodRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CsbiMcApplication.class, args);
	}

	//Populate for test
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria("Informatica");
		Categoria cat2 = new Categoria("Escritorio");
		
		Produto p1 = new Produto("Computador", 2000.00);
		Produto p2 = new Produto("Impressora", 800.00);
		Produto p3 = new Produto("Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		
		catRepository.saveAll(Arrays.asList(cat1, cat2));
		prodRepository.saveAll(Arrays.asList(p1,p2, p3));
	}
}
