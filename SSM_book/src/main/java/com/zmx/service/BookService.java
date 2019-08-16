package com.zmx.service;

import com.zmx.entity.Book;

import java.util.List;

public interface BookService {
    /**
     * 查询操作
     */
    List<Book> listAll();
    /**
     * 根据id查询
     */
    Book findById(int id);

    /**
     * 添加操作
     */
    int insert(Book book);

    /**
     * 删除操作
     */
    boolean delete(int id);

    /**
     * 编辑操作
     */
    boolean update(Book book);
}