/*
Program Name: RyanGuyton_09_Palindrome.java
Description: program determines whether keyboard input is a palindrome
Author: Ryan Guyton
Date: 10/16/2021
Version: 01
*/

import java.util.Scanner;
public class RyanGuyton_09_Palindrome {
    public static void main (String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = keyboard.nextLine();
        int inputLen = input.length();

        while(inputLen > 0){
            String inputText = input.replaceAll("[^A-Za-z0-9]+", "").toUpperCase();
            StringBuilder convertText = new StringBuilder(inputText).reverse();
            String reverseText = convertText.toString();
            if (inputText.equals(reverseText) == true){
                System.out.println("That is a palindrome!");
            }
            else{
                System.out.println("That is not a palindrome.");
            }
            System.out.print("Enter a new word or phrase: ");
            input = keyboard.nextLine();
            inputLen = input.length();
        }
    }
}
