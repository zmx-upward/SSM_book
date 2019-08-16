package com.zmx.service;

import com.zmx.dao.IBookDao;
import com.zmx.entity.Book;
import com.zmx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private IBookDao iBookDao;

    /**
     * 查询操作
     */
    @Override
    public List<Book> listAll() {
        return iBookDao.listAll();
    }
    /**
     * 根据id查询
     */
    public  Book findById(int id){
        return iBookDao.findById(id);
    }

    /**
     * 添加操作
     *
     * @param book
     */
    @Override
    public int insert(Book book) {
        return iBookDao.insert(book);
    }

    /**
     * 删除操作
     */
    @Override
    public boolean delete(int id){
        return iBookDao.delete(id);
    }

    /**
     * 编辑操作
     */
    @Override
    public boolean update(Book book){
        return iBookDao.update(book);
    }
}
