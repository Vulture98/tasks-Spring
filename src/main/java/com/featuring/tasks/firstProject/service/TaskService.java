package com.featuring.tasks.firstProject.service;

import com.featuring.tasks.firstProject.entity.TaskEntry;
import java.util.List;

public interface TaskService {
    List<TaskEntry> getAllTasks();
    TaskEntry getTaskById(Long id);
    TaskEntry createTask(TaskEntry task);
    TaskEntry updateTask(Long id, TaskEntry task);
    void deleteTask(Long id);
}