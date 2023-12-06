package org.java.spring.service;

import java.util.List;

import org.java.spring.pojo.Pizza;
import org.java.spring.repo.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
	
	@Autowired
	private PizzaRepository pizzaRepo;
	
	public List<Pizza> findAll(){
		return pizzaRepo.findAll();
	}
	
	public Pizza findById(int id) {
		return pizzaRepo.findById(id).get();
	}
	
	public void save(Pizza pizza) {
		pizzaRepo.save(pizza);
	}
	
	public List<Pizza> findByName(String x){
		
		return pizzaRepo.findByNameContaining(x);
	}
	
public void delete(Pizza pizza) {
		
	pizzaRepo.delete(pizza);
	}
	public void deleteById(int id) {
		
		pizzaRepo.deleteById(id);
	}
}
