package com.example.Task.tracking.system.conteroller;

import com.example.Task.tracking.system.Entity.Task;
import com.example.Task.tracking.system.Service.Taskservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    // update stauts of task
  //  @PutMapping
    //public Task  updatestatus(@ Task )

     // get all  task using get all
    @GetMapping
    public  List<Task> getask(Task task){
        return taskservice.GetTask(task);
    }


    // get task by id
    @GetMapping("/{id}")
    public ResponseEntity<Task> getbyid(@PathVariable int id) {
        Optional<Task> result = taskservice.getbyid(id);
        if (result.isPresent()) {
            Task task = result.get();
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // update the task
@PutMapping("/{id}")
    public Task updatebyid(@PathVariable int id ,@RequestBody Task task ){
      Task  taskupdate=taskservice.updatetask(id,task);

return  taskupdate;


}

// deleted by id
    @DeleteMapping("/{id}")
    public void Deletebyid(@PathVariable int id){
        taskservice.Deletebyid(id);
    }
}

