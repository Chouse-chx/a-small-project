package com.itheima.service;

import com.itheima.domain.Book;

import java.util.List;

public interface BookService {

    /**
     * 保存图书
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 更新图书信息
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据id删除图书
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询图书
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部图书
     * @return
     */
    public List<Book> getAll();
}
