package org.example.ss05.bai2;


import org.example.ss05.model.Dish;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DishController {
    @GetMapping("/bai2/dishes")
    public String listDishes(Model model) {
        List<Dish> list = new ArrayList<>();
        list.add(new Dish(1, "Phở Bò", 50000, true));
        list.add(new Dish(2, "Bún Đậu Mắm Tôm", 45000, false)); // Hết hàng

        // Bẫy dữ liệu: có thể comment dòng add ở trên để test trường hợp list rỗng
        model.addAttribute("dishes", list);
        return "dish-list";
    }
}
