package com.amazon;

import java.util.HashSet;
import java.util.Set;

/*
Given an array of distinct elements and a number x,
 find if there is a pair with a product equal to x.
 */
public class ProductPair {

    private static boolean isProduct(int[] arr, int length, int x) {
        if(length<2){
            return false;
        }
        Set<Integer> hset=new HashSet<>();
        for(int i: arr){
           if(x==0){
               if(i==0){
                   return true;
               }else{
                   continue;
               }
           }
           if(x%i==0){
               if(hset.contains(x/i)){
                   return true;
               }
               hset.add(i);
           }
        }
        return false;
    }

    public static void main(String[] args){
        int arr[] = {10, 20, 9, 40};
        int x = 400;
        int n = arr.length;

        if(isProduct(arr, arr.length, x))
            System.out.println("Yes");
        else
            System.out.println("No");

        x = 190;

        if(isProduct(arr, arr.length, x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
