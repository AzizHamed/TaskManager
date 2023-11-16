package com.example.TaskManager.documents;

import com.example.TaskManager.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

import java.util.Date;

@Document(collection = "task")
@Data
@AllArgsConstructor
@Builder
public class Task {


    @Id
    private String taskId;

    private String title;

    private String description;

    private Date lastDate;

    @NonNull
    private User user;

    private Status status = Status.InProgress;
}
