package com.in28minutes.springboot.MyFirstWebApplication.repositories;


import com.in28minutes.springboot.MyFirstWebApplication.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    public List<Todo> findByUsername(String username);
}