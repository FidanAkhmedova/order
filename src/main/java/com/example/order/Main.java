package com.example.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.order")
public class Main implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

//    private final OrderService orderService;

//    public Main(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(OrderService.class);
        OrderService orderService = context.getBean(OrderService.class);
        LOG.info("TEST >>>>>>>>>>>>>>>>> {}", orderService.createNewOrder());
    }
}
