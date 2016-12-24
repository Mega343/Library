package com.nixsolutions.dao;

import com.nixsolutions.bean.Book;

import java.util.List;

public interface BookDAO {

    public int add(Book book);

    public void edit(Book book);

    public void delete(int id);

    public Book getBook(int id);

    public List<Book> searchByAuthor(int id);

    public List<Book> searchByBookName(String bookName);

    public List<Book> searchByPublishingHouse(int id);

    public List<Book> searchByGenre(int id);

    public List<Book> searchByRateGreaterThan(int rate);

    public List<Book> searchByReadingsGreaterThan(int rate);

    public List<Book> getAllBooks();
}
