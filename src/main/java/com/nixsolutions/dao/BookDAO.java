package com.nixsolutions.dao;

import com.nixsolutions.bean.Book;

import java.util.List;

public interface BookDAO {

    public int add(Book book);

    public void edit(Book book);

    public void delete(Long id);

    public Book getBook(Long id);

    public List<Book> searchByAuthor(Integer id);

    public List<Book> searchByBookName(String bookName);

    public List<Book> searchByPublishingHouse(Integer id);

    public List<Book> searchByGenre(Integer id);

    public List<Book> searchByRateGreaterThan(Integer rate);

    public List<Book> searchByReadingsGreaterThan(Integer rate);

    public List<Book> getAllBooks();
}
