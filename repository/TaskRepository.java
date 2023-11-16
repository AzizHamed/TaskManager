package com.example.TaskManager.repository;


import com.example.TaskManager.documents.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends MongoRepository<Task,String> {
    public List<Task> findByTitle(String title);
}
