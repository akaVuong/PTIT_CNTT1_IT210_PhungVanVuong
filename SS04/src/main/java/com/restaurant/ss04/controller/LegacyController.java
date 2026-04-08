package com.restaurant.ss04.controller;

import com.restaurant.ss04.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LegacyController {
    private final OrderService orderService;
    @Autowired // Tiêm Service thay vì dùng lệnh new (B1)
    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }

    // B1: Dùng GetMapping thay vì RequestMapping rườm rà
    @GetMapping("/bai1/orders")
    @ResponseBody
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    // Bài 3: Sử dụng @PathVariable để lấy ID từ URL (Cách A - B3)
    @GetMapping("/bai3/orders/{id}")
    @ResponseBody
    public String getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }

// đây là sập bẫy lỗi 400 của B2, test lỗi thêm bai2/menu sau url
//    @GetMapping("/bai2/menu")
//    @ResponseBody
//    public String getMenu(@RequestParam("category") String category) {
//        return "Thuc don loai: " + category;
//    }


    // Bài 2: Xử lý RequestParam với required và defaultValue
    @GetMapping("/bai2/menu")
    @ResponseBody
    public String getMenu(@RequestParam(value = "category", required = false, defaultValue = "chay") String category) {
        return "Thuc don loai: " + category;
    }
}