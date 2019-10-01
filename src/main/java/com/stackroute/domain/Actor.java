package com.stackroute.domain;

import org.springframework.beans.factory.BeanNameAware;

public class Actor {
    private String name;
    private int age;
    private String gender;


    public Actor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("actor created");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}