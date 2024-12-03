package com.featuring.tasks.firstProject.controller;

import com.featuring.tasks.firstProject.entity.TaskEntry;
import com.featuring.tasks.firstProject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    public List<TaskEntry> getAllTasks() {
//        List<TaskEntry> allTasks = taskRepository.findAll();
//        return allTasks;
        return taskService.getAllTasks();
    }

    @PostMapping("/create")
    public TaskEntry createTask(@RequestBody TaskEntry task) {
//        TaskEntry saved = taskRepository.save(task);
//        return saved;
        return taskService.createTask(task);
    }

    @GetMapping("/id/{id}")
    public TaskEntry getTask(@PathVariable Long id) {
//        return taskRepository.findById(id)
//                .orElse(null);  // Better to throw a proper exception here
        return taskService.getTaskById(id);
//       NEVER USE get() directly
//        Optional<TaskEntry> task = taskRepository.findById(id);
//        if (task.isPresent()) {
//            System.out.println("isPresent()");
//            return task.get();
//        } else {
//            System.out.println("task not found");
//        }
//        return null;
    }

    @DeleteMapping("/id/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
//        Optional<TaskEntry> found = taskRepository.findById(id);
//        if (found.isPresent()) {
//            System.out.println("isPresent()");
//            taskRepository.deleteById(id);
//        } else {
//            return "task not found";
//        }
//        return "deleted";
    }

    @PutMapping("/id/{id}")
    public TaskEntry updateTask(@PathVariable Long id, @RequestBody TaskEntry task) {
        return taskService.updateTask(id, task);
//        return taskRepository.findById(id)
//                .map(existingTask -> {
//                    existingTask.setDescription(task.getDescription());
//                    existingTask.setTitle(task.getTitle());
//                    existingTask.setStatus(task.getStatus());
//                    existingTask.setPriority(task.getPriority());
//                    taskRepository.save(existingTask);
//                    return "updated";
//                })
//                .orElse("task not found");
    }
}
