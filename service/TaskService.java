package com.example.TaskManager.service;

import com.example.TaskManager.documents.Task;
import com.example.TaskManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TaskService {


    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getTaskByTitle(String title) {
        return taskRepository.findByTitle(title);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task updateTaskByDescription(String taskId, Task task1) {
        Task task;
        try {
            task = taskRepository.findById(taskId).get();
        }catch (NoSuchElementException e){
            return null;
        }
        task.setDescription(task1.getDescription());
        task.setTitle(task1.getTitle());
        task.setLastDate(task1.getLastDate());
        taskRepository.save(task);
        return task;
    }

    public Task deleteByTask(Task task) {
        try {
            taskRepository.delete(task);
        }catch (NoSuchElementException e){
            return null;
        }
        return task;
    }

    public Task deleteById(String id) {
        Task task;
        try {
            task = taskRepository.findById(id).get();
            taskRepository.deleteById(id);
        }catch (NoSuchElementException e){
            return null;
        }
       return task;
    }
}
