package com.galvanize.tmo.paspringstarter;

import java.util.ArrayList;

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
	public List<Book> getAllBooksSortedByTitle() {
		Collections.sort(bookList, new BookComparator());
		return bookList;
	}

	// to delete all
	public void deleteAllBooks() {
		bookList.clear();
	}

	public Book getBookById(int id) {

		for(int i=0;i<bookList.size();i++)
		{
			if(bookList.get(i).id == id)
			{
				return bookList.get(i);
			}
		}

		return null;
	}

}
