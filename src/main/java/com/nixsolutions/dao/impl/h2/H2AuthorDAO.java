package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.Author;
import com.nixsolutions.dao.AuthorDAO;

import java.util.List;

public class H2AuthorDAO implements AuthorDAO {
    @Override
    public int add(Author author) {
        return 0;
    }

    @Override
    public void edit(Author author) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Author getAuthor(int id) {
        return null;
    }

    @Override
    public List<Author> searchByName(String firstName) {
        return null;
    }

    @Override
    public List<Author> searchByName(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<Author> searchByName(String firstName, String lastName, String patronymic) {
        return null;
    }

    @Override
    public List<Author> getAllAuthors() {
        return null;
    }
}
