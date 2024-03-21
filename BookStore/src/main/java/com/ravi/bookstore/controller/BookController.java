package com.ravi.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.bookstore.model.Book;
import com.ravi.bookstore.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Long Id) {
		return bookService.getBookById(Id);
	}

	@PostMapping("")
	public Book createBook(@RequestBody Book Book) {
		return bookService.createBook(Book);

	}
	
	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Long Id, @RequestBody Book book) {
		return bookService.updateBook(Id, book);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long  Id)
	{
		 bookService.deleteBook(Id);
	}

}
