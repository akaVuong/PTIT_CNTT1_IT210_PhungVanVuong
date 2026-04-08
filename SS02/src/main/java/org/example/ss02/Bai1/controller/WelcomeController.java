package org.example.ss02.Bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("name", "Gia Bao");
        return "welcome";
    }
}