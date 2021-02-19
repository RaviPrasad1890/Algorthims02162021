package com.amazon;

public class DecimalToBinary {
    private static void convertBinary(int n){
        int[] bin=new int[32];
        int i=0;
        while(n>0){
            bin[i]=n%2;
            n=n/2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(bin[j]);
    }

    public static void main(String[] args){
        int n = 17;
        convertBinary(n);
    }
}
