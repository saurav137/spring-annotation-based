package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemo implements InitializingBean, DisposableBean {
    public void show(){
        System.out.println("working in Bean Life cycle demo");
    }
    public void customInit(){
        System.out.println("Started even before starting");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Started");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Ended");
    }
    public void customDestroy(){
        System.out.println("Ending here");
    }
}
