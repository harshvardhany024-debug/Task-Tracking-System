package com.example.Task.tracking.system.Service;

import com.example.Task.tracking.system.Entity.Task;
import com.example.Task.tracking.system.repository.TaskRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service  // it helps to determine this class is service class
// this annotaion hepls to manage  and create the object
public class Taskservice {
    private final TaskRepository taskRepository; // creating a refrence of task repo
    public Taskservice(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }// this is constructer injection

    // creating methode for task
    public Task createTask(Task task ){
          return  taskRepository.save(task);// task object come from Controller
    }


    // creting methode for get the task
    public List<Task>  GetTask(Task task){
        return taskRepository.findAll();// findall methdoe  is present in jpa repo

    }

    public Optional<Task> getbyid(int id) {
       return taskRepository.findById(id);


    }
}

