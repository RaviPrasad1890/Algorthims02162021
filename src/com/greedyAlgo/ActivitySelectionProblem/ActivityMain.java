package com.greedyAlgo.ActivitySelectionProblem;
/*
We are given n activities with start time and end time.
Select the maximum number of activities that can be performed by a single person, assuming that a person
can work on single activity ata time.
 */
import java.util.ArrayList;

public class ActivityMain {

    public static void main(String[] args) {
        //Create an ArrayList to store all activities
        ArrayList<Activity> activityList = new ArrayList<Activity>();

        //Insert activities in Arraylist
        activityList.add(new Activity("A1", 0, 6));
        activityList.add(new Activity("A2", 3, 4));
        activityList.add(new Activity("A3", 1, 2));
        activityList.add(new Activity("A4", 5, 8));
        activityList.add(new Activity("A5", 5, 7));
        activityList.add(new Activity("A6", 8, 9));

        //Print user entered data
        System.out.println("User provided Schedule:");
        for (int i = 0; i < activityList.size() ; i++) {
            Activity activity = activityList.get(i);
            System.out.println(activity.toString());
        }

        //Perform calculation on activities
        ActivitiySelection.activitySelection(activityList);

    }
}
