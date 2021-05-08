package com.misc;

import java.util.HashMap;
import java.util.Map;

/*
Given N, find max lenght of subarray whose sum = N
1,2,3,4,-5,-3,5,6
 */
public class MaxLenghtOfSubArray {
    public void getMaxSubArray(int arr[],int N) {
        int sum=0;
        int endingIndex=0;
        Map<Integer,Integer> hm= new HashMap<>();
        hm.put(0,-1);
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            hm.putIfAbsent(sum,i);
            if(hm.containsKey(sum-N)&&len<i-hm.get(sum-N)){
                len=i-hm.get(sum-N);
                endingIndex=i;
            }
        }
        System.out.println("len "+len);
        //System.out.println("Start Index "+hm.get(sum));
        System.out.println("Ending Index "+endingIndex);

    }

    public static void main(String[] args){
        MaxLenghtOfSubArray obj= new MaxLenghtOfSubArray();
        int[] arr={5,6,-5,5,3,5,3,-2,0};
        obj.getMaxSubArray(arr,8);
    }
}
