package com.misc;
/*
Given N, find min length of subarray whose sum is >=N
 */
public class MinLengthOfSubarray {
    public void findMinLen(int[] arr, int N){
        int windowStart=0;
        int minLength=Integer.MAX_VALUE;
        int sum=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            if(arr[windowEnd]==N){
                System.out.println(1);
                return;
            }
            sum =sum+arr[windowEnd];
            while(sum>=N){
                minLength=Math.min(minLength,windowEnd-windowStart+1);
                sum=sum-arr[windowStart+1];
                windowStart++;
            }
        }
        System.out.println(minLength);
    }
    public static void main(String[] args){
        MinLengthOfSubarray obj= new MinLengthOfSubarray();
        int[] array1={2,3,7,1,4,5,2,5,7};
        obj.findMinLen(array1,8);

        int[] array2={5,-10,15,20,-3,1,-4,-8,12};
        obj.findMinLen(array2,16);
    }
}
