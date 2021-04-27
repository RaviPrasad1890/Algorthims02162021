package com.misc;

public class TappingWater {
    static int maxWater(int[] arr, int n){
        int left=0;
        int right=arr.length-1;
        int left_max=0;
        int right_max=0;

        int result=0;
        while(left<=right){
            if(right_max<=left_max){
                result+=Math.max(0,right_max-arr[right]);
                right_max=Math.max(right_max,arr[right]);
                right-=1;
            }else{
                result+=Math.max(0,left_max-arr[left]);
                left_max=Math.max(left_max,arr[left]);
                left+=1;
            }
        }
        return result;
    }

    public static void main(String []args)
    {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;
        System.out.print(maxWater(arr, n));
    }
}
