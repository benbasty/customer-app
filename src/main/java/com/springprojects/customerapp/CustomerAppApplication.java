package com.springprojects.customerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerAppApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		Customer c1 = context.getBean("customer1", Customer.class);
		Customer c2 = context.getBean("customer2", Customer.class);
		Customer c3 = context.getBean("customer3", Customer.class);
		Customer c4 = context.getBean("customer4", Customer.class);

		System.out.println();
		System.out.println(c1);
		System.out.println("=============================");
		System.out.println(c2);
		System.out.println("=============================");
		System.out.println(c3);
		System.out.println("=============================");
		System.out.println(c4);
		System.out.println("=============================");

	}

}
