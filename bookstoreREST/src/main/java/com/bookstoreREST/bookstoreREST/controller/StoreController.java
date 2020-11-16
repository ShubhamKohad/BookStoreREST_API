package com.bookstoreREST.bookstoreREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookstoreREST.bookstoreREST.StoreService.StoreService;
import com.bookstoreREST.bookstoreREST.entity.BookStore;



@RestController
public class StoreController {

	@Autowired StoreService service;
	
	@GetMapping ("/bookstore/books")
	public List<BookStore> getAllBooks(){
		return service.getBooks();
	}
	
	@RequestMapping (method=RequestMethod.GET, path="/bookstore/books/{id}")
	public BookStore getBookDetails(@PathVariable ("id") Integer id) {
		return service.getBook(id);		
	}
	
	@PostMapping("/bookstore/books")
	public BookStore insertBook(@RequestBody BookStore b) {
		return service.addBook(b);
	}
	
	@PutMapping ("/bookstore/books/{id}")
	public BookStore updateBook(@PathVariable("id") Integer id, @RequestBody BookStore b) {
		return service.editBook(b, id);
	}
	
	@RequestMapping (method=RequestMethod.DELETE, path="/bookstore/books/{id}")
	public String removeBook(@PathVariable ("id") Integer id) {
			service.deleteBook(id);
			return "Book with id="+id+ " is removed successfully...";
	}
}
