package com.example.Task.tracking.system.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// Client se aane wala data (POST/PUT). Entity expose nahi karte.
public class TaskcreateDto {
    @NotBlank(message = "Task tittle can not be blank")
    @Size(max = 100,message = " title size can not be more than 10")
    private String tasktitle;

    @NotBlank(message = "Status canot be blank")
    @Size(max = 12 , message = "stauts size max upto 12")
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
