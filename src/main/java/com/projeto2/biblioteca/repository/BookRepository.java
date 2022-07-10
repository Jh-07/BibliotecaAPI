package com.projeto2.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto2.biblioteca.model.book;

@Repository
public interface BookRepository extends JpaRepository<book, Long> {
    
}
