package com.codingdojo.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.books.models.Book;
import com.codingdojo.books.services.BookService;


@Controller
public class BookController {
	public final BookService bookService;
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/books/{bookId}")
	public String index(@PathVariable("bookId") Long bookId , Model model) {
		Book book = bookService.findBookById(bookId);
		System.out.println("Controller-Get-mapping-book-by-id: "+bookId);
		model.addAttribute("book",book);
		return "index";
	}
}
