package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class StudentController {

    private List<Student> tmpDb = new ArrayList<>();

    public StudentController() {
        super();
//        tmpDb.add(new Student().withFirstName("Daniel").withLastName("Lai").withAge(32));
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return tmpDb;
    }
}
