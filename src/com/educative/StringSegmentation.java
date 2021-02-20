package com.educative;

import java.util.HashSet;
import java.util.Set;
/*
You are given a dictionary of words and a large input string.
You have to find out whether the input string can be completely segmented into the words of a given dictionary.
 */
public class StringSegmentation {

    private static boolean canSegmentString(String s, Set<String> dictionary) {
        for(int i=0;i<s.length();i++){
            String first=s.substring(0,i);
            if(dictionary.contains(first)){
                String second=s.substring(i);
                if (second == null ||
                        second.length() == 0 ||
                        dictionary.contains(second) ||
                        canSegmentString(second, dictionary)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set< String > dictionary = new HashSet< String >();
        String s = new String();
        s = "hellonow";

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");
        if (canSegmentString(s, dictionary)) {
            System.out.println("String Can be Segmented");
        } else {
            System.out.println("String Can NOT be Segmented");
        }
    }


}
