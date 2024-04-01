package com.bookapp.service;

import java.util.Collections;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

public class OrderDetails {

	private IBookService bookService;
	
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}

	public List<Book> showBooks(String author) throws BookNotFoundException {
		List<Book> books = bookService.getByAuthor(author);
		
		if(books.isEmpty())
			throw new BookNotFoundException("Book not found");
		Collections.sort(books, (b1,b2) -> b1.getTitle().compareTo(b2.getTitle()));
		return books;	
	}
	
	public String orderBok(int bookId) throws IdNotFoundException {
		Book book = bookService.getById(bookId);
		return book.getTitle();
		
	}
	
	public double getTotalPriceByDiscount(double price, int discountAmount) throws BookNotFoundException {
		List<Book> books = bookService.getByPriceLessThan(price);
		return 0.0;
		
	}
}
