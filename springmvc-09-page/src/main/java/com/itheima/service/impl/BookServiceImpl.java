package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    /**
     * 保存图书
     *
     * @param book
     * @return
     */
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    /**
     * 更新图书信息
     *
     * @param book
     * @return
     */
    public boolean update(Book book) {
        return bookDao.update(book) > 0;

    }

    /**
     * 根据id删除图书
     *
     * @param id
     * @return
     */
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;

    }

    /**
     * 根据id查询图书
     *
     * @param id
     * @return
     */
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    /**
     * 查询全部图书
     *
     * @return
     */
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
