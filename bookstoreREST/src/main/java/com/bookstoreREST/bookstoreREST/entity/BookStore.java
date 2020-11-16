package com.bookstoreREST.bookstoreREST.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookStore {

	@Id
	private Integer id;
	private String name;
	private String author;
	private String publication;
	private String category;
	private Integer pages;
	private float price;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "BookStore [id=" + id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + "]";
	}
	
	
	public BookStore(Integer id, String name, String author, String publication, String category, Integer pages,
			float price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
	}
	
	
	public BookStore(){
		
	}
	
}
