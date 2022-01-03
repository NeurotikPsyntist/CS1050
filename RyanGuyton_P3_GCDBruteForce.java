/*
Program Name: RyanGuyton_P3_GCDBruteForce.java
Description: program prompts user for two numbers, calculates gcd and asks to continue.
Author: Ryan Guyton
Date: 12/10/2021
Version: 3
*/

import java.util.Scanner;
public class RyanGuyton_P3_GCDBruteForce {
    public static void main (String args[]) {
        Scanner kb_n = new Scanner(System.in);
        Scanner kb_s = new Scanner(System.in);
        boolean run = true;
        String input = "";
        int m = 0;
        int n = 0;
        int gcd = 0;

        while (run == true){
            input = "";
            System.out.print("Enter a number: ");
            m = kb_n.nextInt();
            System.out.print("Enter another: ");
            n = kb_n.nextInt();

            for (int i = 1; i <= m && i <= n; i++){
                if (m % i == 0 && n % i == 0){
                    gcd = i;
                }
            }

            System.out.println("GCD(" + m + ", " + n + "): " + gcd);
            System.out.print("Continue? (Y/N): ");
            input = kb_s.nextLine();

            if (input.equals("N") || input.equals("n")){
                run = false;
                break;
            }
            else if (input.equals("Y") || input.equals("y")){
                run = true;
            }
            else {
                System.out.println("Invalid Input!");
                continue;
            }
        }
    }
}
