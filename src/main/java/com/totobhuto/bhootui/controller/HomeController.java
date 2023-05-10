package com.totobhuto.bhootui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Bhoot UI - Home");
        model.addAttribute("message", "This is a simple Spring-Boot app, built with Thymeleaf, which allows you to validate JSON, and convert JSON to POJOs");
        model.addAttribute("homePage", true);

        return "home";
    }


}
