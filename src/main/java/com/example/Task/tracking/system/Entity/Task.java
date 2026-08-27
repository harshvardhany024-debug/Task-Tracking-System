package com.example.Task.tracking.system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
    private String tasktitle;
    @Id
    private int taskid ;
//public int assignedto;


}
