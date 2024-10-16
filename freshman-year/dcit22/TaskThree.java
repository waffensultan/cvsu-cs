/* LABORATORY THREE */
// Date: October 15, 2024

import java.util.Scanner;

class TaskThree {
    public static void main(String[] args) {
        // You are given a task to make a Java program that accepts user input (Celsius)
        // you are tasked to convert the user input to Fahrenheit
        // and use conditional statements to determine whether it is hot or cold
        // Additional: You must also use comments to explain your code

        // A reference or collects/takes the user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user for their input
        System.out.print("Enter temperature (Celsius): ");
        double celsius = scan.nextDouble();

        // Do the necessary calculations to convert the user input in Celsius to Fahrenheit
        double first_step = celsius * 9;
        double second_step = step_one / 5;
        double final_step  = step_two + 32;

        // Display the results
        System.out.printf("Step 1: " + celsius + " * " + " 9 " + " = " + first_step + "\n");
        System.out.printf("Step 2: " + first_step + " / " + " 5 " + " = " + second_step + " \n");
        System.out.printf("Step 3: " + second_step + " + " + " 32 " + " = " + final_step + " \n");

        // Determine whether the temperature in Fahrenheit form is cold or hot
        if (step_three < 50) {
            System.out.println("The temperature given is cold.");
        } else {
            System.out.println("The temperature given is hot.");
        }
    }
}