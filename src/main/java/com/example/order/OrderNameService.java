package com.example.order;

import org.springframework.stereotype.Component;

@Component
public class OrderNameService {
    private static long orderSequence = 1L;

    public void initName(Order order){
        order.setName("Заказ #" + orderSequence++);

    }
}
