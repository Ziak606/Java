package udemy;

import java.util.Scanner;

public class DayChecker {
    public static void main(String [] args){
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Day...");
        day = sc.nextInt();
        if(day == 1){
            System.out.println("Day Is Monday...");
        }
        else if(day == 2){
            System.out.println("Day Is Tuesday...");
        }
        else if(day == 3){
            System.out.println("Day Is Wednesday...");
        }
        else if(day == 4){
            System.out.println("Day Is Thursday...");
        }
        else if(day == 5){
            System.out.println("Day Is Friday...");
        }
        else if(day == 6){
            System.out.println("Day Is Saturday...");
        }
        else if(day == 7){
            System.out.println("Day Is Sunday...");
        }
        else{
            System.out.println("Enter A Valid Day...");
        }
    }
}
