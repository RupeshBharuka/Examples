package com.schoolapp;

public class BooksCategory {
	
	private String categoryName;
	private Book bookRef;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Book getBookRef() {
		return bookRef;
	}

	public void setBookRef(Book bookRef) {
		this.bookRef = bookRef;
	}

	public String toString(){
		return "[Book Category : " +categoryName +bookRef +"]"; 		
	}
	
}
