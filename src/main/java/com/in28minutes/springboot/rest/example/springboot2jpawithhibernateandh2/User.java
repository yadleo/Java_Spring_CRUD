package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class User<S extends User<S>> {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;


    public User() {
        super();
    }

    protected S me() {
        return (S) this;
    }

    public S withId(long id) {
        setId(id);
        return me();
    }

    public S withFirstName(String firstName) {
        setFirstName(firstName);
        return me();
    }

    public S withLastName(String lastName) {
        setLastName(lastName);
        return me();
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
