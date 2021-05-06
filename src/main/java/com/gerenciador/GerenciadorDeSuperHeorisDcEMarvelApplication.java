package com.gerenciador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class GerenciadorDeSuperHeorisDcEMarvelApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorDeSuperHeorisDcEMarvelApplication.class, args);
    }

}
