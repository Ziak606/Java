package udemy;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String [] args){
        /*
       n= 153
        3x3x3+5x5x5+1x1x1 =153
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number");
        int inputNumber = scan.nextInt();

        int originalNumber = inputNumber ;
        int sum=0;
        int reminder;
        while(inputNumber >0)
        {
            reminder=inputNumber %10;
            inputNumber =inputNumber /10;

            sum=sum+reminder*reminder*reminder;
        }
        if(sum==originalNumber ){
            System.out.println(originalNumber   + " Its a Armstrong Number");
        }
        else{
            System.out.println(originalNumber   + " Its not a Armstrong Number");
        }


    }
}
