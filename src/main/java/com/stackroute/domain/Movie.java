package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware , BeanFactoryAware {
     @Autowired
    private Actor actor;

    private ApplicationContext app;
    private BeanFactory factory;
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public  void showActor(){
        System.out.println(actor.getName());
        System.out.println(actor.getAge());
        System.out.println(actor.getGender());
        System.out.println("actor reached here");
        //  actor.pump();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.app=applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.factory=beanFactory;

    }
}