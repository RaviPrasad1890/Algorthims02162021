package com.divideconqour;
/*
I/P:ABCCBUA
O/P=4
 */
public class LongestCommonPalindromicSubstring {
    public int lps(String s, int start, int end){
        if(start>end){
            return 0;
        }
        if(start==end){
            return 1;
        }
        int c1=0;
        if(s.charAt(start)==s.charAt(end)){
            int remainingLength=end-start-1;
            if(remainingLength==lps(s,start+1,end-1)){
                c1=2+remainingLength;
            }
        }
        int c2=lps(s,start,end-1);
        int c3=lps(s,start+1,end);
        return Math.max(c1,Math.max(c2,c3));
    }
    public static void main(String[] args){
        LongestCommonPalindromicSubstring obj= new LongestCommonPalindromicSubstring();
        String s="ABCCBUA";
        System.out.println(obj.lps(s,0,s.length()-1));
    }
}
