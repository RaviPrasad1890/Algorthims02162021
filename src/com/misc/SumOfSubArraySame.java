package com.misc;

/*
Given array, return tru if two subarray within array have same sum
arr==>{1,1,1,2,1}
leftArray==1,2,3,5,6
rightArry==6,5,4,3,1
1,2,3,5,6
6,5,4,3,1
 */
/*
TC: O(N)->O(N+N)
Space
 */
public class SumOfSubArraySame {

    public void getRes(int[] arr){
        int leftArray[] = new int[arr.length];
        int rightArray[]= new int[arr.length];

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            leftArray[i]=sum;
        }
        sum=0;
        for(int i=arr.length-1;i>=0;i--){
            sum=sum+arr[i];
            rightArray[i]=sum;
        }

        for(int i=0;i<arr.length-1;i++){
          if(leftArray[i]==rightArray[i+1]){
              System.out.println("True");
              return;
          }
        }
        System.out.println("False");

    }

    public static void main(String[] args){
        SumOfSubArraySame obj= new SumOfSubArraySame();
        int[] arr={1,1,1,2,1,9};
        obj.getRes(arr);

    }
}
