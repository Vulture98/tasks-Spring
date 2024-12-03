public class TaskControllerServiceGPT {
    
}
package com.featuring.tasks.firstProject.controller;

import com.featuring.tasks.firstProject.entity.TaskEntry;
import com.featuring.tasks.firstProject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;  // Use service instead of repository

    @GetMapping
    public List<TaskEntry> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public TaskEntry createTask(@RequestBody TaskEntry task) {
        return taskService.createTask(task);
    }

    @GetMapping("/{id}")
    public TaskEntry getTask(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    @PutMapping("/{id}")
    public TaskEntry updateTask(@PathVariable Long id, @RequestBody TaskEntry task) {
        return taskService.updateTask(id, task);
    }
}