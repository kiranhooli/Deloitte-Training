package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private int bookId; 
	private String bookName;
	private int bookPrice;
	private String authorName;

	public Book() {
//		System.out.println("Book Constructor");
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "bookId=" + bookId + ", \nbookName=" + bookName + ", \nbookPrice=" + bookPrice + ", \nauthorName="
				+ authorName + "\n*************";
	}
}