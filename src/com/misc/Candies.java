package com.misc;

public class Candies {
     int[] distribute(int candies,int num_people){
        int res[]=new int[num_people];
        int index=0;
        int candyTrack=1;
        while(candies>0){
            res[index%num_people] +=candyTrack;
            index +=1;
            candies -=candyTrack;
            candyTrack +=1;
        }
        if(candies<0){
            res[(index-1)%num_people]+=candies;
        }
        return res;
    }
    public static void main(String[] args){
        Candies obj=new Candies();
        int [] arr=obj.distribute(11,4);
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}
