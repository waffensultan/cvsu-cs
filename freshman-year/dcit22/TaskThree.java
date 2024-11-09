/* LABORATORY THREE */
// Date: October 15, 2024

import java.util.Scanner;

class TaskThree {
    public static void main(String[] args) {
        // Task:
        // 1. Accept user input which will serve as the celsius temperature
        // 2. Conver it to Fahrenheit
        // 3. Using conditional statements, determine whether it is hot or cold.

        Scanner scan = new Scanner(System.in);

        // Prompt the user for their input
        System.out.print("Enter temperature (Celsius): ");
        double celsius = scan.nextDouble();

        // Do the necessary calculations to convert the user input in Celsius to Fahrenheit
        double first_step = celsius * 9;
        double second_step = first_step / 5;
        double final_step  = second_step + 32;

        // Display the results
        System.out.printf("Step 1: " + celsius + " * " + " 9 " + " = " + first_step + "\n");
        System.out.printf("Step 2: " + first_step + " / " + " 5 " + " = " + second_step + " \n");
        System.out.printf("Step 3: " + second_step + " + " + " 32 " + " = " + final_step + " \n");

        // Determine whether the temperature in Fahrenheit form is cold or hot
        if (final_step < 50) {
            System.out.println("The temperature given is cold.");
        } else {
            System.out.println("The temperature given is hot.");
        }

        scan.close();
    }
}