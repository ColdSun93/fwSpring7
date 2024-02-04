package ru.coldsun.homework7.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    /**
     * Домашняя страница авторизации "/login"
     */
    @GetMapping("/login")
    public String auth() {
        return "login.html";
    }

    /**
     * Страница для пользователей с ролью USER.
     */
    @GetMapping("/public-data")
    public String userPage(){
        return "public-data.html";
    }

    /**
     * Страница для пользователей с ролью ADMIN.
     */
    @GetMapping("/private-data")
    public String adminPage(){
        return "private-data.html";
    }



}
