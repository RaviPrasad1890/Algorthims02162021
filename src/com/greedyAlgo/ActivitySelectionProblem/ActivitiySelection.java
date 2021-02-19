package com.greedyAlgo.ActivitySelectionProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitiySelection {
    static void activitySelection(ArrayList<Activity> activityList) {

        Comparator<Activity> comparator= new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getFinshTime()-o2.getFinshTime() ;
            }
        };

        Collections.sort(activityList,comparator);
        Activity prevActivity=activityList.get(0);
        System.out.println("\n\nRecommended Schedule:\n"+activityList.get(0));
        for(int i=1;i<activityList.size();i++){
            if(prevActivity.getFinshTime()<=activityList.get(i).getStartTime()){
                System.out.println(activityList.get(i));
                prevActivity=activityList.get(i);
            }
        }
    }
}
