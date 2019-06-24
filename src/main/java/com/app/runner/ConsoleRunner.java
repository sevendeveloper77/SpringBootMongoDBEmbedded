package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Product(101,"A",10.1));
		repo.save(new Product(102,"B",20.1));
		repo.save(new Product(103,"C",30.1));
		repo.save(new Product(104,"D",40.1));
		System.out.println("-----------------------");
		repo.findAll().forEach(System.out::println);

	}

}
