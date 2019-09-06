package com.example.catservice;

import com.example.catservice.Repository.ProduitRepository;
import com.example.catservice.entitites.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatServiceApplication  implements CommandLineRunner {
@Autowired
private ProduitRepository produitRepository;
	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		produitRepository.save(new Produit(null,"ordinateur LX 45",6700,3));
		produitRepository.save(new Produit(null,"ordinateur LX 45",6700,3));


	}
}
