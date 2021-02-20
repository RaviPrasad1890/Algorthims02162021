package com.divideconqour;
/*
Given N, we need to find out number of ways to express N as sum of 1,3 and 4
n=4
No Of Ways=4;{1,1,1,1},{1,3},{3,1},{4}
 */
public class NumberFactor {
    public int numberOfWays(int n){
       if(n==0){
           return 0;
       }
       if(n==1||n==2){//{1,1}
           return 1;
       }
       if(n==3){//{1,1,1},{3}
           return 2;
       }
       if(n==4){
           return 4;
       }

       int subtract1= numberOfWays(n-1);
       int subtract3=numberOfWays(n-3);
       int subtract4=numberOfWays(n-4);
       return subtract1+subtract3+subtract4;
    }
    public static void main(String[] args){
        NumberFactor obj= new NumberFactor();
        System.out.println(obj.numberOfWays(0));
        System.out.println(obj.numberOfWays(4));
        System.out.println(obj.numberOfWays(5));//{1,1,1,1},{1,1,3},{1,3,1},{3,1,1},{1,4},{4,1}
    }
}
