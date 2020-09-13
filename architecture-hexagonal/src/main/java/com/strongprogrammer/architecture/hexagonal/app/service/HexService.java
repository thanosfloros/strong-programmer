package com.strongprogrammer.architecture.hexagonal.app.service;

import com.strongprogrammer.architecture.hexagonal.domain.entity.Book;
import com.strongprogrammer.architecture.hexagonal.domain.entity.User;

import java.util.List;

/**
 * @author Thanos Floros (thanosfloros@strong-programmer.com)
 */
public interface HexService {

    List<User> getUsers();

    List<Book> getBooks();

    void insertData();
}
