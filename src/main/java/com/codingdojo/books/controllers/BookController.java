package com.codingdojo.books.controllers;

import java.util.List;

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
	@GetMapping("/")
	public String index() {
		return "redirect:/books";
	}
	// //// get book by id ////
	@GetMapping("/books/{bookId}")
	public String getBookById(@PathVariable("bookId") Long bookId , Model model) {
		Book book = bookService.findBookById(bookId);
		System.out.println("Controller-Get-mapping-book-by-id: "+bookId);
		model.addAttribute("book",book);
		return "index";
	}
	// //// get all books ////
	@GetMapping("/books")
	public String getAllBooks(Model model) {
		List<Book> books = bookService.allBooks();
		System.out.println("Controller-find-all-books: "+ books);
		model.addAttribute("books", books);
		return "books";
	}
}
