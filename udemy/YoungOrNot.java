package udemy;

import java.util.Scanner;

public class YoungOrNot {
    public static void main(String [] args){
        /*
        Age = 14 to 55 then person is young
        Age = Greater then 55 person is old
         */

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a person age : ");
        age = sc.nextInt();

        if(age >= 14 && age <=55){
            System.out.println("Person is Young");
        }
        else if(age > 55){
            System.out.println("Person is Old");
        }
        else{
            System.out.println("Enter A Valid Age");
        }
    }
}
