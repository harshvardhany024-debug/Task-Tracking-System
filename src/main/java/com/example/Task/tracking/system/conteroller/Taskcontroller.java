package com.example.Task.tracking.system.conteroller;

import com.example.Task.tracking.system.Dto.TaskcreateDto;
import com.example.Task.tracking.system.Dto.TaskresponseDto;
import com.example.Task.tracking.system.Service.Taskservice;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Task")
public class Taskcontroller {

    private final Taskservice taskservice;

    public Taskcontroller(Taskservice taskservice) {
        this.taskservice = taskservice;
    }

    @PostMapping
    public TaskresponseDto creattask(@Valid @RequestBody  TaskcreateDto dto) {
        return taskservice.createTask(dto);
    }

    @GetMapping
    public List<TaskresponseDto> getask() {
        return taskservice.GetTask();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskresponseDto> getbyid(@PathVariable int id) {
        TaskresponseDto result = taskservice.getbyid(id);

        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public TaskresponseDto updatebyid(@PathVariable int id, @RequestBody TaskcreateDto dto) {
        return taskservice.updatetask(id, dto);
    }

    @DeleteMapping("/{id}")
    public void Deletebyid(@PathVariable int id) {
        taskservice.Deletebyid(id);
    }
}
