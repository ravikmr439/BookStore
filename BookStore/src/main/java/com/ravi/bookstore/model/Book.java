package com.ravi.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String author;
	private int year_Published;

	public Book() {

	}

	public Book(Long id, String title, String author, int yearPublished) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.year_Published = yearPublished;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear_Published() {
		return year_Published;
	}

	public void setYear_Published(int year_Published) {
		this.year_Published = year_Published;
	}

	

}
