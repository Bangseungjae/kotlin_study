package com.example.kotlin_study.study.three;

import java.util.UUID;

public class Person {
    String name;
    Integer age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String myAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
