/*
Program Name: RyanGuyton_09_Series.java
Description: program takes integer keyboard input n and calculates sum of nth term in series
Author: Ryan Guyton
Date: 10/16/2021
Version: 01
*/

import java.util.Scanner;
public class RyanGuyton_09_Series {
    public static void main (String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number (0 to quit): ");
        int n = keyboard.nextInt();

        while (n > 0){
            double sum = 2.0;
            for (double i = 1; i <= n; i++){
                if (i % 2 == 1){
                    sum = sum - 1/i;
                }
                else {
                    sum = sum + 1/i;
                }
            }
            System.out.println(sum);
            System.out.print("Enter a number (0 to quit): ");
            n = keyboard.nextInt();
        }

    }
}
