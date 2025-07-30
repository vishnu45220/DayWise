package com.example.spring_product;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringProductApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringProductApplication.class, args);
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		product pro=(product)context.getBean("Product");
		pro.getProductname();
		pro.getDescription();
	}

}
