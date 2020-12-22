package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;



@RestController
public class StudentRestController {

    StudentService studentService;


    public StudentRestController(StudentService studentService){
        this.studentService = studentService;
    }


    @GetMapping("/index")
    public String index() {
        return "index";
    }

    //Viser alle students
    @GetMapping("/students")
    public Iterable<Student> getStudents(){
        return studentService.findAll();
    }

    //Tilføjer students
    @PostMapping("/add/student")
    public Iterable<Student> addStudent(@RequestBody Student s) {
        studentService.save(s);
        return getStudents();
    }

    //Sletter students
    @DeleteMapping("/delete/{id}")
    public Iterable<Student> delete(@PathVariable Long id){
        studentService.deleteById(id);
        return getStudents();
    }

    //Opdaterer students
    @PutMapping("/update/{id}")
    public Iterable<Student> update(@RequestBody Student s){
        studentService.save(s);
        return getStudents();
    }


}

