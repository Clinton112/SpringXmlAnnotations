package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

public class BeanPostProcessorDemoBean implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("I am going to be initialized");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("I am Initialized");
        return null;
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean()
    {
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=new BeanPostProcessorDemoBean();
        return beanPostProcessorDemoBean;
    }
}
