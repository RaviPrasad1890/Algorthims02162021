package com.amazon;

public class ReverseBinary {

    public int reverseBinary(int n){
        int rev=0;
        // traversing bits of 'n'
        // from the right
        while (n > 0)
        {
            // bitwise left shift
            // 'rev' by 1
            rev <<= 1;

            // if current bit is '1'
            if ((int)(n & 1) == 1)
                rev ^= 1;

            // bitwise right shift
            //'n' by 1
            n >>= 1;
        }
        return rev;
    }

    public static void main(String[] args){
        ReverseBinary obj= new ReverseBinary();
        System.out.println(obj.reverseBinary(11));
    }
}
