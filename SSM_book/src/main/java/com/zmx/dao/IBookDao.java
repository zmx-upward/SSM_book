package com.zmx.dao;

import com.zmx.entity.Book;
import java.util.List;

public interface IBookDao {

    int insert(Book book);

    boolean delete(int id);

    boolean update(Book book);

    List<Book> listAll();

    Book findById(int id);

}