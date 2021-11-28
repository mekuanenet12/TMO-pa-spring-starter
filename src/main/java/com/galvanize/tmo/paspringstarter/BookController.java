package com.galvanize.tmo.paspringstarter;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    @Autowired
    BookService bookService;

    // to post
    @RequestMapping(method = RequestMethod.POST, value = "/api/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        book.id = bookService.bookList.size() + 1;
        bookService.addToList(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    // get all books sorted alphabetically by title
    @RequestMapping(method = RequestMethod.GET, value = "/api/books")
    public ResponseEntity<List<Book>> getListOfBooks() {
        return new ResponseEntity<>(bookService.getAllBooksSortedByTitle(), HttpStatus.OK);
    }

    // delete all books
    @RequestMapping(method = RequestMethod.DELETE, value = "/api/books")
    public ResponseEntity<Book> deleteAll() {
        bookService.deleteAllBooks();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    /// to post
//	@RequestMapping(method = RequestMethod.POST, value = "/api/books")
//	public ResponseEntity<List<Book>> createBook(@RequestBody Book book) {
//		book.id = bookService.bookList.size() + 1;
//		bookService.addToList(book);
//		return new ResponseEntity<>(bookService.getAllBooksSortedByTitle(), HttpStatus.CREATED);
//	}
}
