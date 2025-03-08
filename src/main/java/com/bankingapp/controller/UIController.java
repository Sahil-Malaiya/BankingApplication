package com.bankingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Important for serving HTML pages
public class UIController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "html/login"; // Refers to src/main/resources/static/html/login.html
    }
}
