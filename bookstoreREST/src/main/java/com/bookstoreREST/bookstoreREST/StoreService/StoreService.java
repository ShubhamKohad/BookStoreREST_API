package com.bookstoreREST.bookstoreREST.StoreService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstoreREST.bookstoreREST.entity.BookStore;
import com.bookstoreREST.bookstoreREST.repository.StoreRepository;

@Service
public class StoreService {

		@Autowired StoreRepository repo;
	
	public List<BookStore> getBooks() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public BookStore getBook(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public BookStore addBook(BookStore b) {
		// TODO Auto-generated method stub
		return repo.save(b);
	}

	public BookStore editBook(BookStore b, Integer id) {
		// TODO Auto-generated method stub
		return repo.save(b);
	}

	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}


}
