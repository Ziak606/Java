package basics;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Program To Add Two Integer Numbers");
        System.out.print("Enter Number1 : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter Number2 : ");
        int number2 = scanner.nextInt();

        /*
        #Suggestion
        try {
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Please enter valid integers.");
    return; // Exit the program if input is invalid
}
         */
        int result = number1 + number2;

        System.out.println("Sum Of Two Integer Numbers Is : " + result);

        scanner.close();
    }

}
