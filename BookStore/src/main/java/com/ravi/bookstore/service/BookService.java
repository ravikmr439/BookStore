package com.ravi.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.bookstore.model.Book;
import com.ravi.bookstore.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public List<Book> getAllBooks() {
		return bookRepo.findAll();

	}

	public Book getBookById(Long Id) {
		return bookRepo.findById(Id).orElse(null);

	}

	public Book createBook(Book book) {
		return bookRepo.saveAndFlush(book);
	}

	public Book updateBook(Long id, Book book) {
		Book existingBook = bookRepo.findById(id).orElse(null);
		if (existingBook != null) {
			existingBook.setTitle(book.getTitle());
			existingBook.setAuthor(book.getAuthor());
			existingBook.setYear_Published(book.getYear_Published());
			return bookRepo.save(existingBook);

		} else {
			return null;
		}

	}

	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}
