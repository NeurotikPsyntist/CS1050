/*
Program Name: RyanGuyton_01_PACE.java
Description: input food and calories, output food, calories, and minutes to walk off
Author: Ryan Guyton
Date: 09/27/2021
Version: 02
*/

import java.util.Scanner;
public class RyanGuyton_01_PACE {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("What did you eat? ");
        String food = scan.nextLine();
        System.out.print("How many calories? ");
        int calories = scan.nextInt();
        int minutes = (int) (calories / 5.4);

        System.out.println("Food: " + food);
        System.out.println("Calories: " + calories);
        System.out.println("Minutes to walk: " + minutes);
    }
}
