package com.example.Task.tracking.system.Dto;

// Client ko bhejne wala data. DB entity ka extra/internal part yahan nahi aata.
public class TaskresponseDto {
    private int taskid;
    private String tasktitle;
    private String status;

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTasktitle() {
        return tasktitle;
    }

    public void setTasktitle(String tasktitle) {
        this.tasktitle = tasktitle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
