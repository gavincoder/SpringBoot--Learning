package demo.springboot.mapper;


import demo.springboot.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<Book> queryAllUsers();
    void addUser(Book user);
    void deleteUser(Book book);

}

