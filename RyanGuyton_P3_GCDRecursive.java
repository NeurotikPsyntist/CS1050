/*
Program Name: RyanGuyton_P3_GCDRecursive.java
Description: program prompts user for two numbers, calculates gcd by recursive method.
Author: Ryan Guyton
Date: 12/10/2021
Version: 5
*/

import java.util.Scanner;
public class RyanGuyton_P3_GCDRecursive {
    private Scanner kb;
    private int m;
    private int n;
    private int gcd;

    public RyanGuyton_P3_GCDRecursive() {
        kb = new Scanner(System.in);
        m = 0;
        n = 0;
        gcd = 0;
    }

    public int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        }
        else {
            return gcd(n, m % n);
        }
    }

    public void getGCD() {
        System.out.print("Enter a number: ");
        m = kb.nextInt();
        System.out.print("Enter another: ");
        n = kb.nextInt();
        System.out.print("GCD(" + m + ", " + n + "): " + gcd(m, n));
    }

    public static void main (String args[]) {
        RyanGuyton_P3_GCDRecursive gCd = new RyanGuyton_P3_GCDRecursive();
        gCd.getGCD();
    }
}
