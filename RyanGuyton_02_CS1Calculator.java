/*
Program Name: RyanGuyton_02_CS1Calculator.java
Description: program prompts user for operation and two numbers,
             continues until user stops, then prints all calculation counts.
Author: Ryan Guyton
Date: 11/16/2021
Version: 23
*/

import java.util.Scanner;
public class RyanGuyton_02_CS1Calculator {
    private Scanner kb;
    private int adds;
    private int subs;
    private int multis;
    private int divs;
    private int total_calcs;

    public RyanGuyton_02_CS1Calculator() {
        kb = new Scanner(System.in);
        adds = 0;
        subs = 0;
        multis = 0;
        divs = 0;
        total_calcs = 0;
    }

    // Explains program to user
    public String printIntro() {
        return "First, select an operation:\n";
        return "\nAddition (A)\nSubtraction (S)\nMultiplication (M)"
               + "\nDivision (D)\n\nand then enter two numbers.\n\nThis "
               + "program will continue until you Quit (Q)";
    }

    // Basic calculator (records individual and total operations performed)
    public void calculate() {
        boolean run = true;
        String input = "";
        String op = "";
        int i = 0;
        String num1 = "";
        String num2 = "";
        int n1 = 0;
        int n2 = 0;
        int result = 0;
        boolean calc_complete = false;

        // Select operation or quit (listed options only)
        while (run = true) {
            System.out.print("\nSelect an operation (A, S, M, D or Q): ");
            input = kb.nextLine();
            if (input.equals("Q") || input.equals("q")) {
                System.out.println("\nClosing calculator...\n");
                run = false;
                break;
            }
            else if (input.equals("A") || input.equals("a")) {
                System.out.println("\nSelected operation: Addition (A)");
                op = "+";
            }
            else if (input.equals("S") || input.equals("s")) {
                System.out.println("\nSelected operation: Subtraction (S)");
                op = "-";
            }
            else if (input.equals("M") || input.equals("m")) {
                System.out.println("\nSelected operation: Multiplication (M)");
                op = "*";
            }
            else if (input.equals("D") || input.equals("d")) {
                System.out.println("\nSelected operation: Division (D)");
                op = "/";
            }
            else {
                System.out.println("\nInvalid Input!");
                op = "";
                continue;
            }

            i = 0;
            while (i < 1) {
                System.out.print("\nEnter a number: ");
                num1 = kb.nextLine();
                try {
                    n1 = Integer.parseInt(num1);
                }
                catch (NumberFormatException e) {
                    System.out.println("\nInvalid Input!");
                    continue;
                }
                i = i + 1;
            }

            i = 0;
            while (i < 1) {
                System.out.print("\nEnter another: ");
                num2 = kb.nextLine();
                try {
                    n2 = Integer.parseInt(num2);
                }
                catch (NumberFormatException e) {
                    System.out.println("\nInvalid Input!");
                    continue;
                }
                i = i + 1;
            }

            // Perform chosen operation and add to individual count
            if (op.equals("+")) {
                result = n1 + n2;
                adds = adds + 1;
                calc_complete = true;
            }
            else if (op.equals("-")) {
                result = n1 - n2;
                subs = subs + 1;
                calc_complete = true;
            }
            else if (op.equals("*")) {
                result = n1 * n2;
                multis = multis + 1;
                calc_complete = true;
            }
            else if (op.equals("/")) {
                result = n1 / n2;
                divs = divs + 1;
                calc_complete = true;
            }
            else {
                break;
            }

            // Display result and add to total count
            if (calc_complete = true) {
                System.out.println("\nResult: " + result);
                total_calcs = total_calcs + 1;
            }
            else {
                break;
            }
        }
    }

    // Calculator report of individual operation counts and total count
    public String printReport() {
        return "\nCalculator Report"
               + "\nAddition problems: " + adds
               + "\nSubtraction problems: " + subs
               + "\nMultiplication problems: " + multis
               + "\nDivision problems: " + divs
               + "\nTotal calculations: " + total_calcs;
    }

    public static void main (String args[]) {
        RyanGuyton_02_CS1Calculator calc = new RyanGuyton_02_CS1Calculator();
        System.out.println(calc.printIntro());
        calc.calculate();
        System.out.println(calc.printReport());
    }
}
