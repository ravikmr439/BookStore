package com.ravi.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.bookstore.model.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
