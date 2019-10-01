package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemo;
import com.stackroute.domain.Movie;
import com.stackroute.domain.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */

public class Main
{
    public static void main ( String[] args )
    {
        ApplicationContext factory=new AnnotationConfigApplicationContext(config.class);

        //Movie movie = (Movie) factory.getBean(Movie.class);
        //movie.showActor();
        ((AbstractApplicationContext)factory).registerShutdownHook();
         BeanLifecycleDemo beanLifecycleDemo = factory.getBean(BeanLifecycleDemo.class);
         beanLifecycleDemo.show();



    }
}