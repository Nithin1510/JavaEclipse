package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {

//    List<Book> getAll();
    List<Book> getByAuthor(String author) throws BookNotFoundException;

    List<Book> getByPriceLessThan(double price) throws BookNotFoundException;

//    List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;

    Book getById(int bookId) throws IdNotFoundException;

}
