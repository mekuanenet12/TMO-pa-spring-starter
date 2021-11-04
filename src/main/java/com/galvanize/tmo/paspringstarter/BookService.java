package com.galvanize.tmo.paspringstarter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	public List<Book> bookList = new ArrayList<>(
			Arrays.asList(new Book(2, "Philip K. Dick", "Do Androids Dream of Electric Sheep?", "1968"),
					new Book(3, "William Gibson", "Neuromancer", "1984"),
					new Book(1, "Zouglas Adams", "The Hitchhiker's Guide to the Galaxy", "1979")));

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
