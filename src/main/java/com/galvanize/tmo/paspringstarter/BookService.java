package com.galvanize.tmo.paspringstarter;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public BooksManager bm = new BooksManager();

    // post one
    public void addToList(Book book) {

        bm.books.add(book);
    }

    // get all sorted by book title
    public BooksManager getAllBooksSortedByTitle() {
        Collections.sort(bm.books, new BookComparator());
        return bm;
    }

    // to delete all
    public void deleteAllBooks() {
        bm.books.clear();
    }

//    public Book getBookById(int id) {
//
//        for (int i = 0; i < bookList.size(); i++) {
//            if (bookList.get(i).id == id) {
//                return bookList.get(i);
//            }
//        }
//        return null;
//    }

}
