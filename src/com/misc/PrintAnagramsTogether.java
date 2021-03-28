package com.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAnagramsTogether {

    public static void anagramsTogether(String[] wordArr, int size){
       Map<Integer, ArrayList<Integer>> hashMap= new HashMap<>();
       for(int k=0;k<wordArr.length;k++){
           String str=wordArr[k];
           int sum=0;
           for(int i=0;i<str.length();i++){
               sum=sum+str.charAt(i);
           }
           if(hashMap.containsKey(sum)){
               ArrayList<Integer> al=hashMap.get(sum);
               al.add(k);
               hashMap.put(sum,al);
           }else{
               ArrayList<Integer> al= new ArrayList<>();
               al.add(k);
               hashMap.put(sum,al);
           }
       }

       for(Map.Entry<Integer,ArrayList<Integer>> entry:hashMap.entrySet()){
           List<Integer> lst=entry.getValue();
           for(int i:lst){
               System.out.println(wordArr[i]);
           }
       }
    }

    public static void main(String args[])
    {
        String wordArr[] = { "cat", "dog", "tac", "god", "act" };
        int size = wordArr.length;
        anagramsTogether(wordArr, size);
    }
}
