package com.amazon;

import java.util.ArrayDeque;

/*
Given a string ‘str’ of digits and an integer ‘k’, build the lowest possible number by removing ‘k’
digits from the string and not changing the order of input digits.
 */
public class LowestNumber {

    public static void main(String[] args){
        System.out.println(getMin("4325043",3));//2043
        System.out.println(getMin("765028321",5));//0221
        System.out.println(getMin("99999",3));//99
        System.out.println(getMin("22453",2));//223
        System.out.println(getMin("32245",2));//224
    }
    public static String getMin(String str, int k){
        ArrayDeque<Character> st= new ArrayDeque();
        int len=str.length();
        //If number of char to be removed is zero, than return string
        if(k==0){
            return str;
        }
        //If number of char to be removed is greater than the length of String, remove everything
        if(len<=k){
            return "";
        }
        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            while(!st.isEmpty() && st.getFirst()>c && k!=0){
                st.removeFirst();
                k--;
            }
            st.addFirst(c);

        }
        //If digits are same like 9999
       while(k-->0){
           st.removeFirst();
       }
       StringBuilder sbr=new StringBuilder();
       while(!st.isEmpty()){
           char cr=st.removeLast();
           boolean isBegining=true;
           if(cr=='0'&&isBegining){
               continue;
           }
           isBegining=false;
           sbr.append(cr);
       }
       String s=sbr.toString();
       if(s.length()==0){
           return "";//All characters got removed
       }
        return s;
    }
}
