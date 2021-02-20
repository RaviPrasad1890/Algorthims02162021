package com.divideconqour;
/*
We are given two string s1 and s2. Convert s1 to s2 by deleting,inserting,replacing characters.
WAP to calculate the count of minimum number of edit operation.
String s1=table
String s2=tbres
O/P=3(Insert a at 2nd position, replace r with l, delete s)
 */
public class ConvertOneStringToAnother {
    public int minWays(String s1, String s2, int i1, int i2){
        if(i1==s1.length()){
            return s2.length()-i2;
        }

        if(i2==s2.length()){
            return s1.length()-i1;
        }

        if(s1.charAt(i1)==s2.charAt(i2)){
            return minWays(s1,s2,i1+1,i2+1);
        }

        int insert=1+minWays(s1,s2,i1+1,i2);
        int delete=1+minWays(s1,s2,i1,i2+1);
        int replace=1+minWays(s1,s2,i1+1,i2+1);
        return Math.min(insert,Math.min(delete,replace));
    }
    public static void main(String[] args){
        ConvertOneStringToAnother obj= new ConvertOneStringToAnother();
        String s1="table";
        String s2="tbres";
        System.out.println(obj.minWays(s1,s2,0,0));
    }
}
