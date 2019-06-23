package demo.springboot.service.impl;

import demo.springboot.domain.Book;
import demo.springboot.mapper.UserMapper;
import demo.springboot.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 业务层实现
 *
 */
@Slf4j
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private UserMapper userMapper;

    // 模拟数据库，存储 Book 信息
    private static Map<Long, Book> BOOK_DB = new HashMap<>();

    @Override
    public List<Book> findAll() {
        log.info("data: {}", userMapper.queryAllUsers());
        return new ArrayList<>(userMapper.queryAllUsers());
    }

    @Override
    public Book insertByBook(Book book) {
        userMapper.addUser(book);
        return book;
    }

    @Override
    public Book update(Book book) {
        return book;
    }

    @Override
    public Book delete(Book book) {
        userMapper.deleteUser(book);
        return null;
    }

    @Override
    public Book findById(String id) {
        return BOOK_DB.get(id);
    }
}
