package com.example.order;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public Order createNewOrder() {
        Order order = new Order();
        order.setName("Hello Java");
        return order;
    }
}
