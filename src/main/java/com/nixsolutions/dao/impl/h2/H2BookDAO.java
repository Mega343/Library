package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.Book;
import com.nixsolutions.dao.BookDAO;

import java.util.List;

public class H2BookDAO implements BookDAO {
    @Override
    public int add(Book book) {
        return 0;
    }

    @Override
    public void edit(Book book) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Book getBook(Long id) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(Integer id) {
        return null;
    }

    @Override
    public List<Book> searchByBookName(String bookName) {
        return null;
    }

    @Override
    public List<Book> searchByPublishingHouse(Integer id) {
        return null;
    }

    @Override
    public List<Book> searchByGenre(Integer id) {
        return null;
    }

    @Override
    public List<Book> searchByRateGreaterThan(Integer rate) {
        return null;
    }

    @Override
    public List<Book> searchByReadingsGreaterThan(Integer rate) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }
}
