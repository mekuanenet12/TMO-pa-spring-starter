package com.galvanize.tmo.paspringstarter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	public List<Book> bookList = new ArrayList<>();	;

	// post one
	public void addToList(Book book) {
		
		bookList.add(book);
	}

	// get all sorted by book title
	public List<Book> getAllBooks() {
		Collections.sort(bookList, new BookComparator());
		return bookList;
	}

	// to delete all
	public void deleteAllBooks() {
		bookList.clear();
	}

}
