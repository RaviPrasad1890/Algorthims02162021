package com.dynamicprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
       String[] strings=new String[]{"aBD","aB","ABC","cDe","CDd"};
       Collections.sort(Arrays.asList(strings),String::compareToIgnoreCase);
       for(String s:strings){
           System.out.println(s);
       }
    }
}
