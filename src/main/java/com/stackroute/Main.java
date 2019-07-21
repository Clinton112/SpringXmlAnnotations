package com.stackroute;

import com.stackroute.config.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Config.class);
        annotationConfigApplicationContext.refresh();
        Movie movie=annotationConfigApplicationContext.getBean("movieA",Movie.class);
        Movie movie1=annotationConfigApplicationContext.getBean("movieB",Movie.class);
        System.out.println(movie1==movie);

    }
}
