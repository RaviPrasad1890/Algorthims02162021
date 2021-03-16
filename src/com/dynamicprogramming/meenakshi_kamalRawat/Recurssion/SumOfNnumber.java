package com.dynamicprogramming.meenakshi_kamalRawat.Recurssion;
//Sum of n natural numbers
public class SumOfNnumber {
    public static int getSum(int n){
        return n==0?0:n==1?1:n+getSum(n-1);
    }

    public static void main(String[] args){
        System.out.println(getSum(8));
    }
}
