package com.featuring.tasks.firstProject.controller;

import com.featuring.tasks.firstProject.entity.User;
import com.featuring.tasks.firstProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAllTasks() {
        List<User> allTasks = userRepository.findAll();
        return allTasks;
    }

    @PostMapping("/create")
    public User createTask(@RequestBody User user) {
        User saved = userRepository.save(user);
        return saved;
    }

    @GetMapping("/id/{id}")
    public User getTask(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElse(null);  // Better to throw a proper exception here
    }

    @DeleteMapping("/id/{id}")
    public String deleteTask(@PathVariable Long id) {
        Optional<User> found = userRepository.findById(id);
        if (found.isPresent()) {
            System.out.println("isPresent()");
            userRepository.deleteById(id);
        } else {
            return "user not found";
        }
        return "deleted";
    }

    @PutMapping("/id/{id}")
    public String updateTask(@PathVariable Long id, @RequestBody User user) {
        return userRepository.findById(id)
                .map(existingTask -> {
                    existingTask.setName(user.getName());
                    existingTask.setEmail(user.getEmail());
                    existingTask.setPassword(user.getPassword());
                    userRepository.save(existingTask);
                    return "updated";
                })
                .orElse("user not found");
    }
}
