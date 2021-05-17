package com.bjtu.book_shop_rear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BookShopRearApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookShopRearApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder encoding(){
        return new BCryptPasswordEncoder();
    }

}
