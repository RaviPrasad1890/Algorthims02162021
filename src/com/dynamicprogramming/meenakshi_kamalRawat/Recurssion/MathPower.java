package com.dynamicprogramming.meenakshi_kamalRawat.Recurssion;

public class MathPower {

    static int power(int x, int n){
        if(n==0){
            return 1;
        }

        if(n==1){
            return x;
        }

        if(x==1){
            return 1;
        }

        return x*power(x,n-1);
    }

    public static void main(String[] args){
        System.out.println(power(2,3));
    }
}
