package com.projeto2.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projeto2.biblioteca.model.book;
import com.projeto2.biblioteca.repository.BookRepository;
@RestController
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<book> list(){
        return bookRepository.findAll();
    }
    @PostMapping
    public book add(@RequestBody book book){
        return bookRepository.save(book);

    }
    // @DeleteMapping
    // public void delete(book book){
    //     bookRepository.delete(book);
    // }
    // @PutMapping
    // public void update(book book){

    // }

    }
    
