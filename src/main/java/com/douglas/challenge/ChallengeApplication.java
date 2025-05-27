package com.douglas.challenge;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.douglas.challenge.entities.Order;
import com.douglas.challenge.services.OrderService;

@SpringBootApplication
public class ChallengeApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//OBS: descomentar exemplos para testar os outros valores
		//Exemplo 1:
		Order order = new Order(1034, 150.00, 20.0);
		//Exemplo 2:
		//Order order = new Order(2282, 800.00, 10.0);
		//Exemplo 3:
		//Order order = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println(String.format(Locale.US, "Valor total: R$ %.2f", orderService.total(order)));
	}

}
