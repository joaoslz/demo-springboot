package edu.ifma.dcomp.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {

		System.out.println("Carregando a nossa primeira aplicação com Github e TravisCI");
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}
}
