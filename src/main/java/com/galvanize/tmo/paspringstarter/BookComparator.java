package com.galvanize.tmo.paspringstarter;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book a, Book b) {
		return a.title.compareToIgnoreCase(b.title);
	}

}
