package com.example.order;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private OrderNameService orderNameSequence;
    public Order createNewOrder(){
        Order order = new Order();
        orderNameSequence.initName(order);
        return order;
    }
}
