package com.featuring.tasks.firstProject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class Tasks {

    @GetMapping("/")
    public String getALlTasks() {
        return "OK getALlTasks()";
    }

    @PostMapping("/")
    public String createTask() {
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
