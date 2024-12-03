package com.featuring.tasks.firstProject.repository;


import com.featuring.tasks.firstProject.entity.TaskEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntry, Long> {
}
