package com.divideconqour;
/*
We are given String s, need to find the length of its longest palindromic subsequence.
I/P: ELRMEMET
O/P: 5
Exp:EMEME
 */
public class LongestCommonPalindromicSubsequence {
    public int lcp(String s1, int startIndex,int endIndex){
        if(startIndex>endIndex){
            return 0;
        }
        if(startIndex==endIndex){
            return 1;
        }
        int c1=0;
        if(s1.charAt(startIndex)==s1.charAt(endIndex)){
            c1=2+lcp(s1,startIndex+1,endIndex-1);
        }
        int c2=lcp(s1,startIndex+1,endIndex);
        int c3=lcp(s1,startIndex,endIndex-1);
        return Math.max(c1,Math.max(c2,c3));
    }
    public static void main(String[] args){
        LongestCommonPalindromicSubsequence obj=new LongestCommonPalindromicSubsequence();
        String s1="ELRMEMET";
        System.out.println(obj.lcp(s1,0,s1.length()-1));
    }
}
