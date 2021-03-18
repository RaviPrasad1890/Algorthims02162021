package com.dynamicprogramming.meenakshi_kamalRawat.Recurssion;

public class Factorial {

     static int fact(int n){
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        return n*fact(n-1);
    }

    public static void main(String[] args){
        System.out.println(fact(4));
    }

}
