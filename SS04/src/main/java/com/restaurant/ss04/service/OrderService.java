package com.restaurant.ss04.service;

import com.restaurant.ss04.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Đánh dấu là Bean tầng nghiệp vụ (B1)
public class OrderService {
    private final OrderRepository orderRepository;
    @Autowired // Tiêm phụ thuộc qua Constructor (B1)
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getAllOrders() {
        return orderRepository.getAllOrders();
    }

    public String getOrderById(Long id) {
        return orderRepository.getOrderById(id);
    }
}