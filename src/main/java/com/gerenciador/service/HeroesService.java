package com.gerenciador.service;


import com.gerenciador.model.Heroes;
import com.gerenciador.repository.HeroesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HeroesService{



    @Autowired
    private HeroesRepository heroesRepository;


     public Flux<Heroes> getAll(){
         return Flux.fromIterable(heroesRepository.findAll());
     }

     public Mono<Heroes> save(Heroes heroes){
         return Mono.justOrEmpty(heroesRepository.save(heroes));
     }

     public Mono<Heroes> getById(String id){
         return Mono.justOrEmpty(heroesRepository.findById(id));
     }



     public Mono<Boolean> delete(String id){

          heroesRepository.deleteById(id);

         return Mono.just(true);
     }

    public Mono<Heroes> lisId(String id) {
         return Mono.justOrEmpty(heroesRepository.findById(id));
    }

//    public Mono<Heroes> getByNameUniverse(String nameUniverse ){
//
//            Mono<Heroes> heroesMono = heroesRepository.findByNameUniverse(nameUniverse);
//
//            return heroesMono;
//    }
}


