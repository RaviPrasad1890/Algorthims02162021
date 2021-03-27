package com.misc;

/*
-2,1,-3,4,-1,2,1,-5,4

6:
 */
public class MaxSumOfSubArray {

    public int getMaxSum(int[] arr,int size){
        int max_so_far=arr[0];
        int curr_max=arr[0];
        for(int i=1;i<size;i++){
            curr_max=Math.max(arr[i],curr_max+arr[i]);
            max_so_far=Math.max(max_so_far,curr_max);
        }
       return max_so_far;
    }

    public static void main(String[] args){
        MaxSumOfSubArray obj=new MaxSumOfSubArray();
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int res=obj.getMaxSum(arr,arr.length);
        System.out.println(res);
    }

}
