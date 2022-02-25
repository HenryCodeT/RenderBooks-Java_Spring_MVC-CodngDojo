package com.codingdojo.books.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.books.models.Book;
import com.codingdojo.books.repositories.BookRepository;

@Service
public class BookService {
	public final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	// //// create a book ////
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	// //// find by id ////
	public Book findBookById(Long Id) {
		Optional<Book> optionalBookOptional = bookRepository.findById(Id);
		System.out.println("findBookById-optional-service: "+optionalBookOptional);
		System.out.println("findBookById-optional-service-get: "+optionalBookOptional.get());
		
		if(optionalBookOptional.isPresent()) {
            return optionalBookOptional.get();
        } else {
            return null;
        }
	}
}
