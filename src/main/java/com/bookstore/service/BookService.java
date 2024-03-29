package com.bookstore.service;

import com.bookstore.enumerations.Category;
import com.bookstore.models.Book;

import java.util.List;

public interface BookService {

    List<Book> listAll();

    Book findById(Long id);

    Book create(Integer isbn, String title, String author, Integer year, Float price, Category category);

    Book update(Long id, Integer isbn, String title, String author, Integer year, Float price, Category category);

    Book delete(Long id);

    List<Book> filter(String title, Integer year, Float price);

    List<Book> filterByCategory(Category category);
}
