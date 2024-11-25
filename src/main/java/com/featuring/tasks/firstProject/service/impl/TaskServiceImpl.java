package com.featuring.tasks.firstProject.service.impl;

import com.featuring.tasks.firstProject.entity.TaskEntry;
import com.featuring.tasks.firstProject.repository.TaskRepository;
import com.featuring.tasks.firstProject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<TaskEntry> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public TaskEntry getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElse(null);  // Better to throw custom exception
    }

    @Override
    public TaskEntry createTask(TaskEntry task) {
        return taskRepository.save(task);
    }

    @Override
    public TaskEntry updateTask(Long id, TaskEntry task) {
        return taskRepository.findById(id)
                .map(existingTask -> {
                    existingTask.setTitle(task.getTitle());
                    existingTask.setDescription(task.getDescription());
                    existingTask.setStatus(task.getStatus());
                    existingTask.setPriority(task.getPriority());
                    return taskRepository.save(existingTask);
                })
                .orElse(null);  // Better to throw custom exception
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}