package com.bjtu.book_shop_rear.service;

import com.bjtu.book_shop_rear.entity.User;

public interface UserService {
    void add(User user);
    User findByEmail(String email);
}
