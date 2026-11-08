package com.example.cadastroautor.repository;

import com.example.cadastroautor.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
