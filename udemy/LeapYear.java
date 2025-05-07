package udemy;

import java.util.Scanner;

public class LeapYear {

    public static void main(String [] args){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Year To Check Leap Year :- ");
        year = sc.nextInt();
        sc.close();

        if ((year % 4 == 0 && year % 100 != 0) || ((year % 400 == 0))){

            System.out.println("Year Is Leap Year");
        }
        else{
            System.out.println("Not A Leap Year");
        }
    }
}
