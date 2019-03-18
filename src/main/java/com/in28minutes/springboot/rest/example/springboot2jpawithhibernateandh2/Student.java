package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2;

import javax.persistence.Entity;

//@Entity
public class Student extends User<Student> {

    private int age;

    public Student withAge(int age) {
        setAge(age);
        return me();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

