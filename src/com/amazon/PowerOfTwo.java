package com.amazon;
/*
Program to find whether a no is power of two
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        if(n==0){
            return false;
        }
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args){
        PowerOfTwo obj= new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(8));
        System.out.println(obj.isPowerOfTwo(13));
    }
}
