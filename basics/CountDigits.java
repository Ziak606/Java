package basics;

import java.util.Scanner;

/*
 *  Write a program that counts the number of digits in a given integer.
 */
public class CountDigits {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt(); // Read the integer input

        // Initialize count of digits
        int count = 0;

        // Handle the case for zero, which has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Use the absolute value to handle negative numbers
            number = Math.abs(number);

            // Count digits
            while (number > 0) {
                number /= 10; // Divide the number by 10
                count++; // Increment the digit count
            }
        }

        System.out.println("The number of digits is: " + count);
        sc.close(); // Close the scanner
    }


    }

