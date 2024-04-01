package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class TestShowEmptyBooks {

	
	@Mock
	IBookService bookService;  //creating  a proxy
	
	@InjectMocks
	OrderDetails orderDetails;
	List<Book> bookList;
	Book book1, book2, book3, book4, book5, book6;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
        book1 = new Book("Java in Action", "John", 1, 900.90);
        book2 = new Book("Fight club", "John", 2, 300.68);
        book3 = new Book("HTML for Dummies", "John", 3, 1900.45);
        book4 = new Book("Secrets", "John", 4, 4700.90);
     	book5 = new Book("Seven Habits", "John", 5, 5900.90);
        book6 = new Book("Avengers", "John", 6, 10000.00);
        
        bookList = Arrays.asList(book1, book2, book3, book4, book5, book6);
	}

	@AfterEach
	void tearDown() throws Exception {
		orderDetails = null;
	}


	@Test
	void testShowBooks() throws BookNotFoundException {
		String author = "Nithin";
		// calling the method using proxy and assuming that we got 5 books 
		Mockito.when(bookService.getByAuthor(author)).thenReturn(new ArrayList<Book>());
		
		assertThrows(BookNotFoundException.class, () -> orderDetails.showBooks(author));
		// testing the method
	}

}
