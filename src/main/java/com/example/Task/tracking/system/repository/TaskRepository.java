package com.example.Task.tracking.system.repository;

import com.example.Task.tracking.system.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer > {
}
