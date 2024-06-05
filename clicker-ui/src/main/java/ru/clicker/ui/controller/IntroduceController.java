package ru.clicker.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroduceController {

    @GetMapping("/")
    public String redirectToIndexPage() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }
}
