package com.bjtu.book_shop_rear.dao;

import com.bjtu.book_shop_rear.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("bookDao")
public interface IBookDao {
    Book findById(Integer id);
}
