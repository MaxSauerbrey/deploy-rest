package com.example.deployrest;

import com.example.deployrest.entity.Persona;
import com.example.deployrest.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class DeployRestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DeployRestApplication.class, args);
		PersonRepository repository = context.getBean(PersonRepository.class);


		Persona persona1 = new Persona(null,"Max","Sauerbrey","Argentino","36058488", LocalDate.of(1994, 04, 15),28,1.71d,68d,"maxsauerbrey@gmail.com","1554855982","Donato Alvarez","Flores","CABA-Buenos Aires","Argentina");
		Persona persona2 = new Persona(null,"Homero Jay","Simpson","Estadounidense","222222", LocalDate.of(1956, 05, 12),67,1.83d,108d,"homerosimpson@gmail.com","365784848","Avenida Siempreviva","Springfield","Springfield DC","EEUU");

		System.out.println("Cantidad de personas ingresadas: " + repository.findAll().size());

		repository.save(persona1);
		repository.save(persona2);

		System.out.println("Cantidad de personas ingresadas: " + repository.findAll().size());

	}

}
