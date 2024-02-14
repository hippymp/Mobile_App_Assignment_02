package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    public String description;
    public boolean isDone;


    // TODO 02. Define the class constructor and the corresponding getters and setters.
    Task() {
        description = "";
        isDone = false;
    }

    Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}
