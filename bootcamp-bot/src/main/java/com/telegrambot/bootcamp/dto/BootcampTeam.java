package com.telegrambot.bootcamp.dto;

import java.util.List;

public class BootcampTeam {
    private Integer id;
    private String name;
    private int totalPoints;
    private List<BootcampTask> completedTasks;

     public void constructor(Integer id, String name, int totalPoints, List<BootcampTask> completedTasks) {
         super();
         this.id = id;
         this.name = name;
         this.totalPoints = totalPoints;
         this.completedTasks = completedTasks;
     }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTotalPoints() {
        return totalPoints;
    }
    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
    public List<BootcampTask> getCompletedTasks() {
        return completedTasks;
    }
    public void setCompletedTasks(List<BootcampTask> completedTasks) {
        this.completedTasks = completedTasks;
    }

}
