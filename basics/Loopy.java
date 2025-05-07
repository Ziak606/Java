package basics;

/*
% java Loopy
Before the Loop
In the loop
Value of x is 1
In the loop
Value of x is 2
In the loop
Value of x is 3
This is after the loop
 */


public class Loopy {
    public static void main (String [] args){
        int x = 1;
        System.out.println("Before the loop");
        while(x == 4) {
            System.out.println("Value of x" +x);
            x++;

        }
        System.out.println("After the loop");
    }
}
