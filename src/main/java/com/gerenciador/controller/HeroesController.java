package com.gerenciador.controller;

import com.gerenciador.model.Heroes;
import com.gerenciador.service.HeroesService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class HeroesController {

    @Autowired
    private HeroesService heroesService;

    //listar todos
    @GetMapping("/list")
    @Operation(summary = "LISTA TODOS OS PERSONAGENS")
    public Flux<Heroes> list(){ return heroesService.getAll();}


    //lista um heroi pelo id
    @GetMapping("/list/{id}")
    @Operation(summary = "LISTA OS PERSONAGENS POR ID")
    public Mono<Heroes> listById(@PathVariable String id){ return heroesService.lisId(id);}

    //cria um novo
    @PostMapping("/save")
    @Operation(summary = "SALVA UM HEROI")
    public Mono<Heroes> save(@RequestBody Heroes heroes){
        return heroesService.save(heroes);
    }

    //atualiza um heroi
    @PutMapping("/update")
    @Operation(summary = "ATUALIZA UM HEROI")
    public Mono<Heroes> update(@RequestBody Heroes heroes){ return heroesService.save(heroes); }

    //deleta um heroi
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "DELETA UM HEROI")
    public Mono<Boolean> del(@PathVariable String id){ return heroesService.delete(id);}




}
