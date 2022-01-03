/*
Program Name: RyanGuyton_09_SumTil0.java
Description: repeated prompts for number until 0 is input, then displays sum and product of all previously entered numbers
Author: Ryan Guyton
Date: 10/16/2021
Version: 01
*/

import java.util.Scanner;
import java.util.ArrayList;
public class RyanGuyton_09_SumTil0 {
    public static void main (String args[]){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        int product = 1;
        System.out.print("Enter a number: ");
        int inputNumber = keyboard.nextInt();

        while (inputNumber != 0){
            numbers.add(inputNumber);
            System.out.print("Enter another number: ");
            inputNumber = keyboard.nextInt();
        }

        for (int i = 0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
            product = product * numbers.get(i);
        }

        System.out.println("Sum of all numbers entered: " + sum);
        System.out.println("Product of all numbers entered: " + product);
    }
}
