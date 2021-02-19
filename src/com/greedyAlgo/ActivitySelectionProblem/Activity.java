package com.greedyAlgo.ActivitySelectionProblem;

public class Activity {
    private String activityName;
    private int startTime;
    private int finshTime;


    public Activity(String activityName, int startTime,int finshTime ) {
        this.activityName = activityName;
        this.finshTime = finshTime;
        this.startTime = startTime;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public int getFinshTime() {
        return finshTime;
    }

    public void setFinshTime(int finshTime) {
        this.finshTime = finshTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityName='" + activityName + '\'' +
                ", startTime=" + startTime +
                ", finshTime=" + finshTime +
                '}';
    }
}
