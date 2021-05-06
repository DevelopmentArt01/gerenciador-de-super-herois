package com.gerenciador.repository;


import com.gerenciador.model.Heroes;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@EnableRedisRepositories
@Repository
public interface HeroesRepository extends CrudRepository<Heroes, String> {


//    Mono<Heroes> findByNameUniverse(String name);

}
