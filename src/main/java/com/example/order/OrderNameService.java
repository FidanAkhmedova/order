package com.example.order;

public class OrderNameService {

    private static Long orderSequence = 1l;

    public void initName(Order order){
        order.setName("Заказ #" + orderSequence++);
    }
}
