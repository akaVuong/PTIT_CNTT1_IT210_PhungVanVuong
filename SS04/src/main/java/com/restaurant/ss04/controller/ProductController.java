package com.restaurant.ss04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    // Bài 4: Trả về View JSP và dùng ModelMap đẩy dữ liệu
    @GetMapping("/bai4/products")
    public String getProductList(
            @RequestParam("category") String category,
            @RequestParam("limit") int limit, ModelMap model) {

        // Dùng chaining method đẩy 3 biến ra View (Bài 4)
        model.addAttribute("category", category)
                .addAttribute("limit", limit)
                .addAttribute("message", "Tim kiem thanh cong");
        return "productList";
    }
}