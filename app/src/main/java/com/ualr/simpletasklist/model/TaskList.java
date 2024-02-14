package com.ualr.simpletasklist.model;

import java.util.HashMap;
import java.util.Map;

public class TaskList {

    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    HashMap<Integer, Task> task;

    // TODO 04. Define the class constructor and the corresponding getters and setters.

    public TaskList() {
        task = new HashMap<>();
    }
    public Task getTaskElement(Integer i) {
        return task.get(i);
    }

    public void setTaskElement(Integer i, Task t) {
        task.put(i, t);
    }

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.
    public void add(String s) {
        Task temp = new Task(s, false);
        Integer i = task.size() + 1;

        task.put(i, temp);
    }

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line
    public String toString() {
        StringBuilder temp = new StringBuilder();

        for (Map.Entry<Integer, Task> e : task.entrySet()) {
            if (!e.getValue().getIsDone()) {
                temp.append(e.getKey().toString()).append(" - ").append(e.getValue().getDescription()).append("\n");
            }
            else {
                temp.append(e.getKey().toString()).append(" - ").append(e.getValue().getDescription()).append(" - ").append("Done\n");
            }
        }
        return temp.toString();
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.
    public void delete(Integer i) {
        task.remove(i);

//        Task temp;
//        Integer j = 1;
//        for(Map.Entry<Integer, Task> e : task.entrySet()) {
//            if (e.getKey() != j) {
//                temp = e.getValue();
//                task.remove(e.getKey());
//                task.put(j, temp);
//                j++;
//            }
//        }
    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.
    public void markDone(Integer i) {
        task.get(i).setDone(true);
    }

}
