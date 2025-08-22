package com.pucp.lab020252;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Lab020252Application {

	public static void main(String[] args) {

		SpringApplication.run(Lab020252Application.class, args);
		System.out.println("Hola Mundo!");
		List<String> lista = List.of("Elemento1", "Elemento2", "Elemento3");
		for (String s : lista) {
			System.out.println("elemento: " + s);
		}
		System.out.println("API para creacion de mascotas");
	}

}
