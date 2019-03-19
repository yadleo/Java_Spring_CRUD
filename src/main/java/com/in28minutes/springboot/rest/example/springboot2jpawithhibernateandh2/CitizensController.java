package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citizens")
public class CitizensController {
    private final CitizenRepository repository;

    public CitizensController(CitizenRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public Iterable<Citizen> all() {
        return this.repository.findAll();
    }

    @PostMapping("")
    public Citizen create(@RequestBody Citizen citizen) {
        return (Citizen) this.repository.save(citizen);
    }
}