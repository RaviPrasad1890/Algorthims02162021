package com.amazon;

import java.util.ArrayList;

/*
Java ArrayList to print all possible words from phone digits

Input: str = "12"
Output: [ad, bd, cd, ae, be, ce, af, bf, cf]
Explanation: The characters that can be formed
by pressing 1 is a, b, c and by pressing 2 characters
d, e, f can be formed.
So all the words will be a combination where first
character belongs to a, b, c and 2nd character belongs
to d, e, f

Input: str = "4"
Output: [j, k, l]
Explanation: The characters that can be formed
by pressing 4 is j, k, l
 */
public class PhoneKeypad {

    static final String codes[]
            = { " ", "abc", "def",
            "ghi", "jkl", "mno",
            "pqr", "stu", "vwx",
            "yz" };

    public static ArrayList<String> printKeyWords(String str) {
        // If str is empty
        if (str.length() == 0) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");
            // Return an Arraylist containing
            // empty string
            return baseRes;
        }

        // First character of str
        char ch = str.charAt(0);
        // Rest of the characters of str
        String restStr = str.substring(1);
        ArrayList<String> prevRes = printKeyWords(restStr);
        ArrayList<String> res = new ArrayList<>();
        String code = codes[ch - '0'];
        for(String val:prevRes){
            for(int i=0;i<code.length();i++){
                res.add(code.charAt(i)+val);
            }
        }
        return res;
    }

    public static void main(String[] args){
        String str = "1234";
        // Print all the possible words
        System.out.println(printKeyWords(str));
    }
}
