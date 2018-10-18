package com.fabiopereira.csbi.mc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabiopereira.csbi.mc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{}
