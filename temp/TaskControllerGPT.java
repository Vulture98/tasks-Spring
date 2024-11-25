/**
 * This is a temporary version of the TaskController class, which is written in GPT style.
 * It's here to help us understand how the GPT code generator works.
 * windsurd-claude
 */
package com.featuring.tasks.firstProject.controller;

import com.featuring.tasks.firstProject.entity.TaskEntry;
import com.featuring.tasks.firstProject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/_tasks")
public class TaskControllerGPT {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<TaskEntry> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping
    public TaskEntry createTask(@RequestBody TaskEntry task) {
        return taskRepository.save(task);
    }

    @GetMapping("/{id}")  // Changed from /id/:id to /{id}
    public TaskEntry getTask(@PathVariable Long id) {
        return taskRepository.findById(id)
                .orElse(null);  // Better to throw a proper exception here
    }

    @DeleteMapping("/{id}")  // Changed from /id/:id to /{id}
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }

    @PutMapping("/{id}")  // Changed from /id/:id to /{id}
    public TaskEntry updateTask(@PathVariable Long id, @RequestBody TaskEntry task) {
        return taskRepository.findById(id)
                .map(existingTask -> {
                    existingTask.setTitle(task.getTitle());
                    existingTask.setDescription(task.getDescription());
                    existingTask.setStatus(task.getStatus());
                    existingTask.setPriority(task.getPriority());
                    return taskRepository.save(existingTask);
                })
                .orElse(null);  // Better to throw a proper exception here
    }
}