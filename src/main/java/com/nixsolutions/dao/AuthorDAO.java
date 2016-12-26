package com.nixsolutions.dao;

import com.nixsolutions.bean.Author;

import java.util.List;

public interface AuthorDAO {

    public int add(Author author);

    public void edit(Author author);

    public void delete(Integer id);

    public Author getAuthor(Integer id);

    public List<Author> searchByName(String firstName);

    public List<Author> searchByName(String firstName, String lastName);

    public List<Author> searchByName(String firstName, String lastName, String patronymic);

    public List<Author> getAllAuthors();
}
