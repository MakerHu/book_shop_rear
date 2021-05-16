package com.bjtu.book_shop_rear.dao;

import com.bjtu.book_shop_rear.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("userDao")
public interface IUserDao {
    public User findByEmail(String email);
}
