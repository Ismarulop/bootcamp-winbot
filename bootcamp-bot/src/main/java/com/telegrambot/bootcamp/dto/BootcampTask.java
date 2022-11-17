package com.telegrambot.bootcamp.dto;

public class BootcampTask {
    private String name;
    private int pointsAwarded;
    private boolean firstPlace;
    private boolean secondPlace;

    public BootcampTask(String name, int pointsAwarded, boolean firstPlace, boolean secondPlace) {
        super();
        this.name = name;
        this.pointsAwarded = pointsAwarded;
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPointsAwarded() {
        return pointsAwarded;
    }
    public void setPointsAwarded(int pointsAwarded) {
        this.pointsAwarded = pointsAwarded;
    }
    public boolean isFirstPlace() {
        return firstPlace;
    }
    public void setFirstPlace(boolean firstPlace) {
        this.firstPlace = firstPlace;
    }
    public boolean isSecondPlace() {
        return secondPlace;
    }
    public void setSecondPlace(boolean secondPlace) {
        this.secondPlace = secondPlace;
    }

}
