/* LABORATORY THREE */
// Date: November 7, 2024

import java.util.Scanner;

class TaskFive {
    public static void main(String[] args) {
        /* Task
            1. Imitate an ATM Machine that allows users to choose
            between view balance, deposit, withdraw, and exit the program.

            2. Error handling must also be included.

            3. Use only while loops and include comments to explain
            each section of the code.
        */

       Scanner scan = new Scanner(System.in);

       int option = 0;
       double balance = 1000.0;

       while (option != 4) {
        System.out.println("Welcome to ATM!");
        System.out.println("1. View Account Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit \n");
        System.out.println("Please select an option (1-4): ");

        if (scan.hasNextInt()) {
            option = scan.nextInt();

            if (option < 1 || option > 4) {
                System.out.println("Invalid option. Please choose one of the four options.");
                scan.next();
            } else {
                switch (option) {
                    case 1:
                        System.out.print("Your current balance is: $" + balance + "\n");
                        break;
                    case 2:
                        System.out.print("Enter the amount to deposit: ");
                        balance += scan.nextDouble();
                        System.out.println("Your current balance is: $" + balance);
                        break;
                    case 3:
                        System.out.print("Enter the amount to withdraw: ");
                        balance -= scan.nextInt();
                        System.out.println("Your current balance is: $" + balance);
                        break;
                }
            }
        } else {
            System.out.println("INVALID: Please enter a number!");
            scan.next();
        }
       }

       System.out.println("Thanks for using our ATM! Goodbye!");
       scan.close();
    }
}