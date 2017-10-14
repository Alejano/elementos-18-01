package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1801Application {
@Autowired RepositorioMensajito repoMensa;

	public static void main(String[] args) {
		SpringApplication.run(Elementos1801Application.class, args);
	}
}
