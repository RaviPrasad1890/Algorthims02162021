package com.misc;
/*
Partition a set into two subsets such that the difference of subset sums is minimum
Input:  arr[] = {1, 6, 11, 5}
Output: 1
Explanation:
Subset1 = {1, 5, 6}, sum of Subset1 = 12
Subset2 = {11}, sum of Subset2 = 11
Time Complexity:O(2^n)
 */
public class MInimumDifferenceSubSets {
    public static int findMinRec(int arr[], int i,
                                 int sumCalculated,
                                 int sumTotal) {
        // If we have reached last element.
        // Sum of one subset is sumCalculated,
        // sum of other subset is sumTotal-
        // sumCalculated.  Return absolute
        // difference of two sums.
        if(i==0){
            return Math.abs(sumCalculated-(sumTotal-sumCalculated));
        }

        // For every item arr[i], we have two choices
        // (1) We do not include it first set
        // (2) We include it in first set
        // We return minimum of two choices
        return Math.min(findMinRec(arr,i-1,sumCalculated+arr[i-1],sumTotal),
                findMinRec(arr,i-1,sumCalculated,sumTotal));

    }
    public static int findMin(int[] arr,int n){
        int sumTotal=0;
        for(int i=0;i<n;i++){
            sumTotal+=arr[i];
        }

        return findMinRec(arr,n,0,sumTotal);
    }

    public static void main(String[] args){
        int[] arr={1,6,11,5};
        int n=arr.length;
        System.out.print("The minimum difference"+
                " between two sets is " +
                findMin(arr, n));
    }
}


