package org.example.ss05.bai3;

import org.example.ss05.model.Dish;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminDishController {
    @GetMapping("/bai3/edit/{id}")
    public String showEdit(@PathVariable int id, Model model, RedirectAttributes ra) {
        // Bẫy dữ liệu: Giả sử chỉ có món ID từ 1-100
        if (id > 100) {
            ra.addFlashAttribute("errorMessage", "Không tìm thấy món ăn yêu cầu!");
            return "redirect:/bai2/dishes";
        }
        Dish dish = new Dish(id, "Cơm Tấm", 35000, true);
        model.addAttribute("dish", dish);
        return "edit-dish";
    }
}