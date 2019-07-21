package com.stackroute.config;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config
{
    @Bean
    public Actor actor()
    {
        Actor actor=new Actor();
        actor.setName("Ashok");
        actor.setGender("M");
        actor.setAge(32);
        return actor;
    }

    @Bean
    public Actor actorSharukh()
    {
        Actor actor=new Actor("Sharukh","M",55);
        return actor;
    }

    @Bean
    public Actor actorHrithik()
    {
        Actor actor=new Actor("Hrithik","M",45);
        return actor;
    }

    @Bean
    public Actor actorKatrina()
    {
        Actor actor=new Actor("Katrina","F",32);
        return actor;
    }

    @Bean
    public Movie movie()
    {
        Movie movie=new Movie(actorKatrina());
        return movie;
    }

    @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
    public BeanLifecycleDemoBean beanLifecycleDemoBean() {
        return new BeanLifecycleDemoBean();
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean() {
        return new BeanPostProcessorDemoBean();
    }
}
