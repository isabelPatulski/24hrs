package com.example.demo.repository;

import com.example.demo.model.Supervisor;
import org.springframework.data.repository.CrudRepository;

public interface SupervisorService extends CrudRepository<Supervisor, Long> {
}
