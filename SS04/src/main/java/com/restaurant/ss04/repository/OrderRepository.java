package com.restaurant.ss04.repository;

import org.springframework.stereotype.Repository;

@Repository // Đánh dấu là Bean tầng dữ liệu (B1)
public class OrderRepository {

    public String getAllOrders() {
        return "Danh sach toan bo don hang";
    }

    //phần B3
    public String getOrderById(Long id) {
        return "Chi tiet don hang so " + id;
    }
}