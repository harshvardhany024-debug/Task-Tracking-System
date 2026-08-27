package com.example.Task.tracking.system.Service;

import com.example.Task.tracking.system.Entity.Task;
import com.example.Task.tracking.system.repository.TaskRepository;
import org.springframework.stereotype.Service;

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

}

