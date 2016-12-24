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
    public void delete(int id) {

    }

    @Override
    public Book getBook(int id) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(int id) {
        return null;
    }

    @Override
    public List<Book> searchByBookName(String bookName) {
        return null;
    }

    @Override
    public List<Book> searchByPublishingHouse(int id) {
        return null;
    }

    @Override
    public List<Book> searchByGenre(int id) {
        return null;
    }

    @Override
    public List<Book> searchByRateGreaterThan(int rate) {
        return null;
    }

    @Override
    public List<Book> searchByReadingsGreaterThan(int rate) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }
}
