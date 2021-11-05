package com.galvanize.tmo.paspringstarter;

public class Book {
	
	int id;
	String author;
	String title;
	int yearsPublished;

	public Book(int id, String author, String title, int yearsPublished) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.yearsPublished = yearsPublished;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearsPublished() {
		return yearsPublished;
	}

	public void setYearsPublished(int yearsPublished) {
		this.yearsPublished = yearsPublished;
	}

}
