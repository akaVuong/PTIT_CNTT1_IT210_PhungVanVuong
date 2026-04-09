package org.example.ss05.bai3;

import org.example.ss05.model.Dish;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminDishService {
    // Giả lập danh sách món ăn trong hệ thống
    private List<Dish> mockData = new ArrayList<>();
    public AdminDishService() {
        mockData.add(new Dish(1, "Phở Bò", 50000, true));
        mockData.add(new Dish(2, "Bún Chả", 45000, true));
    }

    public Dish getDishById(int id) {
        return mockData.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null); // Trả về null nếu không tìm thấy
    }
}