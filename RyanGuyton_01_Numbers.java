/*
Program Name: RyanGuyton_01_Numbers.java
Description: input two numbers, output sum and product
Author: Ryan Guyton
Date: 09/27/2021
Version: 02
*/

import java.util.Scanner;
public class RyanGuyton_01_Numbers {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scan.nextInt();
        System.out.print("Enter another number: ");
        int b = scan.nextInt();
        int sum = a + b;
        int product = a * b;

        System.out.println("Number 1: " + a);
        System.out.println("Number 2: " + b);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}
