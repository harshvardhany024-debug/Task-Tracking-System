package com.example.Task.tracking.system.conteroller;

import com.example.Task.tracking.system.Entity.Task;
import com.example.Task.tracking.system.Service.Taskservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// reastcontroller are use to help class to handle rest request
@RestController
@RequestMapping("/Task")
public class Taskcontroller {
    //@requestmapping is use  url mapping define karne ke liye  means is controllerr ke andrjo url hai uska comman task hoga

    public  Taskcontroller(Taskservice taskservice){
        this.taskservice=taskservice;
    }

    private Taskservice taskservice;

    @PostMapping
    public Task creattask(@RequestBody Task task){
        return taskservice.createTask(task);
    }  // @requestbody is use for converting data into java object
}
