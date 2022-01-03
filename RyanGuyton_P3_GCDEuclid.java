/*
Program Name: RyanGuyton_P3_GCDEuclid.java
Description: program prompts user two numbers, calculates gcd by euclid's algorithm.
Author: Ryan Guyton
Date: 12/10/2021
Version: 2
*/

import java.util.Scanner;
public class RyanGuyton_P3_GCDEuclid {
    public static void main (String args[]) {
        Scanner kb = new Scanner(System.in);
        int m = 0;
        int n = 0;
        int gcd = 0;
        System.out.print("Enter a number: ");
        m = kb.nextInt();
        System.out.print("Enter another: ");
        n = kb.nextInt();

        int t1 = Math.abs(m);
        int t2 = Math.abs(n);
        int r = t1 % t2;
        while (r != 0){
            t1 = t2;
            t2 = r;
            r = t1 % t2;
        }
        gcd = t2;
        System.out.print("GCD(" + m + ", " + n + "): " + gcd);
    }
}
