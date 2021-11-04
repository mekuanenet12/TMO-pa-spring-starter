package com.galvanize.tmo.paspringstarter;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
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
	public ResponseEntity<Book> postTo(@RequestBody Book book) {
		book.id = bookService.bookList.size() + 1;
		bookService.addToList(book);
		return ResponseEntity.ok(book);
	}

	// get all books sorted alphabetically by title
	@RequestMapping("/api/books")
	public List<Book> getListOfTopics() {
		return bookService.getAllBooks();
	}

	// delete all books
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/books")
	public void deleteAll() {
		bookService.deleteAllBooks();
	}

}
