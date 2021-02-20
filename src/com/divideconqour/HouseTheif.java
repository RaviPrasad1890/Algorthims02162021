package com.divideconqour;
/*
There are N houses build in a line, each of which contains some value in it.
A theif is going to steal the max value of these house.
But he cant steal in two adjacent houses.
What is maximum stolen value?
I/P: {6,7,1,30,8,2,4}
O/P=41
 */
public class HouseTheif {
    public int maxStolen(int[] arr,int currIndex){
        if(currIndex>=arr.length){
            return 0;
        }
        int stealCurrentHouse=arr[currIndex]+maxStolen(arr,currIndex+2);
        int skipCurrentHouse=maxStolen(arr,currIndex+1);
        return Math.max(stealCurrentHouse,skipCurrentHouse);
    }
    public static void main(String[] args){
        HouseTheif obj= new HouseTheif();
        int arr[]={6,7,1,30,8,2,4};
        System.out.println(obj.maxStolen(arr,0));
    }
}
