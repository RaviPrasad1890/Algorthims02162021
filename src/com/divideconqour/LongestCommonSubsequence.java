package com.divideconqour;
/*
Given String s1 and s2.
Find the length of the longest sunsequence which is common in both Strings.
Subsequence is a sequence that can be derived from another sequence by deleting some element without
changing the order of the remaining elements.
s1="elephant"
s2="eretpat"
o/p=5 i.e. eepat
 */
public class LongestCommonSubsequence {
    public int lca(String s1, String s2,int i1,int i2){
        if(i1>=s1.length()||i2>=s2.length()){
            return 0;
        }
        int c3=0;
        if(s1.charAt(i1)==s2.charAt(i2)){
            c3=1+lca(s1,s2,i1+1,i2+1);
        }
        int c1=lca(s1,s2,i1,i2+1);
        int c2=lca(s1,s2,i1+1,i2);
        return Math.max(c3,Math.max(c1,c2));
    }
    public static void main(String[] args){
        LongestCommonSubsequence obj = new LongestCommonSubsequence();
        String s1="elephant";
        String s2="eretpat";
        System.out.println(obj.lca(s1,s2,0,0));
    }
}
