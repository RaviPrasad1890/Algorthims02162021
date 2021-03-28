package com.misc;

import java.util.*;

/*
Given an array of size n, find list of all missing or repetitive numbers
Given: All elements x, 0<x<=n

 */
public class MissingAndRepetative {
    public List<Integer> getMissingGetRepetitive(int[] arr){
        List<Integer> listRes=new ArrayList<>();

        int n=arr.length;
        int[] auxArr=new int[n+1];
        Arrays.fill(auxArr,0);
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(auxArr[num]==0){
                auxArr[num]=num;
            }else{
                //These numbers are repetitive, just in case if we need to find out separate repetitive and missing
                listRes.add(num);
            }
        }
        for(int i=1;i<n+1;i++){
            if(auxArr[i]==0){
                //These are missing, just in case if we need to find out separate repetitive and missing
                listRes.add(i);
            }
        }
        return listRes;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,1,2,4,5,3,6};
        MissingAndRepetative obj=new MissingAndRepetative();
        System.out.println(obj.getMissingGetRepetitive(arr));
    }
}
