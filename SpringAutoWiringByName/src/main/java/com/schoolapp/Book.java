package com.schoolapp;

public class Book {
	
	private String bookName;
	private int bookPrice;

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
	
	public String toString(){
		return "[Book Name : " +bookName +", Book Price : " +"Rs." +bookPrice +" ]";
	}
	
}
