package com.kadconsulting.springcontext;

import com.kadconsulting.springcontext.beans.Animal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringContextApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringContextApplication.class, args);

		Animal animalBean = context.getBean("animal",Animal.class);
		Animal animal2Bean = context.getBean("animal2",Animal.class);

		System.out.println(animalBean);
		System.out.println(animal2Bean);
	}

}
