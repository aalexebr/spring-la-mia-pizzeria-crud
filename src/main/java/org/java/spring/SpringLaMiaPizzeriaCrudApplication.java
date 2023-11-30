package org.java.spring;

import org.java.spring.pojo.Pizza;
import org.java.spring.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}
	
	@Autowired
	private PizzaService pizzaService;
	
	@Override
	public void run(String... args) throws Exception {
		
		pizzaService.save(new Pizza("pizza1",5.99,"descr1","https://cdn.drawception.com/drawings/709036/HX97OgbklV.png"));
		pizzaService.save(new Pizza("pizza2",6.99,"descr1","https://cdn.drawception.com/drawings/709036/HX97OgbklV.png"));
		pizzaService.save(new Pizza("pizza3",7.99,"descr1","https://cdn.drawception.com/drawings/709036/HX97OgbklV.png"));
		pizzaService.save(new Pizza("pizza4",8.99,"descr1","https://cdn.drawception.com/drawings/709036/HX97OgbklV.png"));
		
	}
	

}
