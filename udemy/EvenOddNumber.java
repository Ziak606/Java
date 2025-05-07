package udemy;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String [] args){
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number:--> ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " " + "Number is Even ");
        }
       else{
           System.out.println(num + " "+ "Number is Odd ");
        }

    }
}
