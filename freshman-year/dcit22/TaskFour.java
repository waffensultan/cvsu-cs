/* LABORATORY FOUR */
// Date: October 17, 2024

import java.util.Scanner;

class TaskFour {
    public static void main(String[] args) {
        // Task:
        // 1. Accept two inputs:
        // ---> Their age
        // ---> If they are a student or not (yes/no)

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current age?: ");
        int age = scan.nextInt();
        // So that our program may prompt twice instead of ending on asking for age 
        scan.nextLine();
        
        System.out.println("Are you a student or not? (yes/no): ");
        boolean isStudent = scan.nextLine().toLowerCase().equals("yes");

        int price = 0;

        // Do the proper calculations
        if (age < 12) {
            price = 5;
        } else if (age >= 59) {
            price = 6;
        } else {
            if (isStudent) {
                price = 7;
            } else {
                price = 10;
            }
        }

        // Finally, display the result
        System.out.println("Your ticket price is: $" + price);
    }
}