package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.BeanLifecycleDemoBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Config.class);
        annotationConfigApplicationContext.refresh();
        annotationConfigApplicationContext.scan("com.stackroute");
        Movie movie1=annotationConfigApplicationContext.getBean("movie",Movie.class);
        System.out.println(movie1);
        BeanLifecycleDemoBean beanLifecycleDemoBean=annotationConfigApplicationContext.getBean(BeanLifecycleDemoBean.class);
        annotationConfigApplicationContext.registerShutdownHook();


    }
}
