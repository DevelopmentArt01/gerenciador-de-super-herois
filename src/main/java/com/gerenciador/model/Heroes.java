package com.gerenciador.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@RedisHash("Heroes")
public class Heroes implements Serializable {

     private static final long serialVersionUID =1L;

    @Id
    private String id;
    private String name;
    private String universe;
    private String films;

}
