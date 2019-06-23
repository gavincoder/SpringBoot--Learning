package demo.springboot.service;

import demo.springboot.domain.Book;

import java.util.List;

/**
 * 业务接口层
 *
 */
public interface BookService {
    /**
     * 获取所有 Book
     */
    List<Book> findAll();

    /**
     * 新增 Book
     *
     */
    Book insertByBook(Book book);

    /**
     * 更新 Book
     *
     */
    Book update(Book book);

    /**
     * 删除 Book
     *
     */
    Book delete(Book book);

    /**
     * 获取 Book
     *
     */
    Book findById(String id);
}
