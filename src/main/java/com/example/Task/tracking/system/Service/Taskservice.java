package com.example.Task.tracking.system.Service;

import com.example.Task.tracking.system.Dto.TaskcreateDto;
import com.example.Task.tracking.system.Dto.TaskresponseDto;
import com.example.Task.tracking.system.Entity.Task;
import com.example.Task.tracking.system.exception.TaskNotFaundException;
import com.example.Task.tracking.system.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Taskservice {
    private final TaskRepository taskRepository;

    public Taskservice(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // create task

    public TaskresponseDto createTask(TaskcreateDto dto) {
        Task task = new Task();
        task.setTasktitle(dto.getTasktitle());
        task.setStatus(dto.getStatus());
        Task saved = taskRepository.save(task);
        return toResponse(saved);
    }



    // get task

    public List<TaskresponseDto> GetTask() {
        return taskRepository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }


    // get task by id
    public TaskresponseDto getbyid(int id) {

        return taskRepository.findById(id).map(this::toResponse).orElseThrow(()->new TaskNotFaundException("Task not faund id is "+id));
    }

    // update by id
    public TaskresponseDto updatetask(int id, TaskcreateDto dto) {
        Optional<Task> result = taskRepository.findById(id);
        if (result.isPresent()) {
            Task existingTask = result.get();
            existingTask.setTasktitle(dto.getTasktitle());
            existingTask.setStatus(dto.getStatus());
            return toResponse(taskRepository.save(existingTask));
        }
        throw  new TaskNotFaundException("Task Not faund in this id  "+id);
    }


    // delete task by id
    public void Deletebyid(int id) {
        Optional<Task> result = taskRepository.findById(id);
        if (result.isPresent()) {
            taskRepository.deleteById(id);
        }
        else{
        throw new TaskNotFaundException("This id is not faund "+id);
    }}

    private TaskresponseDto toResponse(Task task) {
        TaskresponseDto response = new TaskresponseDto();
        response.setTaskid(task.getTaskid());
        response.setTasktitle(task.getTasktitle());
        response.setStatus(task.getStatus());
        return response;
    }
}
