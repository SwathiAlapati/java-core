package com.learning.core.day1session1;

class Book {
	private String bookTitle;
	private double bookPrice;
	
	public String getBookTitle()
	{
		return bookTitle;
	}
	public void setBookTitle(String bookTitle){
		this.bookTitle=bookTitle;
	}
	public double getBookPrice(){
		return bookPrice;
	}
	public void setBookPrice(double bookPrice){
		this.bookPrice=bookPrice;
	}
}
public class D01P01 {
	public static Book createBook(String title, double price)
	{
		Book book=new Book();
		book.setBookTitle(title);
		book.setBookPrice(price);
		return book;
	}
	public static void showBook(Book book) {
		System.out.println("Book Title:"+ book.getBookTitle() + " and Price:" + book.getBookPrice());
	}
	public static void main(String[] args) {
		//Input
		String title="Java Programming";
		double price = 350.00;
		
		//Creating a book object
		Book b= createBook(title,price);
		
		//showing the book details
		showBook(b);		
	}
}
