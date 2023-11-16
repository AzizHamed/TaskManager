package com.example.TaskManager.controller;


import com.example.TaskManager.documents.Task;
import com.example.TaskManager.enums.Status;
import com.example.TaskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.processing.SupportedOptions;
import java.util.List;

@RestController
@RequestMapping("task")
public class TaskController {


    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task saveTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }

    @GetMapping("/title")
    public List<Task> getTaskByTitle(@RequestParam String title){
        return taskService.getTaskByTitle(title);
    }

    @GetMapping
    public List<Task> findAll(){
        return taskService.findAll();
    }

    @PutMapping()
    public Task updateTaskByDescription(@RequestParam String taskId, @RequestBody Task task){
        return taskService.updateTaskByDescription(taskId,task);
    }

    @PutMapping("/status")
    public Task updateTaskStatus(@RequestParam String taskId ,@RequestParam Status status){
        return taskService.updateTaskStatus(taskId, status);
    }

    @DeleteMapping
    public Task deleteByTask(@RequestBody Task task){
        return taskService.deleteByTask(task);
    }

    @DeleteMapping("/id")
    public Task deleteById(@RequestParam String id){
        return taskService.deleteById(id);
    }

}
