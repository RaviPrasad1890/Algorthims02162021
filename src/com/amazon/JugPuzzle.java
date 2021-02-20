package com.amazon;
/*
You are on the side of the river.
You are given a m liter jug and a n liter jug where 0 < m < n.
Both the jugs are initially empty.
The jugs don’t have markings to allow measuring smaller quantities.
You have to use the jugs to measure d liters of water where d < n.
Determine the minimum no of operations to be performed to obtain d liters of water in one of jug.
The operations you can perform are:

Empty a Jug
Fill a Jug
Pour water from one jug to the other until one of the jugs is either empty or full.

Solution 1 (Always pour from m liter jug into n liter jug)
Fill the m litre jug and empty it into n liter jug.
Whenever the m liter jug becomes empty fill it.
Whenever the n liter jug becomes full empty it.
Repeat steps 1,2,3 till either n liter jug or the m liter jug contains d litres of water.
Each of steps 1, 2 and 3 are counted as one operation that we perform.
Let us say algorithm 1 achieves the task in C1 no of operations.

Solution 2 (Always pour from n liter jug into m liter jug)
Fill the n liter jug and empty it into m liter jug.
Whenever the n liter jug becomes empty fill it.
Whenever the m liter jug becomes full empty it.
Repeat steps 1, 2 and 3 till either n liter jug or the m liter jug contains d liters of water.
Let us say solution 2 achieves the task in C2 no of operations.
Now our final solution will be a minimum of C1 and C2.
 */
public class JugPuzzle {
    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
    public static int pour(int fromCap, int toCap,
                           int d)
    {

        // Initialize current amount of water
        // in source and destination jugs
        int from = fromCap;
        int to = 0;

        // Initialize count of steps required
        int step = 1; // Needed to fill "from" Jug

        // Break the loop when either of the two
        // jugs has d litre water
        while (from != d && to != d)
        {

            // Find the maximum amount that can be
            // poured
            int temp = Math.min(from, toCap - to);

            // Pour "temp" liters from "from" to "to"
            to += temp;
            from -= temp;

            // Increment count of steps
            step++;

            if (from == d || to == d)
                break;

            // If first jug becomes empty, fill it
            if (from == 0)
            {
                from = fromCap;
                step++;
            }

            // If second jug becomes full, empty it
            if (to == toCap)
            {
                to = 0;
                step++;
            }
        }
        return step;
    }
    public static int  minSteps(int m, int n,int d){
        // To make sure that m is smaller than n
        if (m > n)
        {
            int t = m;
            m = n;
            n = t;
        }

        // For d > n we cant measure the water
        // using the jugs
        if (d > n) {
            return -1;
        }

        // If gcd of n and m does not divide d
        // then solution is not possible
        if ((d % gcd(n, m)) != 0) {
            return -1;
        }
        // Return minimum two cases:
        // a) Water of n liter jug is poured into
        //    m liter jug
        // b) Vice versa of "a"
        return Math.min(pour(n, m, d), // n to m
                pour(m, n, d)); // m to n
    }
    public static void main(String[] args){
        int n = 3, m = 5, d = 4;
        minSteps(m, n, d);
        /*System.out.println("Minimum number of " +
                "steps required is " +
                minSteps(m, n, d));*/
    }
}
