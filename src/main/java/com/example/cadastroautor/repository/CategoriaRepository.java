package com.example.cadastroautor.repository;

import com.example.cadastroautor.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}