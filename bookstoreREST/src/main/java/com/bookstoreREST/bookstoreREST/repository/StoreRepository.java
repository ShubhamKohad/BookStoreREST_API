package com.bookstoreREST.bookstoreREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstoreREST.bookstoreREST.entity.BookStore;

public interface StoreRepository extends JpaRepository<BookStore, Integer>{

}
