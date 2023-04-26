package com.example.annotations;

import com.example.annotations.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {

		var context =SpringApplication.run(AnnotationsApplication.class, args);
		//used get bean to get the controller class by assigning the value to the controller class by creating the object
		PizzaController pizzaController= context.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());
	}


}
