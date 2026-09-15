package com.example.Task.tracking.system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    public String getTasktitle() {
        return tasktitle;
    }

    public void setTasktitle(String tasktitle) {
        this.tasktitle = tasktitle;
    }

    private String tasktitle;

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int taskid ;    //(@GENTRATED VALUE TELL THE ID WILL CRTE AUTOMATICALLY
//public int assignedto;   // strategy tell about what is the strategy to genrate the id
    // genration type  is enum of jpa jisme bhut sari methode  hoti jaise auto , identity.sequence


    // taking task title


}
