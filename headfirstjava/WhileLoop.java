package headfirstjava;

public class WhileLoop {
    public static void main (String [] args){
        int x = 1;
        System.out.println("Before the Loop");

        while(x < 4){
            System.out.println("In the Loop");
            System.out.println("Value of x is  " + x);
            x = x + 1;
        }

        System.out.println("This is after the loop");
    }
}






/*
Before the Loop
In the loop
Value of x is 1
In the loop
Value of x is 2
In the loop
Value of x is 3
This is after the loop
 */