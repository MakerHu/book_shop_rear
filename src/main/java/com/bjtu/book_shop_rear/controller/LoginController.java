package com.bjtu.book_shop_rear.controller;

import com.bjtu.book_shop_rear.dao.IUserDao;
import com.bjtu.book_shop_rear.entity.User;
import com.bjtu.book_shop_rear.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

//    @GetMapping
//    public User findByEmail(@RequestParam String email){
//        return userService.findByEmail(email);
//    }

    @GetMapping
    public User findByEmail(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("msg","session信息");
        System.out.println(session);
        return userService.findByEmail("hjh@qq.com");
    }

    @GetMapping("/test")
    public void test(HttpServletRequest request){
        System.out.println("test");
        HttpSession session = request.getSession();
        String msg = session.getAttribute("msg").toString();
        System.out.println(msg);
    }
}
