package com.kadconsulting.springcontext.config;

import com.kadconsulting.springcontext.beans.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {

    @Bean
    public Animal animal(){
        Animal baba = new Animal();
        baba.setName("Baba");
        baba.setColor("Grey");

        return baba;
    }

    @Bean
    public Animal animal2(){
        Animal panda = new Animal();
        panda.setName("Panda");
        panda.setColor("Black&White");

        return panda;
    }

}
