package com.featuring.tasks.firstProject.controller;

import com.featuring.tasks.firstProject.entity.TaskEntry;
import com.featuring.tasks.firstProject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/all")
    public List<TaskEntry> getAllTasks() {
        List<TaskEntry> allTasks = taskRepository.findAll();
        return allTasks;
    }

    @PostMapping("/create")
    public TaskEntry createTask(@RequestBody TaskEntry task) {
        TaskEntry saved = taskRepository.save(task);
        return saved;
    }

    @GetMapping("/id/{id}")
    public TaskEntry getTask(@PathVariable Long id) {
        Optional<TaskEntry> task = taskRepository.findById(id);
        if (task.isPresent()) {
            System.out.println("isPresent()");
            return task.get();
        } else {
            System.out.println("task not found");
        }
        return null;
    }

    @DeleteMapping("/id/{id}")
    public String deleteTask(@PathVariable Long id) {
        Optional<TaskEntry> found = taskRepository.findById(id);
        if (found.isPresent()) {
            System.out.println("isPresent()");
            taskRepository.deleteById(id);
        } else{
            return "task not found";
        }
        return "deleted";
    }

    @PutMapping("/id/{id}")
    public String updateTask(@PathVariable Long id, @RequestBody TaskEntry task) {
        Optional<TaskEntry> found = taskRepository.findById(id);
        System.out.println("found: " + found);
        if (found.isPresent()) {
            TaskEntry existingTask = found.get();

            existingTask.setTitle(task.getTitle());
            existingTask.setDescription(task.getDescription());
            existingTask.setStatus(task.getStatus());
            existingTask.setPriority(task.getPriority());

            taskRepository.save(existingTask);

            return "updated";
        } else {
            return "task not found";
        }
    }
}
