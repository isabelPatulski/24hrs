package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentService extends CrudRepository<Student, Long> {

}
