package com.amazon;
/*
Given an array arr[] of n integers, construct a Product Array prod[] (of same size)
such that prod[i] is equal to the product of all the elements of arr[] except arr[i].
Solve it without division operator in O(n) time.

Input: arr[]  = {10, 3, 5, 6, 2}
Output: prod[]  = {180, 600, 360, 300, 900}
3 * 5 * 6 * 2 product of other array
elements except 10 is 180
10 * 5 * 6 * 2 product of other array
elements except 3 is 600
10 * 3 * 6 * 2 product of other array
elements except 5 is 360
10 * 3 * 5 * 2 product of other array
elements except 6 is 300
10 * 3 * 6 * 5 product of other array
elements except 2 is 900
 */
public class ProductArray {
    private void productArray(int[] array, int len){
        int[] prod= new int[len];
        int temp=1;

        for(int i=0;i<len;i++){
            prod[i]=1;
        }

        for(int i=0;i<len;i++){
            prod[i]=temp;
            temp *=array[i];
        }

        temp=1;
        for(int i=len-1;i>=0;i--) {
            prod[i] *= temp;
            temp *=array[i];
        }

        printArray(prod);
    }

    private void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ProductArray pa= new ProductArray();
        int arr[] = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        System.out.println("The product array is : ");
        pa.productArray(arr, n);
    }

}
