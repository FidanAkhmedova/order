package com.example.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        OrderService orderService = new OrderService();
        System.out.println(orderService.createNewOrder());
        System.out.println(orderService.createNewOrder());
        System.out.println(orderService.createNewOrder());
        System.out.println(orderService.createNewOrder());
    }
}
