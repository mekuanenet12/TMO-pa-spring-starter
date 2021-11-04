package com.galvanize.tmo.paspringstarter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	// to post
	@RequestMapping(method = RequestMethod.POST, value = "/book")
	public void postTo(@RequestBody Book book) {
		bookService.addToList(book);
	}

	// get all books sorted alphabetically by title
	@RequestMapping("/books")
	public List<Book> getListOfTopics() {
		return bookService.getAllBooks();
	}

	// delete all books
	@RequestMapping("/deleteAllBooks")
	public void deleteAll() {
		bookService.deleteAllBooks();
	}

}
