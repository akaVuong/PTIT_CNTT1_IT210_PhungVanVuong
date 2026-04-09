package org.example.ss05.bai5;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public double calculateTotal(double price) {
        return price * 1.1; // Tính thêm 10% thuế VAT
    }
}