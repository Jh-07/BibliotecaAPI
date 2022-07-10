package com.projeto2.biblioteca;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.projeto2.biblioteca.model.book;
import com.projeto2.biblioteca.repository.BookRepository;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
		
	
	}

	@Bean
	CommandLineRunner initDatabase(BookRepository bookRepository){
		return args ->{
			bookRepository.deleteAll();

			book b = new book();
			book c = new book();
			b.setName("Harry Potter");
			c.setName("Nome do Vento");
			bookRepository.save(b);
			bookRepository.save(c);


			
		};
	}
}
