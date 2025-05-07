package basics;

import java.util.Scanner;

public class EvenOdd {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find whether the number is even or odd: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even");
        }
        else{
                System.out.println("Number is odd");
            }
            scanner.close();
        }
    }



/*
try {
    int number = scanner.nextInt();
    // Your logic here...
} catch (InputMismatchException e) {
    System.out.println("Please enter a valid integer.");
    return; // Exit the program if input is invalid
}
 */
