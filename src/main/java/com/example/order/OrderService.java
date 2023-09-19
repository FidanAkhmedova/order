package com.example.order;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public static OrderService instance = new OrderService();

    private OrderService(){

    }
    private OrderNameService orderNameSequence;

    public Order createNewOrder() {
        Order order = new Order();
        order.setName("Номер заказа №");
//        orderNameSequence.initName(order);
        return order;
    }
}
