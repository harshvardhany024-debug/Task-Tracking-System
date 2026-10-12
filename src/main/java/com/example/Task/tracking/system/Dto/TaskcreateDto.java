package com.example.Task.tracking.system.Dto;

// Client se aane wala data (POST/PUT). Entity expose nahi karte.
public class TaskcreateDto {
    private String tasktitle;
    private String status;

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
