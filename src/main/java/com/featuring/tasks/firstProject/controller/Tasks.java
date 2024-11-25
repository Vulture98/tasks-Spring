package com.featuring.tasks.firstProject.controller;

import com.featuring.tasks.firstProject.entity.User;
import com.featuring.tasks.firstProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class Tasks {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public String getAllTasks() {
        return "OK getAllTasks()";
    }

    @PostMapping("/create")
    public String createTask(@RequestBody User user) {
        userRepository.save(user);
        return "OK createTask()";
    }

    @GetMapping("/id/:id")
    public String getTask() {
        return "OK getTask()";
    }

    @DeleteMapping("/id/:id")
    public String deleteTask() {
        return "OK deleteTask()";
    }

    @PutMapping("/id/:id")
    public String updateTask() {
        return "OK updateTask()";
    }
}
