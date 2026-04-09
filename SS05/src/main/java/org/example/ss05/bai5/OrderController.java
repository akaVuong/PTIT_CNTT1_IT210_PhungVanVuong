package org.example.ss05.bai5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
    @GetMapping("/bai5/quick-order")
    public String quickOrder(Model model) {
        // Dữ liệu thật từ "Database" giả lập
        model.addAttribute("promo", "Ưu đãi: Giảm 10% cho đơn hàng đầu tiên!");
        return "quick-order";
    }
}