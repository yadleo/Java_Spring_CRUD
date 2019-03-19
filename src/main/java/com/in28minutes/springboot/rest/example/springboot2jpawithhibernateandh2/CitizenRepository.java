package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2;

import org.springframework.data.repository.CrudRepository;

public interface CitizenRepository extends CrudRepository<Citizen, Long> {
}
