package com.example.order;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main  {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("C:\\Users\\fidan.ahmadova\\IdeaProjects\\order1\\src\\main\\java\\com\\example\\order");

        OrderService orderService = context.getBean(OrderService.class);
        OrderNameService orderNameService = context.getBean(OrderNameService.class);

        Order order = orderService.createNewOrder();
        System.out.println(order);

        orderNameService.initName(order);
        System.out.println(order);

      /*  System.out.println(orderService.createNewOrder());
        System.out.println(orderService.createNewOrder());
        System.out.println(orderService.createNewOrder());
        System.out.println(orderService.createNewOrder());*/
    }
}
