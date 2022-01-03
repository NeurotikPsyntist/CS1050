/*
Program Name: RyanGuyton_01_Initials.java
Description: input full name, output full name (last name first) and initials
Author: Ryan Guyton
Date: 09/27/2021
Version: 02
*/

import java.util.Scanner;
public class RyanGuyton_01_Initials {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = scan.nextLine();
        System.out.print("Enter your middle name: ");
        String middle = scan.nextLine();
        System.out.print("Enter your last name: ");
        String last = scan.nextLine();
        char firstInit = first.charAt(0);
        char secondInit = middle.charAt(0);
        char thirdInit = last.charAt(0);

        System.out.println("Your name is: " + last + ", " + first + " " + middle);
        System.out.println("Your initials are: " + firstInit + ". " + secondInit + ". " + thirdInit + ".");
    }
}
