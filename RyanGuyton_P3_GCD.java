/*
Program Name: RyanGuyton_P3_GCD.java
Description: program prompts user for two numbers, calculates gcd
             via brute force, euclid's algorithm, or recursive method.
Author: Ryan Guyton
Date: 12/10/2021
Version: 13
*/

import java.util.Scanner;
public class RyanGuyton_P3_GCD {
    private Scanner kb;
    private String a;
    private String b;
    private int m;
    private int n;
    private int gcd;

    public RyanGuyton_P3_GCD() {
        kb = new Scanner(System.in);
        a = "0";
        b = "0";
        m = 0;
        n = 0;
        gcd = 0;
    }

    public String printIntro() {
        return "Select Greatest Common Divisor (GCD) calculation menthod:\n"
               + "\nBrute Force (B)\nEuclid's Algorithm (E)\nRecursion (R)"
               + "\nor Quit (Q)\n\nand then enter two numbers.";
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public int gcdRecur(int m, int n) {
        if (m % n == 0) {
            return n;
        }
        else {
            return gcdRecur(n, m % n);
        }
    }

    public void getGcdRecur() {
        while (isInteger(a)) {
            System.out.print("Enter a number: ");
            a = kb.nextLine();
            if (isInteger(a)) {
                m = Integer.parseInt(a);
                break;
            }
            else {
                System.out.println("\nInvalid Input!");
                continue;
            }
        }
        while (isInteger(b)) {
            System.out.print("Enter another: ");
            b = kb.nextLine();
            if (isInteger(b)) {
                n = Integer.parseInt(b);
                break;
            }
            else {
                System.out.println("\nInvalid Input!");
                continue;
            }
        }
        System.out.println("GCD(" + m + ", " + n + "): " + gcdRecur(m, n));
    }

    public int gcdEuclid(int m, int n) {
        int t1 = Math.abs(m);
        int t2 = Math.abs(n);
        int r = t1 % t2;
        while (r != 0){
            t1 = t2;
            t2 = r;
            r = t1 % t2;
        }
        gcd = t2;
        return gcd;
    }

    public void getGcdEuclid() {
        while (isInteger(a)) {
            System.out.print("Enter a number: ");
            a = kb.nextLine();
            if (isInteger(a)) {
                m = Integer.parseInt(a);
                break;
            }
            else {
                System.out.println("\nInvalid Input!");
                continue;
            }
        }
        while (isInteger(b)) {
            System.out.print("Enter another: ");
            b = kb.nextLine();
            if (isInteger(b)) {
                n = Integer.parseInt(b);
                break;
            }
            else {
                System.out.println("\nInvalid Input!");
                continue;
            }
        }
        System.out.println("GCD(" + m + ", " + n + "): " + gcdEuclid(m, n));
    }

    public int gcdBrute(int m, int n) {
        for (int i = 1; i <= m && i <= n; i++){
            if (m % i == 0 && n % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public void getGcdBrute() {
        while (isInteger(a)) {
            System.out.print("Enter a number: ");
            a = kb.nextLine();
            if (isInteger(a)) {
                m = Integer.parseInt(a);
                break;
            }
            else {
                System.out.println("\nInvalid Input!");
                continue;
            }
        }
        while (isInteger(b)) {
            System.out.print("Enter another: ");
            b = kb.nextLine();
            if (isInteger(b)) {
                n = Integer.parseInt(b);
                break;
            }
            else {
                System.out.println("\nInvalid Input!");
                continue;
            }
        }
        System.out.println("GCD(" + m + ", " + n + "): " + gcdBrute(m, n));
    }

    public static void main (String args[]) {
        RyanGuyton_P3_GCD gCd = new RyanGuyton_P3_GCD();
        System.out.println(gCd.printIntro());
        Scanner in = new Scanner(System.in);
        String input = "";
        boolean run = true;

        while (run) {
            System.out.print("\nSelect GCD calculation method (B, E, R, Q): ");
            input = in.nextLine();

            if (input.equals("Q") || input.equals("q")) {
                System.out.println("\nClosing program...");
                run = false;
                break;
            }
            else if (input.equals("B") || input.equals("b")) {
                System.out.println("\nSelected: Brute Force (B)");
                gCd.getGcdBrute();
            }
            else if (input.equals("E") || input.equals("e")) {
                System.out.println("\nSelected: Euclid's Algorithm (E)");
                gCd.getGcdEuclid();
            }
            else if (input.equals("R") || input.equals("r")) {
                System.out.println("\nSelected: Recursion (R)");
                gCd.getGcdRecur();
            }
            else {
                System.out.println("\nInvalid Input!");
                continue;
            }
        }
    }
}
